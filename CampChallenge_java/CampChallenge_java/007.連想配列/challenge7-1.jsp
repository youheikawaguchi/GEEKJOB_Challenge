<%-- 
    Document   : challenge7-1
    Created on : 2018/05/20, 17:25:10
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%
    HashMap<String, String> a = new HashMap<String, String>();
    a.put("1","AAA");
    a.put("hello","world");
    a.put("soeda","33");
    a.put("20","20");
    
    ArrayList<HashMap> al = new ArrayList<HashMap>();
    al.add(a);
    
    for(HashMap b: al){
        out.print(b);
    }
%>
