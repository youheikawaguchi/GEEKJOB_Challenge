<%-- 
    Document   : challenge8-3
    Created on : 2018/05/21, 15:20:03
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int sum = 0;
    for(int a = 0; a <= 100; a++){
        sum += a;
        if(a == 100){
            out.print(a + "<br>");
        }
    }
    out.print(sum);
%>
