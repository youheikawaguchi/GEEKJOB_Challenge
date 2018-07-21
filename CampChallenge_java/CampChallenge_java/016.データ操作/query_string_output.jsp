<%-- 
    Document   : query_string_output
    Created on : 2018/06/28, 17:38:31
    Author     : g015c1153
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            int total = Integer.parseInt(request.getParameter("total"));
            int count = Integer.parseInt(request.getParameter("count"));
            int type = Integer.parseInt(request.getParameter("type"));
            String strType="";
            int oneItem=0;
            int point = 0;
            
            oneItem = total/count;
            
            if(total >= 5000){
                point = 5;
            }else if(5000 > total && total >=3000){
                point = 4;
            }
            
            switch(type){
                case 1:
                    strType="雑貨";
                    break;
                case 2:
                    strType = "生鮮食品";
                    break;
                case 3:
                    strType = "その他";
                    break;
            }
        %>
        <div>
            購入総額⇒<%= total%><br>
            購入個数⇒<%= count%><br>
            商品種別⇒<%= strType%><br>
        </div>
        <div>
            商品単価⇒<%= oneItem%>
        </div>
        <div>
            今回のポイントは⇒<%= point%>
        </div>
    </body>
</html>
