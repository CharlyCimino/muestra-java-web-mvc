<!DOCTYPE html>
<html>
    <head>
        <title>Saludador</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            html {
                font-family: "Arial", sans-serif;
            }
            
            h1 {
                font-size: 1.2rem;
            }
        </style>
    </head>
    <body>
        <h1>Saludador Web - MVC</h1>
        <p>Ingresá tus datos. El servidor web va a saludarte</p>
        <form name="form1" action="${pageContext.request.contextPath}/servlet-controlador" method="post" >
            <label for="nombre">Nombre:</label> 
            <input type="text" id="nombre" name="nombre">
            <br/><br/>
            <label for="apellido">Apellido</label> 
            <input type="text" id="apellido" name="apellido">
            <br/><br/>
            <label for="nacimiento">Fecha de nacimiento</label>
            <input type="date" id="nacimiento" name="nacimiento">
            <br/><br/>
            <input type="submit" value="Saludar">
            <input type="reset" value="Borrar datos">
        </form>
    </body>
</html>
