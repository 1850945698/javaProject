<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>页面</title>
<script type="text/javascript">
	function getAjax(){
		var ajax;
		ajax=new XMLHttpRequest();
		ajax.onreadystatechange=function(){
			if(ajax.readyState==4){
				if(ajax.status==200){
					var result=ajax.responseText;
					eval("var p="+result);
					alert(result);
					var table=document.getElementById("table");
					var tr=table.insertRow(1);
					var cell0=tr.inserCell(0);
					cell1.inserHTML=p.name;
					var cell1=tr.inserCell(1);
					cell1.inserHTML=p.name;
					var cell2=tr.inserCell(2);
					cell1.inserHTML=p.name;
					var cell3=tr.inserCell(3);
					cell1.inserHTML=p.name;
					var show =document.getElementById("show");
					show.innerHTML=result;
				}
			}
			
		}
		ajax.open("get","mess");
		ajax.send(null);
		
	}
</script>
<style type="text/css">
#show {
	border: solid 2px;
	width: 200px;
	height: 100px
}
</style>
</head>
<body>
<input type="text" name="name" id="name" />
	<input type="button" name="button" value="搜索" onclick="getAjax()" />
	<div id="show"></div>
	<table border="2px">
<tr>
<td>商品名称</td>
<td>商品描述</td>
<td>商品价格</td>
<td>折后价</td>
</tr>
</table>
</body>
</html>