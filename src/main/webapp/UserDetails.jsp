<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
session.invalidate();
response.setHeader("Cache-control","no-cache");
response.setHeader("Cache-control","no-store");
response.setHeader("Expires","0");
response.setDateHeader("Expires", -1);
%> 
<title>Online Banking</title>

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


<div class="main-bg" style="height: 800px">
<br>
 <div class="navigation">

			<a class="button"  href="index.jsp" > 
				<span class="fa fa-power-off"></span>

		       <div class="logout">LOGOUT</div>

			</a>

		</div>
<img src=/images/comviva_logo.png >
		
		
	
	
		
	
		<h1>HELLO ${name}</h1>

		<div class="sub-main-w3">

			<!-- vertical tabs -->
			<div class="vertical-tab">
				<div id="section1" class="section-w3ls">
					<input type="radio" name="sections" id="option1" ${check1}>
					<label for="option1" class="icon-left-w3pvt"><span class="fa fa-user-circle" aria-hidden="true"></span>User Details</label>
					<article>
						<form action="#" method="post"  >
							<h3 class="legend">User Details</h3>

							<div class="input"><table>
								<tr><td>Account Number: </td><td> &nbsp;&nbsp;&nbsp; ${account} <br></td></tr> 
								<tr><td>Name: </td><td>&nbsp;&nbsp;&nbsp; ${name} <br></td></tr>
								<tr><td>Date of Birth: 	</td><td>&nbsp;&nbsp;&nbsp;	${dob} <br></td></tr>
								<tr><td>E-mail: 		</td><td>&nbsp;&nbsp;&nbsp;	${email} <br></td></tr>
								<tr><td>Mobile: 		</td><td>&nbsp;&nbsp;&nbsp;	${phone} <br></td></tr>
								<tr><td>Father's Name: 	</td><td>&nbsp;&nbsp;&nbsp;	${fathername}<br></td></tr>
								<tr><td>Mother's Name: 	</td><td>&nbsp;&nbsp;&nbsp;	${mothername}<br></td></tr>
								<tr><td>Gender: 		</td><td>&nbsp;&nbsp;&nbsp;	${gender}<br></td></tr>
								<tr><td>Adhaar Number: 	</td><td>&nbsp;&nbsp;&nbsp;	${adhaar}<br></td></tr>
								<tr><td>Pan Number: 	</td><td>&nbsp;&nbsp;&nbsp;	${pan}<br></td></tr>
								<tr><td>Blood Group: 	</td><td>&nbsp;&nbsp;&nbsp;	${bloodgroup}<br></td></tr>
								<tr><td>Alternate Number: </td><td> &nbsp;&nbsp;&nbsp;	${alternatenumber}<br></td></tr>
								</table>
							</div>
						</form>
					</article>
				</div>
				<div id="section2" class="section-w3ls">
					<input type="radio" name="sections" id="option2" ${check2}>
					<label for="option2" class="icon-left-w3pvt"><span class="fa fa-pencil-square" aria-hidden="true"></span>Modify</label>
					<article>
						<form action="modify_account" method="post">
							<h3 class="legend">Modify Account</h3>
							<p class="para-style">Enter your password to modify account.</p>

							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span>
								<input type="password" placeholder="Password" name="password" required />
							</div>
							${modify_pass_error}

							<button type="submit" class="btn submit">Modify</button>
						</form>
					</article>
				</div>

				<div id="section3" class="section-w3ls">
					<input type="radio" name="sections" id="option3" ${check3}>
					<label for="option3" class="icon-left-w3pvt"><span class="fa fa-trash" aria-hidden="true"></span>Delete</label>
					<article>
						<form action="delete" method="post">
							<h3 class="legend last">Delete Account</h3>
							<p class="para-style">Enter your password to delete account.</p>
							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span>
								<input type="password" placeholder="Password" name="password" required />
							</div>
							${delete_pass_error}
							<button type="submit" class="btn submit last-btn">Delete</button>
						</form>
					</article>
				</div>

			</div>
			<!-- //vertical tabs -->
			<div class="clear"></div>
		</div>

	</div>

</body>
</html>