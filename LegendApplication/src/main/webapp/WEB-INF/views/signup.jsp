<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html lang="en">
<head>
<title>Legend Power Login Form</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
			<script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
<link href="/legend/resources/css/styles.css" rel="stylesheet">
<style>
.navbar-custom {
	background-color: #fff;
}

.jumbotron {
	height: 80vh;
}
</style>
</head>
<body style="background-color: hsla(61, 65%, 91%, 0.2)">
	<!--login modal-->
	<div class="container-fluid">
		<div>
			<div class="modal-content col-lg-6 col-lg-offset-3" id="loginModal"
				style="margin-top: 10%;">
				<div class="col-md-12">
					<h2 class="text-center">Enter Details</h2>
				</div>
				<div class="modal-body col-md-12">
					<form:form class="form col-md-12" action="/legend/user/signup"  method="POST">
					    <div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="Name" path="name" />
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="Email" path="email" />
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="Password" path="password" />
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="Mobile No." path="contactNum" />
						</div>
						<div class="form-group">
						    <form:select path="organization.id">
						    	<form:options items="${organization}" itemValue="id" itemLabel="name" />
     	        			</form:select> 
							<a href="/legend/organization"> AddOrganization</a>
 						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-lg btn-block">Sign Up</button>
							<div>
								<span class="pull-left"><a href="/legend">Login</a></span>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>