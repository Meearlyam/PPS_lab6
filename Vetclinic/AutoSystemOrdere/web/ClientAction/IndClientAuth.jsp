<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 5/24/17
  Time: 1:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client make order</title>
</head>
<body>
<div style="margin: auto; text-align: center; max-width: 300px;">
    <div>
        <form action="../Servlets.ClientMakeOrder" method="get">
            <label>Doctor FIO</label> <br>
            <input type="text" name="doctorFIO"><br>

            <label>FIO</label><br>
            <input type="text" name="FIO"><br>

            <input type="submit" value="Make an appointment as registered client">
        </form>
    </div>

    <hr>

    <div>
        <form action="../Servlets.ClientMakeOrderAndRegistry" method="get">
            <label>Doctor FIO</label> <br>
            <input type="text" name="doctorFIO"><br>

            <label>Self FIO</label><br>
            <input type="text" name="selfFIO"><br>

            <label>Address</label><br>
            <input type="text" name="address"><br>

            <label>phoneNumber</label><br>
            <input type="text" name="phoneNumber"><br>

            <label>Email</label><br>
            <input type="text" name="email"><br>


            <input type="submit" value="Make an appointment and register client">
        </form>
    </div>
</div>
</body>
</html>
