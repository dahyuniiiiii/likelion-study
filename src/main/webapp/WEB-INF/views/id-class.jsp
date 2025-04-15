<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 / 클래스</title>
</head>
<style>
	.my-box{
		width:300px;
		height:60px;
		background:blue;
		margin-bottom:15px;
	}
	.round{
		border-radius:20px;
		background:green;
	}

	#one-box{
		width:50px;
		height:50px;
		background: #0C85FF;
		margin-bottom:20px;
	}
	.parent-box .y{
		background:yellow;
	}
</style>
<body>
	<div class="parent-box y">
		<div>
			<span class="y">span1</span>
			<span class="y">span2</span>
			<span class="y">span3</span>
		</div>
	</div>
	<span>span4</span>

	<div id="one-box"></div>

	<div class="my-box round"></d
iv>
	<div class="my-box"></div>
	<div class="my-box"></div>
	<div class="my-box"></div>
	
	
	
</body>
</html>