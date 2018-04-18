<%-- 
    Document   : DisplayResourceAdded
    Created on : 17 avr. 2018, 17:34:36
    Author     : blaurancin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Web Dev Resources</title>

        <!-- Boostrap : Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Boostrap : Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

        <!--        <link href='https://fonts.googleapis.com/css?family=Gloria+Hallelujah' rel='stylesheet' type='text/css'>-->

        <link href="css/header.css" rel="stylesheet" type="text/css"/>

        <link href="css/footer-distributed-with-address-and-phones.css" rel="stylesheet" type="text/css"/>

        <!-- jQuery -->
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>

        <!-- Boostrap : Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <style>

            center{
                margin-top: 200px;
            }

            .frame {  
                height: 160px; /*can be anything*/
                width: 160px; /*can be anything*/
                position: relative;
            }
            .frame > img {  
                max-height: 100%;  
                max-width: 100%; 
                width: auto;
                height: auto;
                position: absolute;  
                top: 0;  
                bottom: 0;  
                left: 0;  
                right: 0;  
                margin: auto;
            }

        </style>

    </head>

    <body style="background: radial-gradient(circle farthest-corner at 200px 0, #414141, #000) no-repeat center center fixed;">

        <s:include value="/jsp/template/header-admin.jsp" />

    <center style="color: #68D0FE;">

        <p>
        <h4>Resource information</h4>
        <p>Title : <s:property value="title"/></p>
        <div class="frame">
            <img src="<s:property value='img'/>" alt="image">
        </div>
        <p>Language : <s:property value="language"/></p>

        Successfully added!
    </p>

</center>

<script>



</script>





</body>
