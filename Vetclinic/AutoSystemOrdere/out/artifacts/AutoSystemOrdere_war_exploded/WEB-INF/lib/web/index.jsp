<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>AOS</title>
    <link rel="stylesheet" type="text/css" href="Styles.css">
  </head>
  <body>
  <p><h1 align="center">Choose menu for actions</h1>

  <div style="margin: auto; text-align: center; max-width: 300px;">
    <div>
      <form action="ClientAction/clientMenu.jsp" method="get">
        <input type="submit" value="Client">
      </form>
    </div>
    <div>
      <form action="Doctor/doctorMenu.jsp" method="get">
        <input type="submit" value="Doctor">
      </form>
    </div>
    <div>
      <form action="Filter/filterMenu.jsp" method="get">
        <input type="submit" value="Filter">
      </form>
    </div>
  </div>

  </body>
</html>