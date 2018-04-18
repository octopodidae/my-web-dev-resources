/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebdevresources.models;

/**
 *
 * @author blaurancin
 */
public class SQLConstant {

    /**
     * Resource Queries
     */
    protected static final String SELECT_ALL_RESOURCES = "SELECT * FROM resource";
    
    protected static final String SELECT_ALL_POPULAR_RESOURCES = "SELECT * FROM resource where popular=true";
    
    protected static final String SELECT_ALL_RESOURCES_BY_LANGUAGE = "SELECT * FROM resource where language=?";
    
    protected static final String INSERT_RESOURCE = "INSERT INTO resource("
                + "resource_id, title, description, url, image_path, popular, language) VALUES (DEFAULT,?,?,?,?,?,?)";
       
        
    protected static final String UPDATE_RESOURCE = "UPDATE resource SET "
            + "title= ?, description=?,  url=?, image_path=?, popular=?, support=?, language=? WHERE resource_id = ?";
    
    
    protected static final String DELETE_RESOURCE = "DELETE resource WHERE resource_id = ?";

  
    /**
     * Connection querie
     */
    protected static final String SELECT_ADMINISTRATOR= "select * from administrator where "
            + "admin_email=? and admin_password=?";

}
