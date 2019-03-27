package com.honglamgiang.jiwoo.model;

/**
 * ImageData
 */
public class ImageData {
    private String base64data;
    private Long requestFormId;
    private Integer imageType;


    public String getBase64data() {
        return this.base64data;
    }

    public void setBase64data(String base64data) {
        this.base64data = base64data;
    }

    public Long getRequestFormId() {
        return this.requestFormId;
    }

    public void setRequestFormId(Long requestFormId) {
        this.requestFormId = requestFormId;
    }

    public Integer getImageType() {
        return this.imageType;
    }

    public void setImageType(Integer imageType) {
        this.imageType = imageType;
    }

}