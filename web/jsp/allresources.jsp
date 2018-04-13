<%-- 
    Document   : allresources
    Created on : 12 avr. 2018, 17:15:13
    Author     : blaurancin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<ul class="flex-container">

    <s:if test="%{resourceList.size()>0}">

        <s:iterator status="status" value="resourceList">
            
            <s:if test="(#status.index %  8) == 0 ">
                <p class=breaker></p>
            </s:if>
            
            <li class="flex-item" data-language ="<s:property value='getLanguage()'/>">
                <div class="info">
                    <a href="<s:property value='getUrl()'/> " target="blank"><h3><s:property value='getTitle()'/></h3></a>
                </div>
                <img src="<s:property value='getImage_path()'/>" alt="image">
               
            </li>
            
        </s:iterator>


    </s:if>

</ul>

