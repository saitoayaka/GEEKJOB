<%-- 
    Document   : ru-pu3
    Created on : 2018/02/20, 18:32:31
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><%
      int moji = 1000;
     
      while(moji>100){
       moji=moji/ 2;
       if(moji>100)
       {out.print(moji +"<br>");}
     
          moji++;
      }
      %>
    </body>
</html>
