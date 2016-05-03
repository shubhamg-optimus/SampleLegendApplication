<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
					<h2 class="text-center">Enter Organization Details</h2>
				</div>
				<div class="modal-body col-md-12">
					<form:form class="form col-md-12" action="/legend/addOrganization" method="POST">
						<div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="Name" path="name"/>
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="street" path="street"/>
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="city" path="city"/>
						</div>
						<div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="province" path="province"/>
						</div>
                        <div class="form-group">
							<form:input type="text" class="form-control input-lg"
								placeholder="postalCode" path="postalCode"/>
						</div>
						<div class="form-group">
							<button class="btn btn-primary btn-lg btn-block">Add Organization</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body></html>