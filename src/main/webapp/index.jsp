<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <style>
            body.center{
                margin: 0;
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                text-align: center;
                color:#E9F92F;
            }

            body::before{
                position: fixed;
                content: "";
                top: 0;
                left: 0;
                height: 100%;
                width: 100%;
                background-image: linear-gradient(
                    115deg,
                    rgba(158, 179, 236, 0.8),
                    rgba(70, 67, 95, 0.7)
                  ),
                  url(https://upload.wikimedia.org/wikipedia/commons/5/52/Lake_Clearwater%2C_Canterbury%2C_New_Zealand_02.jpg);

                background-size: cover;
                background-repeat: no-repeat;
                background-position: center;
                z-index: -1;
            }
            
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="newcss.css" rel="stylesheet">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <title>Calculo de sueldo</title>
    </head>
    <body class="center">
        <h1>Calculo de sueldo</h1>
        <form action="Controller" method="POST">
            <div class="form-group">            
            <label class="form__label"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> Apellidos y nombres<input class="form-control" type="text" name="fullname" value="${ayudante.datos.fullname}"></label>    
            <label class="form__label"><span class="input-group-addon"><i class="glyphicon glyphicon-usd"></i></span> Sueldo Base<input class="form-control" type="number" name="sueldoB" value="${ayudante.datos.sueldoB}"></label>            
            </div>
            
            <div class="form-group flex-container">
            <label><input type="radio" name="cargo" value="jefe">Jefe</label>
            <label><input  type="radio" name="cargo" value="admin">Administrativo</label>
            <label><input type="radio" name="cargo" value="operario">Operario</label>
            <label><input  type="hidden"></label>
            </div>
            
            <div class="form-group flex-container">
            <label><input type="radio" name="contrato" value="planilla">Planilla</label>
            <label><input  type="radio" name="contrato" value="snp">SNP</label>
            </div>
            
            <input class="btn btn-primary" type="submit" value="Evaluar" name="evaluador">
        </form>
    </body>
</html>
