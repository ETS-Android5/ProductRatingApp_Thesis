package org.tensorflow.lite.examples.classification.model;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {
    private String userEmail;
    private List<RecommendedList> rProducts= new ArrayList<>();

    public Recommendation(String userEmail, List<RecommendedList> recommendedLists) {
        this.userEmail = userEmail;
        this.rProducts = recommendedLists;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public List<RecommendedList> getrProducts() {
        return rProducts;
    }

    public void setrProducts(List<RecommendedList> recommendedLists) {
        this.rProducts = recommendedLists;
    }
}
