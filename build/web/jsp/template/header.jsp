<%-- 
    Document   : header
    Created on : 12 avr. 2018, 16:09:24
    Author     : blaurancin
--%>
<header> 

    <nav class="navbar navbar-inverse navbar-fixed-top" style="border-radius: 0;">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>                        
                </button>
                <span class="navbar-brand" style="color:#68D0FE">My Web Dev Resources</span>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar" style="max-height: none;">
                <ul class="nav navbar-nav">
                    <li id="home" class="active"><a href='http://localhost:8080/mywebdevresources/'>ALL</a></li>
                    <li id="html_css"><a href="#">HTML/CSS</a></li>
                    <li id="javascript"><a href="#">JAVASCRIPT</a></li>
                    <li id="jee"><a href="#">JEE</a></li>
                    <li>
                        <div  style="padding-top: 15px;">
                            <input type="checkbox" id="check1">
                            <label for="check1">
                                <div><i class="fa fa-check"></i></div> Display only popular resources
                            </label>
                        </div>
                    </li>
                </ul>
                <form class="navbar-form navbar-left" action="#" style="margin-left: 50px;">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-outline-success" style="color: #68D0FE; background-color: transparent; background-image: none; border-color: #68D0FE;" onMouseOver="this.style.backgroundColor = '#68D0FE'; this.style.color = '#fff'" onMouseOut="this.style.backgroundColor = 'transparent'; this.style.color = '#68D0FE'">Search</button>
                </form>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href='<s:url action="formSignIn" />'><span class="glyphicon glyphicon glyphicon-user"></span>&nbspLogin as administrator</a></li>
                    <li><a href='<s:url action="displayPopularResources" />'><span class="glyphicon glyphicon glyphicon-log-out"></span>&nbspLogout</a></li>
                </ul>
            </div>
        </div>
    </nav>

</header>
