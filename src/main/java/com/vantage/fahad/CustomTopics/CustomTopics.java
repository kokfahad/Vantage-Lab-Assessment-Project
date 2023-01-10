package com.vantage.fahad.CustomTopics;

import com.vantage.fahad.model.Topic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CustomTopics {

    private List<Topic> customTopics = new ArrayList<>();
    public List<Topic> getCustomTopics() {
        return customTopics;
    }
    public CustomTopics() throws MalformedURLException {
        this.build();
    }

    private void build() throws MalformedURLException {
        Topic allergyIntolerance = new Topic();
        allergyIntolerance.setUrl(new URL("https://www.cochranelibrary.com/search?p_p_id=scolarissearchresultsportlet_WAR_scolarissearchresults&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_scolarissearchresultsportlet_WAR_scolarissearchresults_displayText=Allergy+%26+intolerance&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchText=Allergy+%26+intolerance&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchType=basic&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryField=topic_id&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchBy=13&_scolarissearchresultsportlet_WAR_scolarissearchresults_orderBy=displayDate-true&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetDisplayName=Allergy+%26+intolerance&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryTerm=z1506030924307755598196034641807&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetCategory=Topics"));
        allergyIntolerance.setTopic("Allergy & intolerance");
        customTopics.add(allergyIntolerance);

        Topic bloodDisorders = new Topic();
        bloodDisorders.setUrl(new URL("https://www.cochranelibrary.com/search?p_p_id=scolarissearchresultsportlet_WAR_scolarissearchresults&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_scolarissearchresultsportlet_WAR_scolarissearchresults_displayText=Blood+disorders&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchText=Blood+disorders&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchType=basic&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryField=topic_id&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchBy=13&_scolarissearchresultsportlet_WAR_scolarissearchresults_orderBy=displayDate-true&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetDisplayName=Blood+disorders&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryTerm=z1209270503555436197730382260671&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetCategory=Topics"));
        bloodDisorders.setTopic("Blood Disorders");
        customTopics.add(bloodDisorders);

        Topic cancer = new Topic();
        cancer.setUrl(new URL("https://www.cochranelibrary.com/search?p_p_id=scolarissearchresultsportlet_WAR_scolarissearchresults&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_scolarissearchresultsportlet_WAR_scolarissearchresults_displayText=Cancer&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchText=Cancer&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchType=basic&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryField=topic_id&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchBy=13&_scolarissearchresultsportlet_WAR_scolarissearchresults_orderBy=displayDate-true&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetDisplayName=Cancer&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryTerm=z1209270504325056240433870825568&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetCategory=Topics"));
        cancer.setTopic("Cancer");
        customTopics.add(cancer);

        Topic childHealth = new Topic();
        childHealth.setUrl(new URL("https://www.cochranelibrary.com/search?p_p_id=scolarissearchresultsportlet_WAR_scolarissearchresults&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_scolarissearchresultsportlet_WAR_scolarissearchresults_displayText=Child+health&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchText=Child+health&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchType=basic&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryField=topic_id&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchBy=13&_scolarissearchresultsportlet_WAR_scolarissearchresults_orderBy=displayDate-true&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetDisplayName=Child+health&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryTerm=z1209270506397401105880747733814&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetCategory=Topics"));
        childHealth.setTopic("Child Health");
        customTopics.add(childHealth);

        Topic complementaryAndAlternativeMedicine = new Topic();
        complementaryAndAlternativeMedicine.setUrl(new URL("https://www.cochranelibrary.com/search?p_p_id=scolarissearchresultsportlet_WAR_scolarissearchresults&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_scolarissearchresultsportlet_WAR_scolarissearchresults_displayText=Complementary+%26+alternative+medicine&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchText=Complementary+%26+alternative+medicine&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchType=basic&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryField=topic_id&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchBy=13&_scolarissearchresultsportlet_WAR_scolarissearchresults_orderBy=displayDate-true&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetDisplayName=Complementary+%26+alternative+medicine&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryTerm=z1209270517013654280662502828396&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetCategory=Topics"));
        complementaryAndAlternativeMedicine.setTopic("Complementary & alternative medicine");
        customTopics.add(complementaryAndAlternativeMedicine);

        Topic consumerAndCommunicationStrategies = new Topic();
        consumerAndCommunicationStrategies.setUrl(new URL("https://www.cochranelibrary.com/search?p_p_id=scolarissearchresultsportlet_WAR_scolarissearchresults&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_scolarissearchresultsportlet_WAR_scolarissearchresults_displayText=Consumer+%26+communication+strategies&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchText=Consumer+%26+communication+strategies&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchType=basic&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryField=topic_id&_scolarissearchresultsportlet_WAR_scolarissearchresults_searchBy=13&_scolarissearchresultsportlet_WAR_scolarissearchresults_orderBy=displayDate-true&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetDisplayName=Consumer+%26+communication+strategies&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetQueryTerm=z1209270520546298433878661077335&_scolarissearchresultsportlet_WAR_scolarissearchresults_facetCategory=Topics"));
        consumerAndCommunicationStrategies.setTopic("Consumer & communication strategies");
        customTopics.add(consumerAndCommunicationStrategies);
    }
}
