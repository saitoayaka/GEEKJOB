<%-- 
    Document   : ru-pu3
    Created on : 2018/02/20, 18:02:09
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
        long suji =0;
        for (int i =0; i<=100; i++){
            suji=suji+ i;
         out.print(suji + "<br>");
        }
        
     %>
    </body>
</html>
