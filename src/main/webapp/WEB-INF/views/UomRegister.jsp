<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome TO UOM Register Page..!!</h1>
	<form action="insertUom" method="Post">
		<pre>
 UOM Type:<select name="uomType">
        <option value="-1">--Select--</option>
        <option value="PACK">PACKING</option>
        <option value="NOPACK">NO PACKING</option>
        <option value="NA">-NA-</option>
        </select><br />
 UOM Model:<input type="text" name="uomModel" /><br />
 Description:<textarea name="description"></textarea>
			<br />
      <input type="submit" value="Create UOM" />      

		</pre>

	</form>
</body>
</html>