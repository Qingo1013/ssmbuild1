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

<form action="${pageContext.request.contextPath}/runUpdateBook" method="post">
    <input type="hidden" name="bookId" value="${obj.bookId}"/>
    <p>
        书名：<input type="text" name="bookName" value="${obj.bookName}"/>
    </p>
    <p>
        存量：<input type="text" name="bookCounts" value="${obj.bookCounts}" />
    </p>
    <p>
        描述：<input type="text" name="detail" value="${obj.detail}"/>
    </p>
    <p>
        <input type="submit" value="修改"/>
    </p>
</form>

</body>
</html>
