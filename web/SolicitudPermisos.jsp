<%-- 
    Document   : SolicitudPermisos
    Created on : Apr 13, 2014, 3:33:53 PM
    Author     : Christian
--%>

<jsp:include page="template.jsp" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud de Permisos</title>
    </head>
    <body>
        
            <form action="SolicitarPermiso" method="post" class="form-inline">
                <div class='container'>
                    <h2 style="margin-left:35%; margin-top:2%; margin-bottom: 5%">Solicitud de Permisos</h2>
                <div class="row" style="margin-left:10%">
                    <label><h4>Nombre: </h4></label>
                    <input type="text" style="margin-left:2%; margin-right: 4%; width:280px">
                    <label><h4>ID:</h4></label>
                    <input type="text" style="margin-left:2.5%; margin-right:3%; width:100px" name="id" id="id">
                    <label style="margin-right:4%"><h4>Motivo: </h4></label>
                    <select class="form-control" name="permiso" style="width:127.5px" id="permiso">
                        <option value="ausencia">Ausencia</option>
                        <option value="vacaciones">Vacaciones</option>
                        <option value="incapacidad">Incapacidad</option>
                        <option value="otros">Otros</option>
                    </select>      
                    
                </div>
                <div class="row" style="margin-top:2.5%; margin-left:10%">
                    <label style="margin-left:0%"><h4>Fecha/Inicio:</h4></label>
                    <input type="text" style="margin-left:2%; width:100px" name="fechainicio" id="fechainicio">
                    <label style="margin-left:1.8%"><h4>Fecha/Fin:</h4></label>
                    <input type="text" style="margin-left:2%; margin-right:3%; width:100px" name="fechafinal" id="fechafinal">
                    <label style="margin-right:2.5%"><h4>Departamento:</h4></label>
                    <select class="form-control" name="permiso" style="width:195px">
                        <option>Recursos Humanos</option>
                        <option>Mineria</option>
                    </select>
                </div>
                    <div class="row" style="margin-top:1%; margin-left:10%">
                        <label style="margin-top:2.5%">Mensaje</label>
                    </div>
                <textarea style="margin-left:10%; margin-top:1%; width: 835px" class="form-control" rows="10"></textarea>

                <input type="submit" name="enviar" value="Enviar" style="margin-left:77.5%;margin-top:2%" class="btn btn-primary"/>
            </div>
            </form>
        
    </body>
</html>

