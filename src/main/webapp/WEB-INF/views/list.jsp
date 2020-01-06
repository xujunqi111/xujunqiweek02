<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.3.min.js"></script>
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/index3.css" rel="stylesheet">
</head>
<body>
<form action="list" method="post">
  关键字: <input type="text" name="mohu" value="${mohu }"><br/>
描述: <input type="text" name="miaoshu"   value="${miaoshu }"> <br/>

成立时间:<input type="text" name="startmonty"  value="${startmonty }">---<input type="text" name="endmonty" value="${endmonty }"><br/>

<button>查询</button>
  

</form>
	<table>
	     <tr>
	       <td>编号</td>
	       <td>关键字</td>
	       <td>描述</td>
	       <td>公司名称</td>
	       <td>主营产品</td>
	       <td>地址</td>
	       <td>注册资本</td>
	       <td>成立时间</td>
	       <td>年检日期</td>
	       <td>备注</td>
	       <td>年检状态</td>
	      
	    
	    </tr>
	    
	    <c:forEach items="${list }" var="sl"  varStatus="count">
	       <tr>
	          <td>${count.count }</td>
	          <td>${sl.guanjianzi }</td>
	          <td>${sl.miaoshu }</td>
	          <td>${sl.oname }</td>
	          <td>${sl.chanpin }</td>
	          <td>${sl.address }</td>
	          <td>${sl.money }</td>
	          <td>${sl.otime }</td>
	          <td>${sl.nriqi }</td>
	          <td>${sl.beizhu }</td>
	          <td>${sl.nianjians.nname }  </td>
	       </tr>

	    </c:forEach>


	</table>
</body>
</html>
