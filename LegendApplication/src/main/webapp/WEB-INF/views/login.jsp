<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Legend Power Login Form</title>
<!-- <link
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
					<h2 class="text-center">Login</h2>
				</div>
				<div class="modal-body col-md-12">
					<form class="form col-md-12" method="POST"  action="/legend/user/login">
						<div class="form-group">
							<input type="text" class="form-control input-lg" name="email"
								placeholder="Email">
						</div>
						<div class="form-group">
							<input type="password" class="form-control input-lg" name="password"
								placeholder="Password">
						</div>
						<div class="form-group">
							<button class="btn btn-primary btn-lg btn-block">Sign In</button>
							<div>
								<span class="pull-left"><a href="/legend/signup">Register</a></span> <span
									class="pull-right"><a href="#">Forgot Password</a></span>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>