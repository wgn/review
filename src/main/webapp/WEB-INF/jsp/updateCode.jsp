<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<link href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css" rel="stylesheet">
<title><c:choose>
		<c:when test="${opType=='add' }">增加</c:when>
		<c:when test="${opType=='edit' }">修改</c:when>
	</c:choose>编码映射</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-xs-8 col-md-offset-2">
				<form action="${pageContext.request.contextPath }/code/${opType }.action" method="post">

					<table class="table table-bordered">
						<tr>
							<td>ID：</td>
							<td></td>
						</tr>
						<tr>
							<td>类型：</td>
							<td><input type="text" name="type" value="${code.type }" /></td>
						</tr>
						<tr>
							<td>编码：</td>
							<td><input type="text" name="type" value="${code.code }" /></td>
						</tr>
						<tr>
							<td>名称：</td>
							<td><input type="text" name="type" value="${code.name }" /></td>
						</tr>
						<tr>
							<td>上级编码：</td>
							<td><input type="text" name="type" value="${code.parentId }" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="保存" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>