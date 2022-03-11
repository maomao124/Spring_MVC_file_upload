<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_file_upload
  File name(文件名): fleUpload
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/11
  Time(创建时间)： 16:27
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/fileUpload"
      method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="myFile"><br>
    文件描述：<input type="text" name="description"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
