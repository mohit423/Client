<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<title>Comcubs Home</title>

	<!-- css files -->
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<!-- Font-Awesome-Icons-CSS -->
	<!-- //css files -->
	
	<!-- web-fonts -->
	<link href="//fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext"
	 rel="stylesheet">
	<!-- //web-fonts -->


</head>
<body>
<div class="main-bg">
<br>
<img src=/images/comviva_logo.png >
		<h1>WELCOME Comcubs</h1>

		<div class="sub-main-w3">

			<!-- vertical tabs -->
			<div class="vertical-tab">
				<div id="section1" class="section-w3ls">
					<input type="radio" name="sections" id="option1" checked>
				<!-- 	<label for="option1" class="icon-left-w3pvt"><span class="fa fa-user-circle" aria-hidden="true"></span>Login</label>
				 -->	<article>
						<form action="login_credentials" method="post">
							<h3 class="legend">Login Here</h3>

							<div class="input">
								<span class="fa fa-envelope-o" aria-hidden="true"></span>
								<input type="text" placeholder="Account number" name="account" maxlength="5" required />
								
							</div>
						${account_error}	
							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span>
								<input type="password" placeholder="Password" name="password" required />
							</div>
						${password_error}
							<button type="submit" class="btn submit" value="login_credentials">Login</button>

							
						</form>
						<p align="center" style="color:green">Don't have an account? SIGN UP! </p>
						<form action="register" method="post"><button type="submit" class="btn submit" value="register" >SIGN UP</button></form>
					</article>
					
				</div>
				
			</div>
			<!-- //vertical tabs -->
			<div class="clear"></div>
		</div>

	</div>

</body>
</html>