<!DOCTYPE springForm:form PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>

<script type="text/javascript" src="script/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
<!--

//-->
</script>
<springForm:form name="masterForm" commandName="ControllerCommand" method="POST">

<table>
  <tr>
    <td>Name</td>
   <td> <springForm:input path="userName"/></td>
  </tr>
  <tr>
    <td>Address1</td>
    <td><springForm:textarea path="address1"/></td>
  </tr>
  <tr>
    <td>Address2</td>
    <td><springForm:textarea path="address2"/></td>
  </tr>
  <tr>
    <td>Amount</td>
    <td><springForm:input path="amount"/></td>
  </tr>
  <tr>
  	<td>
  		<button>Save</button>
  	</td>
  </tr>
</table>




</springForm:form>
