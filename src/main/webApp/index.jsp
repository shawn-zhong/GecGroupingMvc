<%--
  Created by IntelliJ IDEA.
  User: Shawn
  Date: 1/6/18
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <script>
        function actionGet() {

            var id = document.getElementById("input_data").value;
            document.myform.action= "Contacts/".concat(id);
            document.myform.method="get";
            document.myform.submit();
        }
        function actionPost() {

            var id = document.getElementById("input_data").value;
            document.myform.action= "Contacts/".concat(id);
            document.myform.method="post";
            document.myform.submit();
        }
        function actionAddAccountByPost() {
            
        }

        $(document).ready(function() {
            $("#getMethod").click(function() {
                //getAction();

                alert(1);
                });
            $("#postMethod").click(function() {
                //postAction();;'
                alert(2);
             });
        });

    </script>

  </head>
  <body>



  <form action="Contacts/1" method="get">
    <input type="submit" value="get提交">
  </form>

  Contact ID = <input type="text" value="2" id="input_data">

  <form action="" theme="simple" name="myform" >

    <input type="button" value="根据填写动态生成restFul地址提交get" onclick="actionGet()"/>
    <input type="button" value="根据填写动态生成restFul地址提交post" onclick="actionPost()"/>
    <input type="button" value="根据填写动态生成restFul地址提交put" onclick="actionGet()"/>
    <input type="button" value="根据填写动态生成restFul地址提交delete" onclick="actionGet()"/>
  </form>


  <form action="http://localhost:8080/GecGrouping/users" method="get" >
    <input type="text" name="name" />
    <input type="submit" value="toGet"/>
  </form>


  <form action="http://localhost:8080/GecGrouping/users/add" method="post" >
    <input type="text" name="accountName" />
    <input type="password" name="accountPwd"/>
    <input type="submit" value="toPost"/>
  </form>

  <hr/>


  <table>
    <tr>
      <td>id</td>
      <td><input id="id" value="1"></td>
    </tr>
    <tr>
      <td>name</td>
      <td><input id="name" value="Shawn"></td>
    </tr>
    <tr>
      <td>mobile</td>
      <td><input id="mobile" value="185"></td>
    </tr>
  </table>

  <input type="button" id="getMethod" value="GET ACTION">
  <input type="button" id="postMethod" value="POST ACTION">

  </body>
</html>
