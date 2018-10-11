<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/10/2018
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring FrameWork</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/alumno/save" method="POST" name="Datos" enctype="multipart/form-data">
    <table>
        <tr>
            <td>
                <label for="apePad">Apellido Paterno</label>:
            </td>
            <td>
                <input type="text" name="apePad" id="apePad" value="${Datos.apePad}">
                <span style="color:red" ${Results.getFieldError("apePad").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="apeMat">Apellido Materno</label>:
            </td>
            <td>
                <input type="text" name="apeMat" id="apeMat" value="${Datos.apeMat}">
                <span style="color: red" ${Results.getFieldError("apeMat").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="desNom">Nombres</label>:
            </td>
            <td>
                <input type="text" name="desNom" id="desNom" value="${Datos.desNom}">
                <span style="color:red" ${Results.getFieldError("desNom").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="fchNac">Fecha de Nacimiento</label>:
            </td>
            <td>
                <input type="date" name="fchNac" id="fchNac" value="${Datos.fchNac}">
                <span style="color:red" ${Results.getFieldError("fchNac").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="tipIde">Tipo de Identificación: </label>
            </td>
            <td>
                <select name="tipIde" id="tipIde">
                    <option value="1">Cédula Ciudadanía</option>
                    <option value="1">Pasaporte</option>
                    <option value="1">Cédula Extranjera</option>
                    <option value="1">Tarjeta de Identidad</option>
                    <option value="1">Registro Civil</option>
                </select>
                <span style="color: red" ${Results.getFieldError("tipIde").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="desIde">Número</label>
            </td>
            <td>
                <input type="text" name="desIde" id="desIde" value="${Datos.desIde}">
                <span style="color: red" ${Results.getFieldError("desIde").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="desEma">E-Mail</label>:
            </td>
            <td>
                <input type="email" name="desEma" id="desEma" value="${Datos.desEma}">
                <span style="color: red" ${Results.getFieldError(desEma).defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="desEma">Genero</label>:
            </td>
            <td>
                Femenino: <input type="radio" name="ideGen" value="0"><br>
                Masculino: <input type="radio" name="ideGen" value="1"><br>
                <span style="color: red" ${Results.getFieldError("ideGen").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="ideNiv">Nivel</label>:
            </td>
             <td>
                 <select name="ideNiv" id="ideNiv">
                     <option value="1">Inicial</option>
                     <option value="2">Primaria</option>
                     <option value="3">Secundaria</option>
                 </select>
                 <span style="color: red"${Results.getFieldError("ideNiv").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>
                <label for="ideNiv">Descripción del Curso</label>
            </td>
            <td>
                <input type="checkbox" name="cursoDtoList[1].ideCur" value="1">Lenguaje
                <input type="checkbox" name="cursoDtoList[2].ideCur" value="2">Matemáticas
                <input type="checkbox" name="cursoDtoList[3].ideCur" value="3">Física
                <span style="color: red" ${Results.getFieldError("ideCur").defaultMessage}></span>
            </td>
        </tr>
        <tr>
            <td>

            </td>
            <td>
             <!--   <input type="file" name="desFot" value="${Datos.desFot}">-->
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" name="Guardar"><br>
            </td>
        </tr>



    </table>
        <p>
            ${NombreCompleto}
        </p>

    </form>
</body>
</html>

