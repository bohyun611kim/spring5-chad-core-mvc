<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Helloworld - Input Form</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/processForm" method="get">
    <input type="text" name="studentName" placeholder="what's your name">
    <input type="submit"/>
</form>


</body>
</html>
