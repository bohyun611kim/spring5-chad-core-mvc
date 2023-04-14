<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath}/student/processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    Country:
    <form:select path="country">
        <form:option value="Brazil" label="Brazil"/>
        <form:option value="France" label="France"/>
        <form:option value="Corea" label="Corea"/>
        <form:option value="China" label="China"/>
    </form:select>

    <br><br>

    <input type="submit" value="Submit"/>

</form:form>


</body>
</html>
