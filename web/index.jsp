<%-- 
    Document   : index.jsp
    Created on : 12 avr. 2018, 14:28:48
    Author     : blaurancin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<body style="background: radial-gradient(circle farthest-corner at 200px 0, #414141, #000) no-repeat center center fixed;">

    <s:include value="jsp/template/header.jsp" />

    <s:action name="displayAllResources" executeResult="true"/>

    <s:include value="jsp/template/footer.jsp" />

    <script>

        $(function () {

            jQuery.fn.visible = function () {
                return this.css('visibility', 'visible');
            };

            jQuery.fn.invisible = function () {
                return this.css('visibility', 'hidden');
            };

            $("#html_css").click(function (event) {
                event.preventDefault();
                $(".flex-item").show();
                $(".flex-item").not(".flex-item[data-language='CSS']").hide();
            });

            $("#javascript").click(function (event) {
                event.preventDefault();
                $(".flex-item").show();
                $(".flex-item").not(".flex-item[data-language='JavaScript']").hide();
            });

            $("#jee").click(function (event) {
                event.preventDefault();
                $(".flex-item").show();
                $(".flex-item").not(".flex-item[data-language='JEE']").hide();
            });

            $(".flex-item").each(function () {
                $(this).hover(function () {
                    $(this).children("div.info").slideToggle("fast");
                    ;
                });

            });

        });

    </script>


</body>

