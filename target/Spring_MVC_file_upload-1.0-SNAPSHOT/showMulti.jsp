<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_file_upload
  File name(文件名): showMulti
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/11
  Time(创建时间)： 16:57
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>详情</td>
        <td>文件名</td>
    </tr>
    <!-- 同时取两个数组的元素 -->
    <c:forEach items="${multiFileDomain.description}" var="description" varStatus="loop">
        <tr>
            <td>${description}</td>
            <td>${multiFileDomain.myFile[loop.count-1].originalFilename}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
