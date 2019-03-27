package com.honglamgiang.jiwoo.enitty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Banner
 */
@Entity
@Table(name="banner")
@NamedQuery(name="Banner.findAll", query="SELECT b FROM Banner b")
public class Banner {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="banner_id")
    private Long bannerId;

    @Column(name="banner_name")
    private String bannerName;

    @Column(name="banner_image")
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