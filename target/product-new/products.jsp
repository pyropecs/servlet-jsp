<%@page import="com.jdbc.FetchProducts" %>
<html lang="en">
<head>
   
    <title>Products</title>
</head>
<body>
    <%
    String priceParameter = request.getParameter("price");
    int price = Integer.parseInt(priceParameter);
    
    %>

    <h1>
        Products that are lesser than <%= priceParameter %> 
    </h1>

<%

FetchProducts fp = new FetchProducts();
String[] products = fp.fetchProduct(price);
for(String product:products){
    out.println(product);
}
%>




</body>
</html>