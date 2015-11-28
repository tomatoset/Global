package com.tomatoset.app.models;


public class MenuFood {
    String name;
    String sum;
    int photoId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public MenuFood(String name, String sum, int photoId) {
        this.name = name;
        this.sum = sum;
        this.photoId = photoId;
    }
}
