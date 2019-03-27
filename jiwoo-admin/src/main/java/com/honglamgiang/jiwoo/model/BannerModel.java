package com.honglamgiang.jiwoo.model;

/**
 * BannerModel
 */
public class BannerModel {
    private Long bannerId;
    private String bannerName;
    private String bannerImage;

    public Long getBannerId() {
        return this.bannerId;
    }

    public void setBannerId(Long bannerId) {
        this.bannerId = bannerId;
    }

    public String getBannerName() {
        return this.bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public String getBannerImage() {
        return this.bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }
    
}