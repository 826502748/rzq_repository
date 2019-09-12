<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

     <table border="1">
          <tr>
              <th>序号</th>
              <th>区域名称</th>
              <th>监测时间</th>
              <th>雨量值(mm)</th>
              <th>监测站</th>
              <th>站点地址</th>
              <th>操作</th>
          </tr>
         <c:forEach items="${rainList}" var="list" varStatus="a">
             <tr>
                 <td>${list.id}</td>
                 <td>${list.districtName}</td>
                 <td><fmt:formatDate value="${list.moniTor}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
                 <td>${list.rain}</td>
                 <td>${list.monitoringStation}</td>
                 <td>${list.monitoringAddress}</td>
                 <td><a href="#">删除</a></td>
             </tr>
         </c:forEach>
     </table>
</body>
</html>
