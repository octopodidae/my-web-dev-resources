<%-- 
    Document   : crud
    Created on : 17 avr. 2018, 11:53:00
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

            .nav-pills>li.active>a, .nav-pills>li.active>a:focus, .nav-pills>li.active>a:hover {
                background-color:  #68D0FE;
            }

            .nav>li>a {
                color:  #68D0FE;
            }
            .btn {
                background-color:  #68D0FE;
                color: white;
            }

            input[type="checkbox"] {
                display: inline-block;
            }

        </style>

    </head>

    <body style="background: radial-gradient(circle farthest-corner at 200px 0, #414141, #000) no-repeat center center fixed;">

        <s:include value="/jsp/template/header-admin.jsp" />

        <div class="container" style="margin-top: 100px;">

            <ul class="nav nav-pills nav-justified">
                <li class="active">
                    <a data-toggle="tab" href="#add">ADD RESOURCE</a>
                </li>
                <li>
                    <a data-toggle="tab" href="#update">UPDATE RESOURCE</a>
                </li>
                <li>
                    <a data-toggle="tab" href="#delete">DELETE RESOURCE</a>
                </li>
            </ul>
            <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade in active" id="add">
                    <br><br>
                    <form action="addResource" method="post">
                        <div class="form-group">
                            <label for="title">Title</label>
                            <input type="text" class="form-control" name="title" id="title" placeholder="Title of the resource">
                        </div>
                        <div class="form-group">
                            <label for="desc">Description</label>
                            <textarea class="form-control" id="desc" name="desc" rows="3" placeholder="Description of the resource"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="url">Url</label>
                            <input type="url" class="form-control" name="url" id="url" placeholder="Url of the resource">
                        </div>
                        <div class="form-group">
                            <label for="img">Image</label>
                            <input type="text" class="form-control" name="img" id="img" placeholder="Image of the resource">
                        </div>
                        <div class="form-group">
                            <label for="language">Language</label>
                            <select class="form-control" id="language" name="language">
                                <option>CSS</option>
                                <option>JAVASCRIPT</option>
                                <option>JEE</option>
<!--                                <option>4</option>
                                <option>5</option>-->
                            </select>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" id="popular" name="popular">
                            <label class="form-check-label" for="popular">Is popular</label>
                        </div>
                        <br>
                        <button type="submit" class="btn mb-2">Add</button>
                    </form>


                </div>
                <div class="tab-pane fade" id="update"><p>To Do : Create update form </p></div>
                <div class="tab-pane fade" id="delete"><p>To Do : Create delete form</p></div>
            </div>

        </div>


        <script>



        </script>





    </body>
