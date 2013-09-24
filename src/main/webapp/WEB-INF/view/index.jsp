<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The Tester</title>
    </head>
    <body>
        <h1>Welcome to The Tester</h1>
        
        <form name='f' action="<c:url value='j_spring_security_check' />"
		method='POST'> 
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
                            <td><spring:message code="password"/></td>
				<td><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="<spring:message code="sign_in"/>" type="submit"
					value="Sign in" />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="reset" type="reset" />
				</td>
			</tr>
		</table>
 
	</form>        
        <h3>Message : ${message}</h3>	
	<h3>Username : ${username}</h3>	 
    </body>
</html>
