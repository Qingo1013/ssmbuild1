<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2021/3/29
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示图书界面</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <%--<script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>--%>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script>
        function del(){
            var id = document.getElementById("idtd").value;
            console.log(id);
            var toUrl = "${pageContext.request.contextPath}/deleteBookByAjax/"+id;
            alert(toUrl);
            $.post({
               url:toUrl,
                data:{'msg':'hello'},
                success:function (data) {
                    alert(data);
                }
            });
        };

        function del1(){
            var id = document.getElementById("idtd").value;
            console.log(id);
            var toUrl = "${pageContext.request.contextPath}/deleteBookByAjax/"+id;
            alert(toUrl);
            $.post({
                url:toUrl,
                data:{'msg':'hello'},
                success:function (data) {
                    //alert(data);
                    $.post({
                        url:"${pageContext.request.contextPath}/toShow",
                        success:function () {
                        }
                    });
                }
            });
        }


    </script>
</head>
<body>

<a class="button" href="${pageContext.request.contextPath}/addBook">添加图书</a>
<br>
<table >
    <thead>
        <tr>
            <td>书名</td>
            <td>存量</td>
            <td>描述</td>
            <td>操作</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${list}" var="item">
            <tr>
                <form><input id="idtd" type="hidden" value="${item.bookId}"/></form>
                <td>${item.bookName}</td>
                <td>${item.bookCounts}</td>
                <td>${item.detail}</td>
                <td>
                   <a href="${pageContext.request.contextPath}/updateBook?id=${item.bookId}" >修改</a>
                    <span><a style="margin-left: 20px;" href="${pageContext.request.contextPath}/deleteBook/${item.bookId}" >删除</a></span>
                    <button   onclick="del()">删除ajax</button>
                    <button   onclick="del1()">删除ajax1</button>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
