<%-- 
    Document   : newjsp
    Created on : Mar 9, 2014, 1:02:45 PM
    Author     : Andrea
--%>

<%@page import="com.Cryptsy;"%>
<jsp:include page="template.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String mens = "";
            if (request.getParameter("cnt") != null) {
                switch (Integer.parseInt(request.getParameter("cnt"))) {
                    case 1: {
                        mens = "El usuario no existe";
                        break;
                    }
                    case 2: {
                        mens = "La contraseña es incorrecta";
                        break;
                    }
                    case 3: {
                        mens = "El usuario ya ha cerrado sesion el dia de hoy";
                        break;
                    }
                    default: {
                        mens = "";
                    }
                }
            }
        %>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>

        <form method="post" action="LoginB" class="container">
            <h1></h1>
            <div class="jumbotron" style="width: 70%; margin-left: auto; margin-right: auto">
                <%= "<h1>" + mens + "</h1>"%>
                <p>ID De Usuario</p>
                <input type="text" width="70%" name="inptId"/>
                <p>Contraseña</p>
                <input type="password" width="70%" name="inptContra"/> </br>
                <button type="submit" >Ingresar</button> 
            </div>
        </form>

        <!-- para eliminar todos los contenidos de "controldehorarios",
        horas y shiftreports -->
        <div style="width:200px; margin-left: 100px; border-style: solid; border-bottom-color: #000; padding:20px">
            <form method='post' action="FlushDB">
                <p>Solo por el momento, para no tener que estar borrando cosas
                    directamente desde la base de datos</p>
                <button type='submit' > flush DB</button>
            </form>
        </div>

        <iframe tabindex="-1" style="width: 1px; height: 1px; position: absolute; top: -100px;" src="https://accounts.google.com/o/oauth2/postmessageRelay?parent=http%3A%2F%2Fwww.coinwarz.com#rpctoken=463841963&amp;forcesecure=1" id="oauth2relay2052587594" name="oauth2relay2052587594">

        </iframe>

    </body>

    <script type='text/javascript'>
        frases.push("such autentication");
        frases.push("much security");



    </script>

</html>