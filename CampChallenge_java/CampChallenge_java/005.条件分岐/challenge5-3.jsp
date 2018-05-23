<%-- 
    Document   : challenge5-3
    Created on : 2018/05/17, 17:21:05
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    char a = 'あ';
    
    switch(a){
        case 'A':
            out.print("英語");
            break;
        case 'あ':
            out.print("日本語");
            break;
    }
%>
