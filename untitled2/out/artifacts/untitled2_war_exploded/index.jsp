<%--
  Created by IntelliJ IDEA.
  User: chaohui
  Date: 2020/4/23
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>营销号生成器</title>
  </head>
  <body>
    <div>
      <div>
        @by bswaterb
      </div>
      <div>
        <h1>请输入关键词：</h1>
      </div>
      <div>
        <form action="${pageContext.request.contextPath }/create">
          关键词1（如名词）:<input type="text" name="theme1"><br/>
          关键词2（如形容词）：<input type="text" name="theme2"><br/>
          <input type="submit" value="确认生成">
        </form>
      </div>

      <div>
        <br/>
        <br/>
        <h2>示例：</h2>
        <h3> 输入：</h3><img src="${pageContext.request.contextPath }/images/example1.png">
        <h3> 输出：</h3><img src="${pageContext.request.contextPath }/images/example2.png">
      </div>

    </div>
  </body>
</html>
