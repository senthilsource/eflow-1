<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:out value="${message}"/>
<form:form method="POST" modelAttribute="form">
UserName:  <form:input path="userName"/><br/>
Password:  <form:password path="password"/><br/>
<input type="submit" value="Submit" />
 <br/>
 New User? Click here to <a href="/RegisterLoginApp/register.do">Register</a>
 <br/>
 
</form:form>