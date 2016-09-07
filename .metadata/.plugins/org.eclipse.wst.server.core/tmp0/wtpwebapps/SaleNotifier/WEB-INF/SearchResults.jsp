<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="modernizr-1.5.js"></script>
<style>  <%@ include file="searchresults.css"%>  </style>	   
</head>
<body>

				<form id="survey" name="survey"
					action="UserAccount"
					method="post">
				
					<fieldset id="searchbar">
						<input type="search" name="search" id="search" placeholder="Search"/>
						<input type="submit" value="Go" />
					</fieldset>
				</form>
				
		<% String table  = (String) request.getAttribute("table"); %>
		<%= table %>

</body>
</html>