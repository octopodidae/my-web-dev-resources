<%-- 
    Document   : allresources
    Created on : 12 avr. 2018, 17:15:13
    Author     : blaurancin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<s:if test="%{resourceList.size()>0}">

    <s:iterator status="status" value="resourceList">

        <a href="<s:property value='getUrl()'/>" target="_blank">
            <li class="flex-item" data-language ="<s:property value='getLanguage()'/>" >

                <img  src="<s:property value='getImage_path()'/>" alt="image" data-toggle="tooltip" data-html="true" 
                      title="<p style='color: #68D0FE; font-size: 1.5em';><s:property value='getTitle()'/></p>
                      <p style='color: #68D0FE; font-style: italic;'>(id : <s:property value='getResource_id()'/>)</p>
                      <p style='color: #68D0FE; font-style: italic;'><s:property value='getDescription()'/></p>"
                      data-placement="auto" data-animation="true">

            </li>
        </a>

    </s:iterator>


</s:if>

