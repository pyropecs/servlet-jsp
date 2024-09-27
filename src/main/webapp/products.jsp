<%@page import="com.jdbc.FetchProducts" %>
<html lang="en">
<head>
   
    <title>Products</title>
</head>
<body>
    <h1>
        Products
    </h1>

<%
String priceParameter = request.getParameter("price");
int price = Integer.parseInt(priceParameter);

FetchProducts fp = new FetchProducts();
String[] products = fp.fetchProduct(price);
for(String product:products){
    out.println(product);
}
%>

<%= priceParameter %>


</body>
</html>