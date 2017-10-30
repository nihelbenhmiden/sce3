<%@page import="Comptes.Compte"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="MonBean" scope="page" class="Comptes.Compte" type="Comptes.Compte"/>
Le Solde de:<P>
<jsp:setProperty property="*" name="MonBean"/>
<jsp:getProperty property="solde" name="MonBean" /> <BR>
<jsp:getProperty property="num" name="MonBean" /> <BR>
<jsp:getProperty property="nom" name="MonBean" /> <BR>


</body>
</html>