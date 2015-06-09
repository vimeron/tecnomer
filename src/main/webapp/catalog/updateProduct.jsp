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
        <title>Actualizar producto</title>
    <link href="../css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <div class="Container">
    <div id="logo"><img src="../images/logo.png" alt="Logo" width="150"></div>
      <div id="title">
  <h1>Actualizar producto</h1>
      </div>
      <div id="content">
  <form action="${pageContext.request.contextPath}/updateProduct.do" method="post"><table border="0" align="center" cellpadding="2" cellspacing="2">
  <tr>
    <th align="right" scope="row">ID:</th>
    <td><input name="id_producto" type="text" id="id_producto" value="<%= request.getParameter("id") %>" maxlength="3" readonly></td>
    <td rowspan="5" align="center"><input type="submit" value="Actualizar" class="boton"></td>
  </tr>
  <tr>
    <th align="right" scope="row">Nombre:</th>
    <td><input name="nombre_producto" type="text" id="nombre_producto" value="<%= request.getParameter("prod") %>" maxlength="50"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Valor:</th>
    <td><input name="valor" type="text" id="valor" value="<%= request.getParameter("val") %>" maxlength="6"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Catálogo:</th>
    <td><input name="id_catalogo" type="text" id="id_catalogo" value="<%= request.getParameter("cat") %>" maxlength="3"></td>
    </tr>
  <tr>
    <th align="right" scope="row">Imagen:</th>
    <td align="center"><img src="../images/<%= request.getParameter("img") %>" alt="" width="100" height="100"></td>
    </tr>
  </table>
    <table width="200" align="center">
      <tr>
        <th colspan="4">Imágenes Disponibles</th>
      </tr>
      <tr>
        <td align="center"><label>
          <input name="imagen" type="radio" id="imagen_2" value="Camera.png">
          Ninguna<img src="../images/ImagenNoDisponible.png" alt="" width="100" height="100"></label></td>
        <td align="center"><input type="radio" name="imagen" value="Computer.png" id="imagen_3">
          Computador<img src="../images/Computer.png" width="100" height="100" alt=""></td>
        <td align="center"><input type="radio" name="imagen" value="Gaming-Pad.png" id="imagen_">
          Game Pad <img src="../images/Gaming-Pad.png" width="100" height="100" alt=""></td>
        <td align="center"><input type="radio" name="imagen" value="Headphones.png" id="imagen_4">
          Headphones<img src="../images/Headphones.png" width="100" height="100" alt=""></td>
      </tr>
      <tr>
        <td align="center"><input type="radio" name="imagen" value="iPod.png" id="imagen_9">
          iPod <img src="../images/iPod.png" width="100" height="100" alt=""></td>
        <td align="center"><input type="radio" name="imagen" value="Laptop.png" id="imagen_10">
          Laptop<img src="../images/Laptop.png" width="100" height="100" alt=""></td>
        <td align="center"><input type="radio" name="imagen" value="Printer.png" id="imagen_11">
          Printer<img src="../images/Printer.png" width="100" height="100" alt=""></td>
        <td align="center"><input type="radio" name="imagen" value="telefono.png" id="imagen_12">
          telefono<img src="../images/telefono.png" width="100" height="100" alt=""></td>
      </tr>
      <tr>
        <td align="center"><input type="radio" name="imagen" value="USB.png" id="imagen_5">
          USB<img src="../images/USB.png" width="100" height="100" alt=""></td>
        <td align="center"><input type="radio" name="imagen" value="WebCam.png" id="imagen_6">
          WebCam<img src="../images/WebCam.png" width="100" height="100" alt=""></td>
        <td align="center"><input type="radio" name="imagen" value="Camera.png" id="imagen_7">
          Camara<img src="../images/Camera.png" alt="" width="100" height="100"></td>
        <td align="center">&nbsp;</td>
      </tr>
    </table>
    <p>&nbsp;</p>

  </form>
  <div class="enlace"><a href="../admin.jsp">Volver al Menú Ppal</a></div>
  <div class="enlace"><a href="${pageContext.request.contextPath}/listProducts.do">Listar Productos</a></div>
      </div>
    </div>
    </body>
</html>
