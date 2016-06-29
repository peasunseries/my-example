package com.zengcode.model;

public class AdvertImageModel {
    private String thumbnailUrl;
    private String bannerUrl;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    @Override
    public String toString() {
        return "AdvertImageModel{" +
                "thumbnailUrl='" + thumbnailUrl + '\'' +
                ", bannerUrl='" + bannerUrl + '\'' +
                '}';
    }
}
