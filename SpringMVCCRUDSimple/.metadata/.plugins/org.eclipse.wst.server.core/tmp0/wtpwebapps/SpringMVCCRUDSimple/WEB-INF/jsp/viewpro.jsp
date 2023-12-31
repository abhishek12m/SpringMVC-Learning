
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Products List</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Product Invoice</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="pro" items="${list}">
		<tr>
			<td>${pro.id}</td>
			<td>${pro.name}</td>
			<td>${pro.invoice}</td>
			<td><a href="editpro/${pro.id}">Edit</a></td>
			<td><a href="deletepro/${pro.id}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="proform">Add New Product</a>