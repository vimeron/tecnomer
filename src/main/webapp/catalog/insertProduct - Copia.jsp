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
        <title>Insertar Producto</title>
    <link href="../css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <div class="Container">
      <div id="title">
  <h1>Agregar producto</h1>
      </div>
      <div id="content">
  <form action="${pageContext.request.contextPath}/insertProduct.do" method="post"><table border="0" align="center" cellpadding="2" cellspacing="2">
  <tr>
    <th align="right" scope="row">ID:</th>
    <td><input name="id_producto" type="text" id="id_producto" maxlength="3"></td>
    <td rowspan="4" align="center"><input type="submit" value="Guardar" class="boton"></td>
  </tr>
  <tr>
    <th align="right" scope="row">Nombre:</th>
    <td><input name="nombre_producto" type="text" id="nombre_producto" maxlength="50"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Valor:</th>
    <td><input name="valor" type="text" id="valor" maxlength="6"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Catálogo:</th>
    <td><input name="id_catalogo" type="text" id="id_catalogo" maxlength="3"></td>
    </tr>
</table>
  </form>
  <div class="enlace"><a href="../admin.jsp">Volver</a></div>
      </div>
    </div>
    </body>
</html>
