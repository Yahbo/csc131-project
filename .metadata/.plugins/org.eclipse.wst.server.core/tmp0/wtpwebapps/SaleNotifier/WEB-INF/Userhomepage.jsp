<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	   <!-- The Sale Notifier Splash Page
	        Author: Michael Haight & Mohamed Saleh
	        Data:   10/30/2015
	   -->
	   <meta charset="UTF-8" />
	   <title>Sale Notifier</title>
	   <script src="modernizr-1.5.js"></script>
<style>  <%@ include file="userhomepagestyles.css"%>  </style>	   
	</head>

	<body>
	   <header>
	      <hgroup>
	      <h1>Hello <%= (String)session.getAttribute("username") %></h1> 
	      </hgroup>
	   </header>
	    
			 <h2>Find An Item</h2>
			 
				<form id="survey" name="survey"
					action="UserAccount"
					method="post">
				
					<fieldset id="searchbar">
						<input type="search" name="search" id="search" placeholder="Search"/>
						<input type="submit" value="Go" />
					</fieldset>
				</form>
			</article>
	</body>
	
</html>