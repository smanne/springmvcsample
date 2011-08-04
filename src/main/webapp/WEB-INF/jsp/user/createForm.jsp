<!--
   DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
  
   This file is part of jscms
    
   Author: Sandeep Manne
   ver. 1.00
   Copyright: CoStrategix <info@costrategix.com>
  
   jscms is free software: you can redistribute it
   and/or modify it under the terms of the GNU General Public License
   as published by the Free Software Foundation, either version 3 of
   the License, or (at your option) any later version.
   
   jscms is distributed WITHOUT ANY WARRANTY.
   See the license for more details.
    
   You should have received a copy of the GNU General Public License
   along with jscms. If not, see
   <http://www.gnu.org/licenses/>.
-->
<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<METAÂ http-equiv="Content-Type"Â content="text/html;charset=UTF-8">
	<title>Create Account</title>
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/screen.css" />" type="text/css" media="screen, projection">
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/print.css" />" type="text/css" media="print">
	<!--[if lt IE 8]>
		<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
	<![endif]-->
</head>	
<body>
<div class="container">
	<h1>
		Create Account
	</h1>
	<div class="span-12 last">	
		<form:form modelAttribute="user" action="${user.id}" method="post">
		  	<fieldset>		
				<legend>Account Fields</legend>
				<p>
					<form:label	for="firstName" path="firstName" cssErrorClass="error">First Name</form:label><br/>
					<form:input path="firstName" /> <form:errors path="firstName" />	
				</p>
				<p>	
					<form:label for="lastName" path="lastName" cssErrorClass="error">Last Name</form:label><br/>
					<form:input path="lastName" /><form:errors path="lastName" />	
				</p>
				<p>
					<form:label for="email" path="email" cssErrorClass="error">Email</form:label><br/>
					<form:input path="email" /><form:errors path="email" />	
				</p>
				<p>	
					<form:label for="dob" path="dob" cssErrorClass="error">Date of birth</form:label><br/>
					<form:input path="dob" /><form:errors path="dob" />	
				</p>
				<p>	
					<form:label for="primaryAccount.name" path="primaryAccount.name">Account Name</form:label><br/>
					<form:input path="primaryAccount.name"/>
				</p>
				<p>	
					<form:label for="primaryAccount.password" path="primaryAccount.password">Password</form:label><br/>
					<form:input path="primaryAccount.password"/>
				</p>
				
				<p>
					<input type="submit">
				</p>
			</fieldset>
		</form:form>
	</div>
	<hr>	
	<ul>
		<li> <a href="?locale=en_us">us</a> |  <a href="?locale=en_gb">gb</a> | <a href="?locale=es_es">es</a> | <a href="?locale=de_de">de</a> </li>
	</ul>	
</div>
</body>
</html>