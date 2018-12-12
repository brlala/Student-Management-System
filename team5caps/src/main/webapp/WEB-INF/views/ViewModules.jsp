<html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
</head>

<body>

	<table id="ModuleTaught" class="table table-stripeds">
		<tr>
			<td>No</td>
			<td>Module ID</td>
			<td>Course Name</td>
			<td>Lecturer Rating</td>
			<td>Attendance</td>
		</tr>
		<c:forEach items="${modules}" var="module" varStatus="index">
			<tr>
				<td>${index.count}</td>
				<td>${module.moduleID}</td>
				<td>${module.coursedetail.courseName}</td>
				<td>${ratings}</td>
				<td>${attendance}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>