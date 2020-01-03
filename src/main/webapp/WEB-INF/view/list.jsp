<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
    <form action="list" method="post" >
    
     价格:<input type="text" name="startPrice" value="${gvo.startPrice }" >--<input type="text" name="endPrice" value="${gvo.endPrice }"  ><br>
     百分比:<input type="text" name="startSales" value="${gvo.startSales}"  >--<input type="text" name="endSales"  value="${gvo.endSales }" ><br>
    排序：<select name="orderColum">
     <option value="price" ${gvo.orderColum=="price"?"selected":"" }>价格</option>
     <option value="sales" ${gvo.orderColum=="sales"?"selected":"" }>百分比</option>
    </select>
    <select name="orderMethod">
     <option value="desc" ${gvo.orderColum=="desc"?"selected":"" }>倒序</option>
     <option value="asc" ${gvo.orderColum=="asc"?"selected":"" }>正序</option>
    
    </select>
    
    <button type="submit" >查询</button>
    
   
   
<table class="table table-hover">
		<tr>
			<td>商品ID</td>
			<td>名称</td>
			<td>价格</td>
			<td>销售比</td>
		</tr>
		<c:forEach items="${list}" var="g">
		
		 <tr>
		  <td>${g.id }</td>
		  <td>${g.name }</td>
		  <td>${g.price }</td>
		  <td>${g.sales }</td>
		 </tr>
		
		</c:forEach>
		 <tr>
				<td colspan="15">
					<button name="pageNum" value="1">首页</button>
					<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
					<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage}">下一页</button>
					<button name="pageNum" value="${pg.pages }">末页</button>
				</td>
		</tr>
	</table>
</form>
</body>

</html>

