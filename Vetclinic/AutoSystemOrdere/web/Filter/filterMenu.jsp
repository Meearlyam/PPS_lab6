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
    <title>Filter menu</title>
</head>
<body>
    <p><h1 align="center">Choose menu for actions</h1>
<div style="margin: auto; text-align: center; max-width: 300px;">
    <div>
        <form action="../Servlets.ClientListByProduct" method="get">
            <label>List of client by products</label>
            <input type="text" name="productName"><br>
            <input type="submit" value="get">
        </form>
    </div>
    <div>
        <form action="../Servlets.GetProductWithPrice" method="get">
            <label>Product with price</label><br>
            <input type="text" name="from"><br>
            <input type="text" name="to"><br>
            <input type="submit" value="get">
        </form>
    </div>
    <div>
        <form action="../Servlets.ClientList" method="get">
            <input type="submit" value="Get list of clients">
        </form>
    </div>

    <div>
        <a href="../index.jsp">Back to main page</a>
    </div>
</div>
</body>
</html>
