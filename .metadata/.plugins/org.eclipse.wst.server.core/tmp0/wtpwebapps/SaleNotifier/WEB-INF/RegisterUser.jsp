<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
<style>  <%@ include file="registeruserstyles.css"%>  </style>	   
<!-- The Sale Notifier Splash Page
	        Author: Michael Haight & Mohamed Saleh
	        Data:   10/30/2015
	   -->
	   <meta charset="UTF-8" />
	   <title>Sale Notifier</title>
	   <script src="modernizr-1.5.js"></script>
	</head>

	<body>
	   <header>
	      <hgroup>
	      <h1>Users Settings</h1>
	      
	      </hgroup>
	   </header>

		<section>
			<form action="RegisterUser" method="post">
				<h2>Choose Username</h2>
				<input type="text" name="username" id="userame" required="required"/>
			
				<h2>Set Email Address</h2>
				<label for="email"><h6>Email</h6></label>
				<label for="confirmemail"><h6>Confirm Email Address</h6></label><br/>
				<input type="text" name="email" id="email" required="required"/>
				<input type="text" name="confirmemail" id="confirmemail" required="required"/>
			
				<h2>Set Password</h2>
				<label for="password"><h6>Password</h6></label>
				<label for="confrimpassword"><h6>Confirm</h6></label><br/>
				<input type="text" name="password" id="password" required="required"/>			
				<input type="text" name="confirmpassword" id="confirmpassword" required="required"/>


			<aside id="Submit">
				<input type="submit" value="Register" />
			</aside>
			
			</form>
		</section>
	</body>
	
</html>