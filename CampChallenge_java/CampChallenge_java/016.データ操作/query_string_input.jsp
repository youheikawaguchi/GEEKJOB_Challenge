<%-- 
    Document   : query_string_input
    Created on : 2018/06/28, 17:24:10
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./query_string_output.jsp" method="GET">
            購入した商品の総額
            <input type="text" name="total"><br>
            購入した商品の数量
            <input type="text" name="count"><br>
            商品種別
            <select name="type">
                <option value="1">雑貨</option>
                <option value="2">生鮮食品</option>
                <option value="3">その他</option>
            </select>
            <input type="submit" value="送信">
        </form>
    </body>
</html>
