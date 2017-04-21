<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>CRM > Create Lead</title>
</head>
<body>

<h1>CRM > Create Lead</h1>

<c:if test="${not empty param.created}">
	<p><b>You have successfully created a lead.</b></p>
</c:if>

<form:form modelAttribute="lead">
	<table>
		<tr>
			<td>First name:</td>
			<td><form:input path="firstName" /></td>
		</tr>
		<tr>
			<td>Country:</td>
			<td>
				<form:select path="country">
					<form:options items="${countryList}" itemValue="code" itemLabel="name" />
				</form:select>
			</td>
		</tr>
		<tr>
			<td>Address :</td>
			<td><form:input path="address" /></td>
		</tr>
		<tr>
			<td>Phone:</td>
			<td><form:input path="phone" /></td>
		</tr>
		<tr>
			<td>E-mail:</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Submit"></input></td>
		</tr>
	</table>
</form:form>

</body>
</html>
