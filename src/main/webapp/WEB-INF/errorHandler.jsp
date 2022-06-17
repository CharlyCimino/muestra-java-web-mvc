<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error en el Servidor</title>
    </head>
    <style>
        .err {
            color: crimson;
        }
    </style>
    <body>
        <h1 class="err">Error en el Servidor</h1>
        <p><strong>Causa:</strong> ${msjDeError}</p>
        <br/>
        <p><a href="${pageContext.request.contextPath}">Volver...</a></p>
    </body>
</html>
