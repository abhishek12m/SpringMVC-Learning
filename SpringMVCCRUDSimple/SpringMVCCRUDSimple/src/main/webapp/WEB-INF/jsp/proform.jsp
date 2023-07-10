<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Add New Product</h1>
<form:form method="post" action="save">
	<table>
		<tr>
			<td>Product Name :</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Product Invoice :</td>
			<td><form:input path="invoice" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>
