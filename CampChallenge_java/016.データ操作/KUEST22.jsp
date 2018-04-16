<%-- 
    Document   : KUEST22
    Created on : 2018/04/13, 17:26:35
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
        <h1>クエストリング課題送信先</h1>
        <%
            //文字コードの指定
            request.setCharacterEncoding("UTF-8");
            //情報の取り出し
            String suji1 = request.getParameter("suji");
            //int型に変換
            int kazu = Integer.parseInt(suji1);

           int suji = kazu;
            
            out.print(suji +"=");
            for (int i = 2; (i < kazu) && (1 < suji); i++) {
            
                if (suji % i == 0) {
                    if (i < 10) {
                        out.print(i+"×");
                    } else {
                        out.print("あまり"+i); 
                    }
                

                    suji /= i;
                    i--;
                     }
                 
            }
            if (suji == kazu) {
                out.print("素数");
                 }
             
        
        
        
        %>
    </body>
</html>
