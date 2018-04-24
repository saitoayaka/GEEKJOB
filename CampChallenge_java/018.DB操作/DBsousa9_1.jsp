<%-- 
    Document   : DBsousa9_1
    Created on : 2018/04/24, 15:40:55
    Author     : hayong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="DBsousa9" method ="post">
       ここに検索したい人の情報を入力してください
       <br>
       profileID:<input type="text" name="profileID" >
        <br>
       名前:<input type="text" name="name">
        <br>
        電話番号:<input type="text" name="tell">
        <br>
        年齢:<input type="text" name="age" >
        <br>
        誕生日:<input type="text" name="birthday">
        <br>
        <input type="submit" value="送信">
        <br>    
        
    </body>
</html>
