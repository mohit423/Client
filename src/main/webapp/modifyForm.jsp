<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
	
	<script>
	
function goBack() {
  window.history.back();
}
</script>
		<script type="text/javascript">
								var Passwordcheck = function() {
									
									  if (document.getElementById('password').value ==
									    document.getElementById('confirm_password').value) {
									    document.getElementById('message').style.color = 'green';
									    document.getElementById('message').innerHTML = null;
									    document.getElementById('submit').disabled = false;
									    
									  } else {
									    document.getElementById('message').style.color = 'red';
									    document.getElementById('message').innerHTML = 'password not matching';
									    document.getElementById('submit').disabled = true;
									  }
									}

	</script>
</head>
<body>
<div class="main-bg" style="height: 1500px">
<br>
<div class="navigation">

			<a class="button" href="index.jsp">
				<span class="fa fa-power-off"></span>

				<div class="logout">LOGOUT</div>

			</a>

		</div>
<form action="userDetails" method="post">
<input type="image" src="/images/comviva_logo.png" alt="Submit">
</form>
<!-- <img src=/images/comviva_logo.png > -->
		

		<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Comcubs Update Form</h1>

		<div class="sub-main-w3">

			<!-- vertical tabs -->
			<div class="vertical-tab" style="margin-left:280px; width: 50%">

				<div id="section2" class="section-w3ls" >

						<form action="modify" method="post" >
							<h3 class="legend">Modify</h3>
							Account Number:
							<div class="input">
								<span class="fa fa-user-o" aria-hidden="true"> </span>
								<input type="text" value="${account}" readonly="readonly"/>
							</div>
							Name: 
							<div class="input">
								<span class="fa fa-user-o" aria-hidden="true"></span>
								<input type="text" placeholder="Name" pattern="[A-Za-z]{*}" name="name" value="${name}" required />
							</div>
							 Father's Name:
							<div class="input">
								<span class="fa fa-user-o" aria-hidden="true"></span>
								<input type="text" placeholder="Father's Name" pattern="[A-Za-z]{*}" name="fathername" style="display:inline-block;" required value="${fathername}"/>
							</div>
							Mother's Name:
                           <div class="input">
								<span class="fa fa-user-o" aria-hidden="true"> </span>
							<input type="text" placeholder="Mother's Name" pattern="[A-Za-z]{*}" name="mothername"  style="display:inline-block;" required  value="${mothername}"/>
							</div>
							Date of Birth
							<div class="input">
								<span class="fa fa-calendar" aria-hidden="true">:</span>
							 <input placeholder="Date of Birth" type="text" onfocus="(this.type='date')"  min="1979-12-31" max="2000-01-01" name="dob" value="${dob}">
							</div>
							  Email:
							<div class="input">
								<span class="fa fa-envelope" aria-hidden="true"> </span>
							<input type="email" placeholder="Email" name="email"  required value="${email}" />
							</div>
							Mobile:
							<div class="input">
								<span class="fa fa-phone" aria-hidden="true">  </span>
									<input type="text" placeholder="Mobile" pattern="\d{10,10}"  title="enter only 10 digit" name="phone" maxlength="10" required value="${phone}"/>
							</div>
							Adhaar Number:
							<div class="input">
								<span class="fa fa-id-card" aria-hidden="true">   </span>
								<input type="text" placeholder="Adhaar Number" pattern="\d{12,12}" title="enter only 12 digits" name="adhaar" maxlength="12" required value="${adhaar}" />
							</div>
							Pan Number:
							<div class="input">
								<span class="fa fa-id-card" aria-hidden="true">  </span>
								 <input type="text" placeholder="Pan Number"  pattern="[A-Za-z0-9]{10,10}" name="pan" maxlength="10"  required value="${pan}"/>
							</div>
							 Blood Group:
							<div class="input">
								<span class="fa fa-tint" aria-hidden="true">  </span>
								<input type="text" placeholder="Blood Group" name="bloodgroup"  value="${bloodgroup}"/>
							</div>
							  Alternate Number:
							<div class="input">
								<span class="fa fa-phone" aria-hidden="true"> </span>
							<input type="text" placeholder="Alternate Number" pattern="\d{10,10}" title="enter only 10 digit" name="alternatenumber" maxlength="10" value="${alternatenumber}"/>
							</div>
							Password:
							<div class="input">
								<span class="fa fa-key" aria-hidden="true">  </span>
								 <input type="password" placeholder="Password" name="password" id="password"   pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}"  title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" required  />	
				           </div>
							Confirm Password:
							<div class="input">
								<span class="fa fa-key" aria-hidden="true"></span>
								<input type="password" placeholder="Confirm Password" id="confirm_password" onkeyup='Passwordcheck();'   required>
							</div>
							 <span id='message'></span> 

							<button type="submit" class="btn submit">Confirm</button>
						</form>
                  </div>
			</div>
			<!-- //vertical tabs -->
			<div class="clear"></div>
		</div>

	</div>

</body>
</html>