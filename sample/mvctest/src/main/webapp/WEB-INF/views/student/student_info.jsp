<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Student</title>
</head>
<body>
<h1>
	Student info
</h1>
<!-- 
<form action="" method="get">
<form action="" method="post">
 -->
<form action="">
	<div>
		<span>Student name : <input type="text" name="name" /></span>
		<br>
		<span>Student id : <input type="text" name="id" /></span>
	</div>
	<button value="submit">submit</button>
</form>
<div>
	Parameter Student Name is <strong>${student.name }.</strong>
	<br>
	Parameter Student Id is <strong>${student.id }.</strong>
</div>
</body>
</html>
