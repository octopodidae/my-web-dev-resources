/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebdevresources.actions;

import com.mywebdevresources.javabeans.Resource;
import com.mywebdevresources.models.ConnectionBDPostgreSQL;
import com.mywebdevresources.models.ResourceDAO;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author blaurancin
 */
public class ResourceAction extends ActionSupport {

    public List<Resource> resourceList = null;
    private Resource resource;
    private ResourceDAO resourceDAO;
    public String titleInfo = null;
    public String languageInfo = null;
    public String imgInfo = null;

    public String displayAllResources() throws Exception {

        ResourceDAO resourceDAO = new ResourceDAO(ConnectionBDPostgreSQL.getInstance());
        resourceList = resourceDAO.findAll();

        return SUCCESS;
    }

 
    public String register() throws Exception {   
        
        HttpServletRequest req = ServletActionContext.getRequest();
        String title = (String) req.getParameter("title");
        String desc = (String)req.getParameter("desc");
        String url = (String) req.getParameter("url");
        String img = (String)req.getParameter("img");
        img = "images/" + img;
        String language = (String)req.getParameter("language");
        boolean popular_ = req.getParameter( "popular" ) != null;
        
        imgInfo = img;
        titleInfo = title;
        languageInfo = language;
         
        if( (!imgInfo.trim().isEmpty()) && (!titleInfo.trim().isEmpty()) &&(!languageInfo.trim().isEmpty()) ){
            
            this.resource =  new Resource(title, desc, url, img, popular_, language);
            this.resourceDAO = new ResourceDAO(ConnectionBDPostgreSQL.getInstance());
            resourceDAO.create(resource);
               
//            if(this.resource == null) {
//                addActionMessage("Error connect database. Contact your administrator!");
//                return ERROR;
//            }
            
            addActionMessage("Successfully added!");
            return SUCCESS;
            
        }
        
        else{
            addActionError("Invalid Resource information. Resource can't be added Please try again!");
            return ERROR;
        }
    }

}
