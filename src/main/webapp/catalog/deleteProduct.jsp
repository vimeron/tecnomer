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
        <title>Borrar producto</title>
    <link href="../css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
<div class="Container">
<div id="logo"><img src="../images/logo.png" alt="Logo" width="150"></div>
        <div id="title">
          <h1>Eliminar producto</h1>
        </div>
        <div id="content">
  <form action="${pageContext.request.contextPath}/deleteProduct.do" method="post">
  <table border="0" align="center" cellpadding="2" cellspacing="2">
  <tr>
    <th scope="row">Ingrese el ID del producto a eliminar: </th>
    <td><input name="id_producto" type="text" id="id_producto" size="3" maxlength="3"></td>
    <td><input type="submit" value="Borrar" class="boton"></td>
  </tr>
  </table>
  </form>
  
  <div class="enlace"><a href="../admin.jsp">Volver</a></div>
        </div>
    
</div>    
</body>
</html>
