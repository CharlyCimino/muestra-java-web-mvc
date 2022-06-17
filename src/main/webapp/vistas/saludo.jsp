<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludando...</title>
    </head>
    <body>        
        <c:set var="laEdad" value="${laPersona.edad}"/>
        
        ${laPersona.nombre}
        
        <h1>¡Hola ${laPersona.nombreCompleto}!</h1>
        <p>
            Según mis cálculos,  
            <c:choose>
                <c:when test = "${laEdad < 0}">
                    todavía no has nacido...
                </c:when>
                <c:when test = "${laEdad == 0}">
                    todavía sos bebé...
                </c:when>
                <c:otherwise>
                    actualmente tenés ${laEdad} años
                    <c:if test="${laEdad > 122}">
                        , lo que te convierte en
                        <a target="_blank" href="https://es.wikipedia.org/wiki/Anexo:Las_100_personas_m%C3%A1s_ancianas_de_todos_los_tiempos">
                            ¡un nuevo récord!
                        </a>
                    </c:if>
                </c:otherwise>
            </c:choose>
        </p>
        <c:if test="${laPersona.cumpleanios}">
            <p>Por cierto, <strong>¡FELIZ CUMPLEAÑOS!</strong></p>
        </c:if>
        <p>Ahora, si puedo, voy a deletrear tu nombre:</p>
        <ul>
            <c:forEach items="${laPersona.letrasDelNombre}" var="letra">
                <li>${letra}</li>
            </c:forEach>
        </ul>
        <a href="${pageContext.request.contextPath}">Volver...</a>
    </body>
</html>
