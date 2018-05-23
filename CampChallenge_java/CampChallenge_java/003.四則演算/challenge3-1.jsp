<%-- 
    Document   : challenge3-1
    Created on : 2018/05/14, 13:58:42
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    int a = 20;
    final int b = 30;
    
    int ans = a + b;
    out.print(ans + "<br>");
    ans = a - b;
    out.print(ans + "<br>");
    ans = a * b;
    out.print(ans + "<br>");
    ans = b / a;
    out.print(ans + "<br>");
    ans = b % a;
    out.print(ans);
%>