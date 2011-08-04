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
	<META http-equiv="Content-Type"Â content="text/html;charset=UTF-8">
	<title>@Controller Example</title>
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/screen.css" />" type="text/css" media="screen, projection">
	<link rel="stylesheet" href="<c:url value="/resources/blueprint/print.css" />" type="text/css" media="print">
	<!--[if lt IE 8]>
		<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
	<![endif]-->
</head>	
<body>
<div class="container">
	<h1>
		<fmt:message key="welcome.title"/> View Account
	</h1>
	<div class="span-12 last">	
		<form:form modelAttribute="user" action="${user.id}" method="post">
		  	<fieldset>		
				<legend>Account Fields</legend>
				<p>
					<form:label	for="firstName" path="firstName">First Name</form:label><br/>
					<form:input path="firstName" readonly="true"/>		
				</p>
				<p>	
					<form:label for="lastName" path="lastName">Last Name</form:label><br/>
					<form:input path="lastName" readonly="true"/>
				</p>
				<p>
					<form:label for="email" path="email">Email</form:label><br/>
					<form:input path="email" readonly="true"/>
				</p>
				<p>	
					<form:label for="dob" path="dob">Date of birth</form:label><br/>
					<form:input path="dob" readonly="true"/>
				</p>
				<p>	
					<form:label for="primaryAccount.password" path="primaryAccount.password">Password</form:label><br/>
					<form:input path="primaryAccount.password" readonly="true"/>
				</p>
			</fieldset>
		</form:form>
	</div>
	<hr>	
	<ul>
		<li> <a href="?locale=en_us">us</a> |  <a href="?locale=en_gb">gb</a> | <a href="?locale=es_es">es</a> | <a href="?locale=de_de">de</a> </li>
	</ul>	
	<c:forEach var="column" items="${user.columns}">
		${column.name}
	</c:forEach>
</div>
</body>
</html>