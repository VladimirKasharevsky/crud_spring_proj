<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
<title>Web project</title>

</head>
    <body>
        <form action="/admin" method="post">
        <h4>Sign In</h4>
           <p>Name: </p> <input type="text" name="name" value = ""/>
           <p>Password:</p> <p><input type="password" name="pass" value = "" />
            <input type="submit" value="signin">
        </form>

    </body>
</html>
