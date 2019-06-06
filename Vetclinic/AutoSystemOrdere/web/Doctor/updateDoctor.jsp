<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 5/23/17
  Time: 11:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UpdateDoctor</title>
</head>
<body>

<p><h1 align="center">Doctor for update will be choosed by doctor name</h1>
<div style="margin: auto; text-align: center; max-width: 300px;">
    <form action="../Servlets.UpdateDoctor" method="get">
        <label>Doctor FIO</label>
        <input type="text" name="doctorFIO">
        <br>

        <label>Phone number</label>
        <input type="text" name="phoneNumber">
        <br>

        <label>Specialization</label>
        <input type="text" name="specialization">
        <br>

        <label>Email</label>
        <input type="text" name="email">
        <br>

        <label>Address</label>
        <input type="text" name="address">
        <br>

        <label>Experience</label>
        <input type="number" name="experience">
        <hr>

        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>
