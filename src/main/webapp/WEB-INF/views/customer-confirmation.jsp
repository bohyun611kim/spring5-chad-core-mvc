<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/static/css/my-test.css">
</head>

<body id="confirmation-body">

<p id="confirmation">The Customer is confirmed: ${customer.firstName} ${customer.lastName} </p>
<br>

<p>FreePasses: ${customer.freePasses}</p>
<br>
</body>

</html>
