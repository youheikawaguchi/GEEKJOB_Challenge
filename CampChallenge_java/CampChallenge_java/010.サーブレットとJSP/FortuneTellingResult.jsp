<%-- 
    Document   : FortuneTellingResult
    Created on : 2018/05/24, 13:46:38
    Author     : g015c1153
--%>

<%@page import="org.camp.servlet.ResultData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
            ResultData data = (ResultData)request.getAttribute("DATA");
        %>
    </head>
    <body>
        <%
        if(data != null){
            out.println("<h1>あなたの" + data.getD() + "の運勢は" + data.getLuck() + "です！</h1>");
        }
        %>
    </body>
</html>
