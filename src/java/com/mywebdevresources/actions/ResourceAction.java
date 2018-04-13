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

    ResourceDAO resourceDAO;

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

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

        resourceDAO = new ResourceDAO(ConnectionBDPostgreSQL.getInstance());
        resourceList = resourceDAO.findAll();

        return SUCCESS;
    }

}
