<%-- 
    Document   : jyoukennif
    Created on : 2018/02/14, 11:05:27
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
int suji=0;
while(suji<50){

out.print(suji);

if(suji==1){
    out.print("1です！"+"<br>");
}else if(suji==2){
    out.print("プログラミングキャンプ！"+"<br>");
}else{
    out.print("その他です！"+"<br>");
 }

suji++;
}

%>
    </body>
</html>
