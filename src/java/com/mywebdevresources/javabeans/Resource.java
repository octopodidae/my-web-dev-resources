/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebdevresources.javabeans;

/**
 *
 * @author blaurancin
 */
public class Resource {
    
    private int resource_id;
    private String title;
    private String description;
    private String url;
    private String image_path;
    private boolean popular;
    private String support;
    private String language;

    public Resource(int resource_id, String title, String description, String url, String image_path, boolean popular, String support, String language) {
        this.resource_id = resource_id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.image_path = image_path;
        this.popular = popular;
        this.support = support;
        this.language = language;
    }
    
    

    public int getResource_id() {
        return resource_id;
    }

    public void setResource_id(int resource_id) {
        this.resource_id = resource_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
