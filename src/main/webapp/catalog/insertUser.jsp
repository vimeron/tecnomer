<%-- 
    Document   : insertProduct
    Created on : 6/06/2015, 09:42:03 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Usuario</title>
    <link href="../css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <div class="Container">
    <div id="logo"><img src="../images/clients.png" alt="Logo" width="150"></div>
      <div id="title">
  <h1>Agregar Usuario</h1>
      </div>
      <div id="content">
  <form action="${pageContext.request.contextPath}/insertUsuario.do" method="post"><table border="0" align="center" cellpadding="2" cellspacing="2">
  <tr>
    <th align="right" scope="row">Identificación:</th>
    <td><input name="id_usuario" type="text" id="id_usuario" maxlength="10"></td>
    <td rowspan="4" align="center"><input type="submit" value="Guardar" class="boton"></td>
  </tr>
  <tr>
    <th align="right" scope="row">Nombre:</th>
    <td><input name="nombre_usuario" type="text" id="nombre_usuario" maxlength="30"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Contraseña:</th>
    <td><input name="password" type="password" id="password" maxlength="10"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Pregunta:</th>
    <td><input name="pregunta" type="text" id="pregunta" maxlength="50"></td>
    </tr>
</table>
  </form>
  <div class="enlace"><a href="../admin.jsp">Volver</a></div>
      </div>
    </div>
    </body>
</html>
