<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Doctors list</title>
</head>
<body>
<div style="margin: auto; text-align: center; max-width: 300px;">
<h3>Doctors List</h3>
<table border="1" cellpadding="6" cellspacing="1" >
    <tr>
        <th>FIO</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone number</th>
        <th>Specialization</th>
        <th>Experience</th>
    </tr>
    <c:forEach items="${doctorList}" var="doctor" >
        <tr>
            <td>${doctor.FIO}</td>
            <td>${doctor.email}</td>
            <td>${doctor.adress}</td>
            <td>${doctor.phoneNumber}</td>
            <td>${doctor.specialization}</td>
            <td>${doctor.experience}</td>
        </tr>
    </c:forEach>
</table>

<div>
    <a href="../index.jsp">Back to main page</a>
</div>
</div>
</body>
</html>
