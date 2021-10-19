<%--
  Created by IntelliJ IDEA.
  User: note
  Date: 3/6/2020 AD
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ApproverServlet" method="post">
<table>
<tr>
    <th>Firstname</th>
    <th>Lastname</th>
    <th>Nickname</th>
    <th>Equip to repair</th>
    <th>Reason to repair</th>
    <th>Time</th>
</tr>
    <tr>
        <th>${firstname}</th>
        <th>${lastname}</th>
        <th>${Requester}</th>
        <th>${Equip_repair}</th>
        <th>${Reason_repair}</th>
        <th>${Requset_At}</th>
    </tr>
    <tr>
        Name :<input type="text" name="Approver" required>
        <input type="submit" name="Requestatus" value="Approve">Approve
        <input type="submit" name="Requestatus" value="Reject">Reject
    </tr>
</table>
</form>
</body>
</html>
