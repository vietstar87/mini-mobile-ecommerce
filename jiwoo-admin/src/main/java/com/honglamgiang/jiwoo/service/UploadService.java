package com.honglamgiang.jiwoo.service;

import java.io.FileOutputStream;
import java.util.Base64;


import org.springframework.stereotype.Service;

/**
 * UploadService
 */
@Service
public class UploadService {

    // private final static String UPLOAD_FOLDER_PATH = "c:/tmp/";
    private final static String UPLOAD_FOLDER_PATH = "C:/Users/tranq/Git/mini-mobile-ecommerce/jiwoo-admin/src/main/resources/static/upload/";

    public Boolean convertBase64StringToImage(String encodedString, String fileName){
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        try {
            try (FileOutputStream stream = new FileOutputStream(UPLOAD_FOLDER_PATH + fileName)) {
                stream.write(decodedBytes);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}