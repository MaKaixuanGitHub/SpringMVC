<%--
  Created by IntelliJ IDEA.
  User: MaKaixuan
  Date: 2021/4/5
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title><%-- import Bootstrap css --%>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <samll>新增书籍</samll>
                </div>
            </div>
        </div>

        <%-- input name 必须跟实体类的name一致 --%>
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label for="bookName">书籍名称</label>
                <input type="text" name="bookName" class="form-control required" id="bookName">
            </div>
            <div class="form-group">
                label for="bookCount">书籍数量</label>
                <input type="text" name="bookCounts" class="form-control required" id="bookCount">
            </div>
            <div class="form-group">
                <label for="bookDetil">书籍描述</label>
                <input type="text" name="detail" class="form-control required" id="bookDetil">
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" id="添加">
            </div>
        </form>
    </div>
</body>
</html>
