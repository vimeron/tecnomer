<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comercializadora TecnoMer</title>
    <link href="css/estilos.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    
 <div class="Container">
  <div id="logo"><img src="images/logo.png" alt="Logo" width="150"></div>
  <div id="title">
    <h1>ADMINISTRACIÓN TIENDA DE COMPUTADORES</h1>
  </div>
  <div id="content">
        
    <h2>OPCIONES</h2>
        <ul>
          <li class="seccion">Usuarios:
            <ul class="elementos">
              <li><a href="${pageContext.request.contextPath}/listUsuarios.do">Listar Usuario</a></li>
              <li><a href="catalog/insertUser.jsp">Agregar Usuario</a>          </li>
            </ul>
          </li>
          <li class="seccion">Productos:</li>
          <ul class="elementos">
            <li><a href="${pageContext.request.contextPath}/listProducts.do">Listar Productos</a></li>
            <li><a href="catalog/findProduct.jsp">Buscar Producto</a></li>
            <li><a href="catalog/insertProduct.jsp">Agregar Producto</a></li>
            <li><a href="${pageContext.request.contextPath}/listProducts.do">Actualizar Producto</a></li>
            <li><a href="catalog/deleteProduct.jsp">Eliminar Producto</a></li>
          </ul>
          <li class="seccion">Empleados:
            <ul class="elementos">
              <li><a href="${pageContext.request.contextPath}/listEmpleados.do">Listar Empleado</a></li>
              <li><a href="catalog/insertEmpl.jsp">Agregar Empleado</a>          </li>
            </ul>
          </li>
    </ul>

<div class="enlace"><a href="index.jsp">Salir</a></div>

  </div>

</div>   

    </body>
</html>