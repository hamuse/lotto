<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또프로그램</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<body>
<div>
<h1>회원가입</h1>
<form id="consumer"	action="<%= request.getContextPath() %>/consumer.do">
	ID : <input type="text"  name ="cid"/>
	PW : <input type="password"  name="pw"/>
		<input type="hidden" name="action" value="join"/>
		<input type="hidden" name="dest"  value="login"/>
	<input type="submit"  id="btn" value="전송"	/>
</form>
</div>
<script>
	$('#consumer').submit(function(){
		alert('로또 전송 완료');
		location.assign('<%= request.getContextPath() %>/consumer.do?action =join&dest = login');
	});
	
</script>
</body>
</html>