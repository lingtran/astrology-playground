<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Gradle + Spring MVC</title>

</head>


  <div class="container">
	<h1>${title}</h1>
	<p>
		<c:if test="${not empty msg}">
			Hello ${msg}
		</c:if>

		<c:if test="${empty msg}">
			Welcome Welcome!
		</c:if>
        </p>
        <p>
		<a class="btn btn-primary btn-lg"
                    href="#" role="button">Learn more</a>
	</p>
	</div>



  <hr>
  <footer>
	<p>© Mkyong.com 2015</p>
  </footer>
</div>


</body>
</html>