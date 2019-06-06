<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 5/24/17
  Time: 4:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>ProductList</title>
</head>
<body>
<div style="margin: auto; text-align: center; max-width: 300px">
<h3>Product List</h3>

<table border="1" cellpadding="3" cellspacing="1" >
    <tr>
        <th>Product description</th>
        <th>Price</th>
        <th>Company name</th>
    </tr>
    <c:forEach items="${productList}" var="product" >
        <tr>
            <td>${product.price}</td>
            <td>${product.productDescription}</td>
            <td>${product.companyName}</td>
        </tr>
    </c:forEach>
</table>

<div>
    <a href="../index.jsp">Back to main page</a>
</div>

</div>
</body>
</html>
