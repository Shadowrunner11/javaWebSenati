<%-- 
    Document   : Reporte
    Created on : 25/08/2021, 12:43:09 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Reporte</title>
    </head>
    <body>
        <main class="container-fluid">
        <h1>Reporte</h1>
        <p>Estimado/a ${ayudante.datos.fullname} el resumen de su pago es</p>
        <p>Su sueldo base es ${ayudante.datos.sueldoB}</p>
        <p>Su bono es ${ayudante.datos.bono}</p>
        <p>Su comision es ${ayudante.datos.comision}</p>
        <p>Su sueldo bruto es ${ayudante.datos.sueldBruto}</p>
        <p>Su descuento es ${ayudante.datos.descuento}</p>
        <p>Su sueldo neto es ${ayudante.datos.sueldoNeto}</p>
        <form action="Controller" method="POST">
            <input class="btn btn-primary" type="submit" value="editar" name="editar">
            <input class="btn btn-primary" type="submit" value="confirmar" name="confirmar">
            <input type="hidden" name="fullname" value="${ayudante.datos.fullname}">
            <input type="hidden" name="sueldoB" value="${ayudante.datos.sueldoB}">
        </form>
        </main>
    </body>
</html>
