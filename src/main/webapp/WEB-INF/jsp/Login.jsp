<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns:c="http://java.sun.com/jsp/jstl/core"
    xmlns:fn="http://java.sun.com/jsp/jstl/functions" >

	<head>
		<meta charset="UTF-8">
		<title>Log in Page</title>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	
	<body style="text-align: center;">
		<h1>Please input your information!</h1>
		<br />
			<form action="Login.do" method="post">
				Username:<input type="text" name="username" style="margin: 5px;"/><br />
				&nbsp;Password:<input type="password" name="password" style="width: 157px; margin: 5px;"/><br /><br />
				<input type="submit" />
		
			<c:if test="${sessionScope.logInStatus.equals('false')}">
                <div class="alert alert-danger">
                     <strong>Invalid username and password.</strong>
                </div>
        	</c:if>
		
			</form>
			
	</body>
</html>
