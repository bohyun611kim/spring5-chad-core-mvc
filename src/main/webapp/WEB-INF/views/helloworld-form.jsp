<html>
<head>
    <title>Helloworld - Input Form</title>
    <script src="${pageContext.request.contextPath}/static/js/simple-test.js" defer ></script>
</head>
<body>

<form action="${pageContext.request.contextPath}/hello/processFormVersionTwo" method="GET">
    <input type="text" name="studentName" placeholder="what's your name">
    <input type="submit"/>
</form>


</body>
</html>
