<%-- 
    Document   : nyuryokukekka
    Created on : 2018/04/12, 17:53:35
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>送信された結果</title>
    </head>
    <body>
        <h1>送信された情報</h1>
        
        <%
         
        request.setCharacterEncoding("UTF-8");
            
         out.print(request.getParameter("Name"));
         out.print(request.getParameter("gendar"));
         out.print(request.getParameter("syumi"));
        
        
        
        %>
    </body>
</html>
