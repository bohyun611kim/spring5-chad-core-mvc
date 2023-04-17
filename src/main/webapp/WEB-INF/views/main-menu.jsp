<!DOCTYPE html>
<html>

<head>

    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/static/css/my-test.css">

    <script src="${pageContext.request.contextPath}/resources/static/js/simple-test.js"></script>

</head>

<body>

<h2>Spring MVC Demo - Home Page</h2>

<a href="${pageContext.request.contextPath}/hello/showForm">Hello World</a>

<br><br>

<a href="silly/showForm">Silly </a>
<br><br>

<a href="${pageContext.request.contextPath}/test/hello">Spring Rest DEMO </a>
<br><br>


<img src="${pageContext.request.contextPath}/resources/static/images/cat1.jpg"/>

<br><br>

<input type="button" onclick="doSomeWork()" value="Click Me"/>

</body>

</html>