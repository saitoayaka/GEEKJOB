<%-- 
    Document   : rensou1
    Created on : 2018/02/20, 13:21:01
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
        <%@ page import = "java.util.HashMap"%>
<% 
HashMap<String,String>user1 = new HashMap<String,String>();

user1.put("1","AAA");
user1.put("hello","world");
user1.put("soeda","33");
user1.put("20","20");

out.print("1:"+user1.get("1"));
out.print("2:"+user1.get("hello"));
out.print("3:"+user1.get("soeda"));
out.print("4:"+user1.get("20"));
%>
    </body>
</html>
