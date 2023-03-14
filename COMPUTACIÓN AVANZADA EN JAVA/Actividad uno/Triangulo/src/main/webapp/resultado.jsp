
    <%@page import="models.opTriangulo" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Conten-Type" content="text/html; charset=UTF-8">
<title>TrianguloJSP</title>
</head>
<body>
	<%
	String xbase = request.getParameter("xbase");
    String xaltura = request.getParameter("xaltura");
    opTriangulo fTriangulo = new opTriangulo(xaltura, xbase);
    fTriangulo.calculaArea();
    fTriangulo.calculaPerimetro();
	%>	
            <div class="row">
                <div><h3>Calculador de operaciones</h3></div>
            </div>
            <div>
                <div>Area: </div>
                <div><%= fTriangulo.getArea() %></div>
                </div>
            <div>
                <div>Perimetro: </div>
                <div><%= fTriangulo.getPerimetro() %></div>
       		 </div>
   	<form action="index.jsp"method="post">
    <button> Regresar </button> 
    </form>
</body>
</html>