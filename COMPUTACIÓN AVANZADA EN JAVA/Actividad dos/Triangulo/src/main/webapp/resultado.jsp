<%@page import="model.opTriangulo" %>
<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Conten-Type" content="text/html; charset=UTF-8">
<title>Resultado Area y Perimetro</title>
</head>
<body>
	<%
	
    opTriangulo r = (opTriangulo) request.getAttribute("rTrianguloResult");
    
	%>	
            <div class="row">
                <div><h3>Calculador de operaciones</h3></div>
            </div>
            <div>
                <div>Area: </div>
                <div><%= r.Area() %></div>
                </div>
            <div>
                <div>Perimetro: </div>
                <div><%= r.Perimetro() %></div>
       		 </div>
   	<form action="index.jsp"method="post">
    <button> Regresar </button> 
    </form>
</body>
</html>