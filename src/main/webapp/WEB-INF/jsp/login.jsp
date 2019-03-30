
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
    <div align="center" >
        <%--@elvariable id="person" type="com.models.Person"--%>
        <c:if test="${param['error']}">Incorect password or username</c:if>
        <form:form method="post" modelAttribute="person" action="admin">
            <table>
                <tr>
                    <td>Username</td>
                    <td><form:input path="username" name="username" id="username"/></td>
                    <td><form:errors path="username"/> </td>
                </tr>

                <tr>
                    <td>Password</td>
                    <td><form:input path="password" name="password" id="password"/></td>
                    <td><form:errors path="password"/> </td>
                </tr>

                <tr>
                    <td></td>
                    <td><form:button name="login" id="login">Login</form:button> </td>
                    <td></td>
                </tr>
            </table>
        </form:form>

    </div>
</body>
</html>
