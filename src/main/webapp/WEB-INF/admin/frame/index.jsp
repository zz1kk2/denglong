<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
   //ajax need address
    String path_base = "http://localhost" +":8080/"+ request.getContextPath();
%>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<jsp:include page="../common/head.jsp" flush="true"/> 

 <script>
       $(function(){
			 $('#left_Menu').accordion({    
				animate:false,
				fit:true,
				border:false,
				animate:true
			});  
	   })
   
        $('#tt').tabs({    
			border:false,
			fit:true,
			onSelect:function(title){    
				alert(title+' is selected');    
			}    
		});       

      //文章类型
      Article=function(){
             tabA = $('#tt').tabs('getTab','文章类型'); 
             var address ='<%=path_base%>';
             
			 if(tabA==null){
			 $('#tt').tabs('add',{    
				title:'文章类型',    
				content:'Tab Body',    
				closable:true,
				href: address+'/admin/articleType.html',
				tools:[{    
					iconCls:'icon-mini-refresh',    
					handler:function(){    
						alert('refresh');    
						}    
					}]    
				});
			 }
	  }

	 


	 </script>

	<style>
       #left_Menu ul{
	     margin-top:2px;
	     display:block;
		 background:white;
		 line-height:40px;
		 font-family:"微软雅黑";
	   }

       #left_Menu ul li{	     
	     font-size:16px;
		 list-style-type:none;
	   }

	    #left_Menu a{
	    font-size:14px;
		color:#000;
		text-decoration:none;
	   }

	    #left_Menu a:hover{
		color:#0099FF;	
		font-weight:bold;
	   }

        .fool{
		margin-left:auto;		
		margin-right:auto;
		display:block;
		width:150px;
		}

		.articTypeFrame{		
		 margin-left:auto;		
		 margin-right:auto;
		 background-color:white;
		 width:100%;
		 height:589px;
		}
        
		.datagrid-htable{
		
		}



	</style>


<title>无标题文档</title>
</head>

<body class="easyui-layout">

	<div data-options="region:'north',border:false" style="height:60px;background:#1DACF0;padding:10px">
	        
	</div>
	<div data-options="region:'west',split:true,title:'菜单栏'" style="width:170px;padding:0;">
	   <div id="left_Menu" class="easyui-accordion" style="width:100%;height:200px;">  
	   
			<div title="文章" data-options="iconCls:'icon-save',selected:true" style="overflow:auto;padding:10px;">   
				<ul>
					 <li><a href="javascript:Article()">文章类型</a></li>
					 <li><a href="#">我的文章</a></li>
				</ul>
			</div>   


			<div title="用戶名" data-options="iconCls:'icon-reload'" style="padding:0px;">   
				<ul>
					 <li><a href="javascript:Article()">我的资料中心</a></li>
					 <li><a href="#">我的资料中心</a></li>
					 <li><a href="#">我的资料中心</a></li>
					 <li><a href="#">我的资料中心</a></li>
				</ul>
			</div>   
			<div title="Title3">   
				content3    
			</div>   
		</div> 
	</div>
		<div data-options="region:'south',border:false" style="height:50px;padding:10px;">
			  <span class="fool">
			     欢迎使用easyui-P</br>
				 官方QQ群:538604170
			  </span>
		</div>
	<div data-options="region:'center',title:''">
	     <div id="tt" class="easyui-tabs" style=""></div>    		 	
	</div>
</body>




</html>
