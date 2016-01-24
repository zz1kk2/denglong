<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<jsp:include page="../common/head.jsp" flush="true"/> 

<style>

</style>


<title>无标题文档</title>
</head>

<body class="easyui-layout">   
    
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>      
    <div data-options="region:'west',title:'菜单栏',split:true" style="width:190px;">
     <jsp:include page="menu.jsp" flush="true"/> 
     
   
    </div>   
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">

    
    </div>   
</body>  




</html>
