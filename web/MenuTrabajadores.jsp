<%-- 
    Document   : MenuTrabajadores
    Created on : Mar 9, 2014, 1:26:00 PM
    Author     : Andrea

    recibe un parametro que es el id del trabajador y despliega sus datos
--%>
<jsp:include page="template.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabajador: (Nombre Trabajador)</title>
    </head>
    <body>

        <div class='container'>
            <table class="table">
                <tbody>
                    <tr>
                        <td>
                            <h2>
                                Trabajador: (Nombre Trabajador)
                            </h2>

                            <table class="table table-striped" style="width: 80%; margin-top: 5%;">
                                <tbody>
                                    <tr>
                                        <td>
                                            <h4> <span class='glyphicon glyphicon-user'></span> Nombre:</h4>
                                        </td>
                                        <td>
                                            <h4><strong> (Nombre Trabajador </strong></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h4> <span class='glyphicon glyphicon-glass'></span> Id:</h4>
                                        </td>
                                        <td>
                                            <h4><strong> (Id Trabajador </strong></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h4> <span class='glyphicon glyphicon-question-sign'></span> Estado: </h4>
                                        </td>
                                        <td>
                                            <h4><strong> (Estado Trabajador </strong></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h4> <span class='glyphicon glyphicon-usd'></span> Precio Por Hora:</h4>
                                        </td>
                                        <td>
                                            <h4><strong> (Precio Trabajador </strong></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h4> <span class=' glyphicon glyphicon-thumbs-up'></span> Fecha Contratacion:</h4>
                                        </td>
                                        <td>
                                            <h4><strong> (Contratacion Trabajador </strong></h4>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h4> <span class='glyphicon glyphicon-trash'></span> Fecha Despido:</h4>
                                        </td>
                                        <td>
                                            <h4><strong> (Despido Trabajador </strong></h4>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </td>
                        <td>
                            <div class="jumbotron " style="width: 100%; margin-top: 25%">
                                <p>
                                    <button type="button" class="btn btn-primary btn-lg">Modificar</button>
                                </p>
                                <p>
                                    <button type="button" class="btn btn-primary btn-lg">Historial de Pagos</button>
                                </p>
                                <p>
                                    <button type="button" class="btn btn-primary btn-lg">Despedir</button>
                                </p>
                            </div>
                        </td>
                    </tr>    
                </tbody>
            </table>
                    <textarea style="max-width: 100%; min-width: 100%" class="form-control" rows="4" >"Tags"</textarea>

        </div>
    </body>
</html>
