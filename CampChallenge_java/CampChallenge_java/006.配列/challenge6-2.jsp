<%-- 
    Document   : challenge6-2
    Created on : 2018/05/20, 14:22:34
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%
    ArrayList<String> a = new ArrayList();
    a.add("10");
    a.add("100");
    a.add("soeda");
    a.add("hayashi");
    a.add("-20");
    a.add("118");
    a.add("END");
    
    a.set(2,"33");
    for(String b : a){
        out.print(b + "<br>");
    }
%>