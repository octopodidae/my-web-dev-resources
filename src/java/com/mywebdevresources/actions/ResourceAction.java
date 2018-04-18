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

    //ResourceDAO resourceDAO;
    
    private Resource resource;
    private ResourceDAO resourceDAO;

//    public List<Resource> getResourceList() {
//        return resourceList;
//    }
//
//    public void setResourceList(List<Resource> resourceList) {
//        this.resourceList = resourceList;
//    }
    
//    public Resource getResource() {
//        return resource;
//    }
//
//    public void setResource(Resource resource) {
//        this.resource = resource;
//    }
    

    /*public String execute() throws Exception {
        try {

            bookDAO = new BookDAO(ConnectionBDPostgreSQL.getInstance());
            bookList = bookDAO.findAllBookOrderByAuthorASC();
            Book mybook = new Book();

            Iterator<Book> it = bookList.iterator();

            while (it.hasNext()) {

                mybook = (Book) it.next();
                System.out.println(" Book " + mybook.getTitle().toString() + " "
                        + mybook.getAuthor().get(0).getAuthor_firstname()
                        + mybook.getCategory().getCategory_name());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return SUCCESS;
    }*/

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
        String popularString = (String)req.getParameter("popular");
        Boolean popular;
        if (popularString.equals("on")){
            popular = true;
        } else {
            popular = false;
        }
        String language = (String)req.getParameter("language");

        
        this.resource =  new Resource(title, desc, url, img, popular, language);
             
        this.resourceDAO = new ResourceDAO(ConnectionBDPostgreSQL.getInstance());
        resourceDAO.create(resource);
         
        if(resource.getTitle()!= null && resource.getImage_path()!= null &&  resource.getUrl()!= null){
            return SUCCESS;
        }else{
            addActionError("Invalid Resource information. Resource can't be added "
                    + "Please try again!");
            return ERROR;
         }

            //return SUCCESS;

    }

}
