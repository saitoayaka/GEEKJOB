<%-- 
    Document   : jyouken2
    Created on : 2018/02/14, 11:38:36
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
 int suji=1;
 while(suji<10){out.print(suji);
 
 switch(suji){case 1:
             out.print("one"+"<br>");
             break;
            
            case 2:
             out.print("two"+"<br>");
             break;
             
             default:
             out.print("想定外です"+"<br>");
           
}
suji++; 
}
       %>
    </body>
</html>
