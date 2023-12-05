<%@ page import="SQL.Conexion"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conexion con SQL workbench</title>
</head>
<body>
<h1>Conexion</h1>
<%
try{
	Conexion con=new Conexion();
	out.write("Conexión exitosa");
}catch (Exception e){
	out.write("Ha ocurrido un error"+ e.getMessage());
}
%>
</body>
</html>