<%-- 
    Document   : challenge8-1
    Created on : 2018/05/20, 18:37:48
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    long ans = 1;
    
    for(int a = 0; a < 20; a++){
        ans *= 8;
    }
    
    out.print(ans);
%>
