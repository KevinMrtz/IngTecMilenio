<%@page import="controller.showResult" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TrianguloJSP</title>
</head>
<body>   
	<h1>
      <font face="arial">Triangulo</font>
	</h1>
<form action="showResult" method= "post">
	<div>
	<label>
      <font face="arial" size="4">Base</font>
	</label>
      <input type="number" name="Altura">
	</div>
	<div>|
	<label>
      <font face="arial" size="4">Altura</font>
	</label>
      <input type="number" name="Base">
	</div>
	<button>Calcular</button>
</form>
</body>
</html>