<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
    String pathBase = request.getContextPath();
%>
<style type="text/css">
ul {
	list-style: none;
	line-height:40px;
	font-size:18px;
	font-color:#999;
}

a{
text-decoration:none;
color:black;
}
</style>
<div id="aa" class="easyui-accordion"
	style="width: 180px; height: 300px;">
	<div title="文章" data-options="iconCls:'icon-save',selected:true"
		style="overflow: auto; padding: 10px;">
		<ul>
			<li><a href="#">文章类型</a></li>
			<li><a href="<%=pathBase%>/admin/article.html" target="view_frame">发布文章</a></li>
		</ul>



	</div>
	<div title="Title2" data-options="iconCls:'icon-reload'"
		style="padding: 10px;">content2</div>
	<div title="Title3">content3</div>
</div>




