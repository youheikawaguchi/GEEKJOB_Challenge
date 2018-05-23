<%-- 
    Document   : challenge5-1
    Created on : 2018/05/16, 19:01:14
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int a = 3;
    
    if(a == 1){
        out.print("１です！");
    }else if(a == 2){
        out.print("プログラミングキャンプ！");
    }else{
        out.print("その他です！");
    }
    
%>