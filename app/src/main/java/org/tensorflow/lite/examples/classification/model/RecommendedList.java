package org.tensorflow.lite.examples.classification.model;

public class RecommendedList {
  private String productName;
  private String photoUrl;
  private int productId;
  private int categoryId;

    public RecommendedList(String productName, int productId, int categoryId) {
        this.productName = productName;
        this.categoryId = categoryId;
        this.photoUrl = photoUrl;
        this.productId = productId;
    }

    public RecommendedList() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
