package org.tensorflow.lite.examples.classification;

import org.tensorflow.lite.examples.classification.model.Product;
import org.tensorflow.lite.examples.classification.model.RecommendedList;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

public class AppData
{
    @Singleton
    public static Product currentProduct = new Product();
    @Singleton
    public static List<RecommendedList> rProducts = new ArrayList<>();
    public static String PRODUCT_NAME = "DOVE";
}
