<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/3/29
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/runAddBook" method="post">
    <p>
        书名：<input type="text" name="bookName" placeholder="请输入书名" required/>
    </p>
    <p>
        存量：<input type="text" name="bookCounts" placeholder="请输入存量" required/>
    </p>
    <p>
        描述：<input type="text" name="detail" placeholder="请输入描述"/>
    </p>
    <p>
        <input type="submit" value="添加"/>
    </p>
</form>

</body>
</html>
