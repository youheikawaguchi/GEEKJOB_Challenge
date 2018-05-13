<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ナベアツ課題</title>
</head>
<body>
    <h1>ナベアツ課題</h1>
       <% 
        //　----------ここから下へソースコードを書く------------
        String aho = "アホになる";
        String dog = "犬っぽくなる";
        for(int x = 1; x <= 40; x++){
            String n ="";
            n += x;
            if(x % 3 == 0 || String.valueOf(x).indexOf("3")!=-1){
                n += aho;
            }
            if(x % 5 == 0){
                n += dog;
            }
            out.println(n + "<br>");
        }

        
       //　-------------------------ここまで------------------------------
        %>
</body>
</html>
