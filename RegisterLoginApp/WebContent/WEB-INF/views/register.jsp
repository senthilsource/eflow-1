<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<<c:out value="${message }"></c:out>
<form:form method="POST" modelAttribute="user">
FirstName:  <form:input path="firstName"/>
LastName:  <form:input path="lastName"/>
UserName:  <form:input path="userName"/>
Password:  <form:input path="password"/>
<input type="submit" value="submit"/>
</form:form>
<br/><br/>
Click here to <a href="/RegisterLoginApp/login.do">Login</a><br/>
  Click here to <a href="/RegisterLoginApp/logout.do">Logout</a>
