<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 5/23/17
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Doctor menu</title>
</head>
<body>
    <p><h1 align="center">Choose menu for actions</h1>
    <div style="margin: auto; text-align: center; max-width: 300px;">
        <div>
            <form action="registryDoctor.jsp" method="get">
                <input type="submit" value="Registry doctor">
            </form>
        </div>
        <div>
            <form action="updateDoctor.jsp" method="get">
                <input type="submit" value="Update doctor data">
            </form>
        </div>

    <div>
        <a href="../index.jsp">Back to main page</a>
    </div>
    </div>
</body>
</html>
