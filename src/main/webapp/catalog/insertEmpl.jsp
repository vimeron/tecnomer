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
        <title>Insertar Empleado</title>
    <link href="../css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <div class="Container">
    <div id="logo"><img src="../images/empleado.png" alt="Logo" width="150"></div>
      <div id="title">
  <h1>Agregar Empleado</h1>
      </div>
      <div id="content">
  <form action="${pageContext.request.contextPath}/insertEmpleado.do" method="post"><table border="0" align="center" cellpadding="2" cellspacing="2">
  <tr>
    <th align="right" scope="row">Identificación:</th>
    <td><input name="id_empleado" type="text" id="id_empleado" maxlength="10"></td>
    <td rowspan="4" align="center"><input type="submit" value="Guardar" class="boton"></td>
  </tr>
  <tr>
    <th align="right" scope="row">Nombre:</th>
    <td><input name="nombre_empleado" type="text" id="nombre_empleado" maxlength="30"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Dirección:</th>
    <td><input name="direccion" type="text" id="direccion" maxlength="55"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Telefono:</th>
    <td><input name="telefono" type="text" id="telefono" maxlength="20"></td>
    </tr>
</table>
  </form>
  <div class="enlace"><a href="../admin.jsp">Volver</a></div>
      </div>
    </div>
    </body>
</html>
