package com.honglamgiang.jiwoo.service;

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
    
}