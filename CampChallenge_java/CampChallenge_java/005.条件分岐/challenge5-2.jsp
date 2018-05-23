<%-- 
    Document   : challenge5-2
    Created on : 2018/05/17, 17:16:54
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int a = 2;
    
    switch(a){
        case 1:
            out.print("one");
            break;
        case 2:
            out.print("two");
            break;
        default:
            out.print("想定外");
    }
%>
