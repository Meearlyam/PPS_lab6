<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 5/24/17
  Time: 8:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Client by product</title>
</head>
<body>
<div style="margin: auto; text-align: center; max-width: 300px">
<table border="1" cellpadding="6" cellspacing="1" >
    <tr>
        <th>address</th>
        <th>fullname</th>
        <th>passportDateOfIssue</th>
        <th>passportDateIssuingUssued</th>
        <th>passportNumber</th>
        <th>vat</th>
    </tr>
    <c:forEach items="${ind}" var="individual" >
        <tr>
            <td>${individual.address}</td>
            <td>${individual.fullname}</td>
            <td>${individual.passportDateOfIssue}</td>
            <td>${individual.passportDateIssuingUssued}</td>
            <td>${individual.passportNumber}</td>
            <td>${individual.vat}</td>
        </tr>
    </c:forEach>
</table>

<div>
    <a href="../index.jsp">Back to main page</a>
</div>
<div>
</body>
</html>
