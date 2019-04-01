package com.honglamgiang.jiwoo.service;

import com.honglamgiang.jiwoo.enitty.Banner;
import com.honglamgiang.jiwoo.model.BannerModel;
import com.honglamgiang.jiwoo.repository.BannerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * BannerService
 */
@Service
public class BannerService {
    @Autowired
    BannerRepository bannerRepository;
    
    public BannerModel getBannerById(Long bannerId) {
        BannerModel returnModel = new BannerModel();
        Banner bannerEntity = bannerRepository.findById(bannerId).get();
        returnModel.setBannerId(bannerEntity.getBannerId());
        returnModel.setBannerName(bannerEntity.getBannerName());
        returnModel.setBannerImage(bannerEntity.getBannerImage());
        return returnModel;
    }

    public Long editBanner(BannerModel bannerModel) {
        Banner bannerEntity = bannerRepository.findById(bannerModel.getBannerId()).get();
        bannerEntity.setBannerName(bannerModel.getBannerName() != null ? bannerModel.getBannerName() : bannerEntity.getBannerName());
        bannerEntity.setBannerImage(bannerModel.getBannerImage() != null ? bannerModel.getBannerImage() : bannerEntity.getBannerImage());
        Banner savedBanner = bannerRepository.save(bannerEntity);
        return savedBanner.getBannerId();
    }

    public Long addBanner(BannerModel bannerModel) {
        Banner bannerEntity = new Banner();
        bannerEntity.setBannerName(bannerModel.getBannerName());
        bannerEntity.setBannerImage(bannerModel.getBannerImage());
        Banner savedBanner = bannerRepository.save(bannerEntity);
        return savedBanner.getBannerId();
    }

}