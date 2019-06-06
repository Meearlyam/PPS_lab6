<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 5/23/17
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client menu</title>
</head>
<body>
<p>
<h1 align="center">Client actions:</h1>

<div style="margin: auto; text-align: center; max-width: 300px;">
    <div>
        <form action="IndClientAuth.jsp" method="post">
            <input type="submit" value="Make an appointment" name="Make an appointment">
        </form>
    </div>
    <div>
        <form action="../Servlets.ClientGetPricelist" method="get">
            <input type="submit" value="Get services list">
        </form>
    </div>
    <div>
        <form action="../Servlets.ClientGetCompanyData" method="get">
            <input type="submit" value="Get doctor data">
        </form>
    </div>

    <div>
        <a href="../index.jsp">Back to main page</a>
    </div>
</div>
</body>
</html>
