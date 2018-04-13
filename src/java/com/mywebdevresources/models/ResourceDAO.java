/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebdevresources.models;

import com.mywebdevresources.javabeans.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blaurancin
 */
public class ResourceDAO extends CommonDAO<Resource> {

    ArrayList<Resource> resourceList = new ArrayList<>();
    Resource resource = null;

    public ResourceDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Resource create(Resource resource) {
        try {

            //Creation of the PreparedStatement
            PreparedStatement statement = connection.prepareStatement(SQLConstant.INSERT_RESOURCE);

            //Insert parameter at the location of the question mark in the SQL Query
            // statement.setString(1, "DEFAULT");
            statement.setString(1, resource.getTitle());
            statement.setString(2, resource.getDescription());
            statement.setString(3, resource.getUrl());
            statement.setString(4, resource.getImage_path());
            statement.setBoolean(5, resource.isPopular());
            statement.setString(6, resource.getSupport());
            statement.setString(7, resource.getLanguage());

            //Executing the preparedStatement
            statement.executeUpdate();
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(ResourceDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return resource;
    }

    @Override
    public boolean delete(Resource resource) {
        try {

            //Creation of the PreparedStatement
            PreparedStatement statement = connection.prepareStatement(SQLConstant.DELETE_RESOURCE);

            statement.setInt(1, resource.getResource_id());

            //Executing and close the preparedStatement
            statement.executeUpdate();
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(ResourceDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return true;
    }

    @Override
    public boolean update(Resource resource) {

        try {

            //Creation of the PreparedStatement
            PreparedStatement statement = connection.prepareStatement(SQLConstant.UPDATE_RESOURCE);

            //Insert parameter at the location of the question mark in the SQL Query
            // statement.setString(1, "DEFAULT");
            statement.setString(1, resource.getTitle());
            statement.setString(2, resource.getDescription());
            statement.setString(3, resource.getUrl());
            statement.setString(4, resource.getImage_path());
            statement.setBoolean(5, resource.isPopular());
            statement.setString(6, resource.getSupport());
            statement.setString(7, resource.getLanguage());
            statement.setInt(8, resource.getResource_id());

            //Executing the preparedStatement
            statement.executeUpdate();
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(ResourceDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
        return true;
    }

    @Override
    public Resource findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Resource> findAll() {
        try {
            ResultSet result = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)
                    .executeQuery(SQLConstant.SELECT_ALL_RESOURCES);

            if (result.first()) {

                //on intialise les objets auteurs
                resource = new Resource(result.getInt("resource_id"), result.getString("title"), result.getString("description"), 
                                        result.getString("url"), result.getString("image_path"), result.getBoolean("popular"), 
                                        result. getString("support"), result.getString("language"));

               resourceList.add(resource);

                while (result.next()) {
                    //on intialise les objets auteurs
                    resource = new Resource(result.getInt("resource_id"), result.getString("title"), result.getString("description"), 
                                        result.getString("url"), result.getString("image_path"), result.getBoolean("popular"), 
                                        result. getString("support"), result.getString("language"));

                    resourceList.add(resource);
                }
                result.close();

            }
        } catch (SQLException ex) {
            Logger.getLogger(ResourceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resourceList;

    }

//    public static void main(String args[]) {
//
//        List<Author> test;
//        Author auth;
//
//        AuthorDAO categDAO = new AuthorDAO(ConnectionBDPostgreSQL.getInstance());
//        test = categDAO.findAll();
//
//        Iterator<Author> it = test.iterator();
//
//        while (it.hasNext()) {
//            auth = (Author) it.next();
//            System.out.println(auth.getAuthor_lastname() + " " + auth.getAuthor_firstname());
//        }
//
//    }

}
