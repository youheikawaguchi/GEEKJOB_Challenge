<%-- 
    Document   : challenge8-4
    Created on : 2018/05/21, 15:53:41
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int a = 1000;
    while(a >= 100){
        a /= 2;
        
    }
    out.print(a);
%>