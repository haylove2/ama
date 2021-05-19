<%--
  Created by IntelliJ IDEA.
  User: Ztz
  Date: 2021/5/17
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery_3.5.1.js"></script>
    <script>
        function login() {
            console.info(111111);
            $.ajax({
                url:'reg/lg.do',
                method:'post',
                data:{name:'abc',pass:'123'},
                dataType:'json',
                success:function (dt) {
                    console.info(dt);
                    // var js = eval("("+dt+")");
                    // console.info(js.k1)
                }
            });
        }
    </script>
</head>
<body>
    <input type="button" value="登入" onclick="login()"/>
</body>
</html>
