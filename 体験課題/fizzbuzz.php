<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ナベアツ課題</title>
</head>
<body>
    <h1>ナベアツ課題</h1>
       <?php
        //　----------ここから下へソースコードを書く------------
        $aho = "アホになる";
        $dog = "犬っぽくなる";
        $x = 1;
        while($x <= 40){
            $n ="";
            $n .= $x;
            if($x % 3 == 0 || strpos($x,'3') !== false){
                $n .= $aho;
            }
            if($x % 5 == 0){
                $n .= $dog;
            }
            echo($n . "<br>");
            $x++;
        }
        
       //　-------------------------ここまで------------------------------
        ?>
</body>
</html>
