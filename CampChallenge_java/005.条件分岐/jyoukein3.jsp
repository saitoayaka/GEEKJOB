<%-- 
    Document   : jyoukein3
    Created on : 2018/02/16, 11:46:30
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
     <%char suji='あ';
    
       
       switch(suji){case 'A':
                     out.print("英語");
                     break;
             
                     case 'あ':
                     out.print("日本語");
                    break;
       }
   
     	
     
     %> 
    </body>
</html>
