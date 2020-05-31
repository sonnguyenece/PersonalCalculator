<%--
  Created by IntelliJ IDEA.
  User: sonnguyen
  Date: 5/31/2020
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CALCULATOR</title>
</head>
<body>
Hello
<form action="calculate">
    <input type="text" name="num1" width="100px" placeholder="number1" value="${num1}">
    <input type="text" name="num2" width="100px" placeholder="number2" value="${num2}">
    <br>
    <br>
    <button name="operator" type="submit" id="add" value="+">Addition(+)</button>
    <button name="operator" type="submit" id="sub" value="-">Subtraction(-)</button>
    <button name="operator" type="submit" id="mul" value="*">Multiplication(X)</button>
    <button name="operator" type="submit" id="div" value="/">Division(/)</button>

</form>

<h1>Result ${operator} : ${result}</h1>

</body>
</html>
