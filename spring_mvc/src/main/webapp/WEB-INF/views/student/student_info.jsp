<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student</title>
</head>
<body>
<h1>
	Student info
</h1>
<form action="">
	<div>
		<span>
			presentParentName :<input type="text" name="presentParentName" />
		</span>
		<br>
		<span>parentAge : <input type="text" name="parentAge"/></span>
		<br>
		<span>parentContact : <input type="text" name="parentContact"/></span>
	</div>
	<button value="submit">submit</button>
		<p> Student'presentParentName: ${student.getName()}</p>
		<p> Student'presentParentName: ${student.getId()}</p>
		<p> Student'presentParentName: ${student.getPresentParentName()}</p>
		<p> Student'parentAge: ${student.getParentAge()}</p>
		<p> Student'parentContact: ${student.getParentContact()}</p>
</form>
<div>
</div>
</body>
</html>