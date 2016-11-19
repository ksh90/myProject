<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<title>Kosta Library</title>
<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/userLibrary/reset.css">
		<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/userLibrary/header2.css">
		<link rel="stylesheet" type="text/css" media="screen" href="/resources/css/userLibrary/menu.css">
		<script src="/resources/js/jquery-1.8.3.min.js"></script>
		<script src="/resources/js/tms-0.4.1.js"></script>
		<script src="/resources/js/menu.js"></script>
		
</head>
<body>
		<div class="slider">
		<tiles:insertAttribute name="header2" />
		</div>
		
			<div id="logincontent">
		<tiles:insertAttribute name="body" />
			</div>
		
		<div>
		<tiles:insertAttribute name="footer" />
		</div>
</body>
</html>