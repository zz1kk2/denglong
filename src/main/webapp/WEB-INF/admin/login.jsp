<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

body {
	background: #73BDBD;
}

.out_frame{
border:0px solid black;
margin:0 0 0 0;
height:700px;
}

.login_frame{
border:0px solid black;
width:20%;
margin-left:auto;
margin-right:auto;
margin-top:270px;
height:100px;
}

table{
margin-top:10px;
margin-left:auto;
margin-right:auto;
border:1px solid white;
width:80%
}
table p{
float:right;
}

table tr td{

border:0px solid red;
margin-left:10px;
}

</style>
</head>



<body>

<form>
	<div class="out_frame">
		<div class="login_frame">
		  <table>
			<tr>
				<td><p>用户名:</p></td>	
				<td><input type="text" name="userName"></td>		
						
			</tr>
			
			<tr>
				<td><p>密码:</p></td>
				<td><input type="password" name="pwd"></td>									
			</tr>
			<tr>
				<td colspan="2"><input style="margin-left:92px;margin-right:auto;width:100px" type="submit" value="登   录"></td>									
			</tr>
			
          </table>			
		</div>
	</div>
</form>
</body>
</html>