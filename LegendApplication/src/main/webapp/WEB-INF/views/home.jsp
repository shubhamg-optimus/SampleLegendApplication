<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello User!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="/legend/signup">Sign Up</a><br>
<a href="/legend/login">Login</a><br>
<a href="/legend/addOrganization">Add Organization</a>
</body>
</html>
