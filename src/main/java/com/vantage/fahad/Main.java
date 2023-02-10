package com.vantage.fahad;

import com.vantage.fahad.CustomTopics.CustomTopics;
import com.vantage.fahad.model.Article;
import com.vantage.fahad.model.Topic;

import java.io.*;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("**************** Cochrane Library *****************");
        System.out.println();
        System.out.println("Press a number between 0-5 to choose a topic:");
        Scanner scanner = new Scanner(System.in);
        List<Topic> topicList = new CustomTopics().getCustomTopics();

        //displaying all custom topics
        StringBuilder topicOptions = displayTopicOptions(topicList);
        int userChoiceNumber = userChoiceInput(topicOptions);

        Topic topic = topicList.get(userChoiceNumber);
        // get fileName that user wants to save as
        System.out.println("Enter the name of the file to save as");
        String fileName = scanner.nextLine().trim();

        String numberOfResults= "0";
        List<String> pageContent = new ArrayList<>();
        List<Article> articles = new ArrayList<>();

        //building connection and creating article object
        numberOfResults = buildConnectionAndCreateArticleObject(topic, topicList, userChoiceNumber, numberOfResults, pageContent, articles);

        //writing all articles in files
        writtingArticlesInFiles(fileName,numberOfResults, topicList, userChoiceNumber, articles);

    }


    public static StringBuilder displayTopicOptions(List<Topic> topicList){

        // To display all the topic options from 0-5
        StringBuilder topicOptions = new StringBuilder();
        int i = 0;
        for(Topic topic : topicList){
            if(topicList.indexOf(topic) != 0){
                topicOptions.append(" , ");
            }

            topicOptions.append(i);
            topicOptions.append(" - ");
            topicOptions.append(topic.getTopic());
            i++;
        }
        // print out all topics
        System.out.println(topicOptions.toString());
        return topicOptions;
    }

    public static int userChoiceInput(StringBuilder topicOptions){
        Scanner scanner = new Scanner(System.in);
        // get user choice
        int userChoiceNumber = -1;
        boolean checkInt = true;
        while(checkInt)
            try {
                String userChoice = scanner.nextLine().trim();
                userChoiceNumber = Integer.parseInt(userChoice);
                checkInt = false;
            }catch (NumberFormatException e) {
                System.out.println("Your number is invalid. Please enter a valid number");
                System.out.println(topicOptions.toString());
            }
        return userChoiceNumber;
    }

    public static void writtingArticlesInFiles(String fileName,String numberOfResults, List<Topic> topicList,
                                               int userChoiceNumber,List<Article> articles ) throws IOException {
        if(articles.size() == 0){
            return;
        }

        FileWriter writer = new FileWriter(fileName + ".txt");
        writer.write("Number of Results: " + numberOfResults + " for Search Topic: " + topicList.get(userChoiceNumber).getTopic());
        writer.write("\r\n");
        writer.write("Showing only first 25 results from first page. ");
        writer.write("\r\n");
        writer.write("\r\n");
        for ( Article article: articles) {
            writer.write(article.getUrl() + " | " + article.getTopic() + " | " + article.getTitle() + " | " + article.getAuthor() + " | " + article.getDate());
            writer.write("\r\n");
            writer.write("\r\n");
        }
        writer.close();
        System.out.println("text file: " + fileName + " created");

    }

    public static String buildConnectionAndCreateArticleObject(Topic topic,List<Topic> topicList, int userChoiceNumber,
                                                             String numberOfResults, List<String> pageContent, List<Article> articles) throws IOException {
        // build connection
        HttpURLConnection urlConnection = (HttpURLConnection)topic.getUrl().openConnection();

        if(urlConnection.getResponseCode() == 200){
            System.out.println("Connection Successfull, Crawling " + topicList.get(userChoiceNumber).getTopic());
            InputStream stream = urlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            String line = bufferedReader.readLine();
            while(line != null) {
//                System.out.println(line);
                // Get Number Of Search Results
                if(line.contains("<span class=\"results-number\">")){
                    String extractResults = line.substring(line.indexOf("<span class=\"results-number\">"));
                    numberOfResults = extractResults.substring(29, extractResults.indexOf("</span")).trim();
                }
                // add all items from starting from search results body from html
                if(line.contains("<div class=\"search-results-section-body\">")){
                    String[] stringArray = line.split("<div class=\"search-results-item-body\">");
                    for(String str : stringArray){
                        pageContent.add(str);
                    }
                    pageContent.remove(0);

                    // iterate through pageContent list to create article objects
                    for(String str : pageContent){
                        Article article = new Article();
                        article.setTopic(topic.getTopic());
                        // get link
                        String link = "https://www.cochranelibrary.com" + str.substring(str.indexOf("/cdsr"), str.indexOf("full")) + "full";
                        article.setUrl(link.trim());
                        // get title
                        String title = str.substring(str.indexOf("full")+ 6, str.indexOf("</a>"));
                        article.setTitle(title.trim());
                        // get authors
                        String authors = str.substring(str.indexOf("authors") + 15, str.indexOf("</div>"));
                        article.setAuthor(authors.trim());
                        // get publication date
                        String tempString = str.substring(str.indexOf("date") + 12);
                        String dateString = tempString.substring(0, tempString.indexOf("</div>"));
                        article.setDate(dateString.trim());

                        // add article to list
                        articles.add(article);
                    }
                }
                line = bufferedReader.readLine();
            }
        }else{
            System.out.println("Connection failed, Code " + urlConnection.getResponseCode());
        }
        return numberOfResults;
    }
}
