<%-- 
    Document   : KUEST11
    Created on : 2018/04/13, 15:53:21
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>クエストリング送信先</title>
    </head>
    <body>
        <h1>クエストリング送信先</h1>
        <%
        request.setCharacterEncoding("UTF-8");
        String total1 = request.getParameter("total");
        String count1 = request.getParameter("count");
        String type1  =request.getParameter("type");
        
        //int型へ
        int total = Integer.parseInt(total1);
        int count = Integer.parseInt(count1);
        int type = Integer.parseInt(type1);
        
        //画面表示 総額
        out.print("総額は"+total+"円です<br>");
             
        //商品の種類
        if(type == 1){
        out.print("雑貨"+count+"点<br>");
        }else if(type == 2){
        out.print("生鮮食品"+count+"点<br>");
        }else{
        out.print("その他"+count+"点<br>");
        }
        
        //画面表示　商品の単価は
          out.print("商品1点当たりの単価は"+total / count+"円です<br>");
        
        //画面表示　ｐｔ数
        if(total >= 5000){
        out.print("獲得ｐｔ数は"+total*0.05+"pt");
        }else if(total >= 3000 && total <5000){
        out.print("獲得ｐｔ数は"+total*0.03+"pt");
        }else{
        out.print("獲得ｐｔ数は0ptです。");
        }
        
        %>
        
    </body>
</html>
