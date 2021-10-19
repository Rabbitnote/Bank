<%--
  Created by IntelliJ IDEA.
  User: note
  Date: 3/6/2020 AD
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request</title>
</head>
<body>
<h1>Require Repair</h1>
<form action="RequestServlet" method="post">
    <label>FirstName :<input type="text" name="firstname" required></label><br>
    <label>Lastname :<input type="text" name="lastname" required></label><br>
    <label>Nickname : <input type="text" name="Requester" required></label><br>
    <label>Equipment to repair :<select name="Equip_repair"><option value="laptop">laptop<option> <option value="monitor">monitor<option><option value="keyboard">keyboard<option></select></label><br>
    <label>Reason to repair :<input type="text" name="Reason_repair" required></label><br>

    <input type="submit">


</form>

<h3><a href="index.jsp"><< Back</a></h3>

</body>
</html>
