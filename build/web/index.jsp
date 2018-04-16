<%-- 
    Document   : index.jsp
    Created on : 12 avr. 2018, 14:28:48
    Author     : blaurancin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<body>



    <s:include value="jsp/template/header.jsp" />

    <div class="flex-container">

        <s:action name="displayAllResources" executeResult="true"/>

    </div>

    <s:include value="jsp/template/footer.jsp" />

    <script>

        $(function () {

//            jQuery.fn.visible = function () {
//                return this.css('visibility', 'visible');
//            };
//
//            jQuery.fn.invisible = function () {
//                return this.css('visibility', 'hidden');
//            };

            $('[data-toggle="tooltip"]').tooltip({
                delay: {"show": 500, "hide": 100},
            });
            $(".nav a").on("click", function () {
                $(".nav").find(".active").removeClass("active");
                $(this).parent().addClass("active");
            });
            let checkboxPopular = $("#check1");
            
            $("#html_css").click(function (event) {
                event.preventDefault();
                checkboxPopular.prop('checked',false);
                $(".flex-item").show();
                $(".flex-item").not(".flex-item[data-language='CSS']").hide();
            });
            $("#javascript").click(function (event) {
                event.preventDefault();
                checkboxPopular.prop('checked',false);
                $(".flex-item").show();
                $(".flex-item").not(".flex-item[data-language='JavaScript']").hide();
            });
            $("#jee").click(function (event) {
                event.preventDefault();
                checkboxPopular.prop('checked',false);
                $(".flex-item").show();
                $(".flex-item").not(".flex-item[data-language='JEE']").hide();
            });

            checkboxPopular.click(function(){
                if ($(this).is(':checked')) {
                    $(".flex-item[data-popular='false']").hide();
                } else {
                    $(".flex-item").show(); 
                }
            });
            
        })
                

    </script>


</body>

