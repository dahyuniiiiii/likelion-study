<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HTML TAG</title>
</head>
<body>
	abc
	<div style="width:200px;height:60px;background:blue;margin-top:0px;margin-left:50px;padding-left:10px">
		<div style="width:50px;height:50px;background:red;"></div>
	</div>
	<div style="width:300px;height:120px;border:1px solid black;margin-top:20px;">
		<div style="background:blue;color:white">div1</div>
		<div style="background:blue;color:white">div2</div>
		
		<span style="background:red;color:white;display:block;">span1</span>
		<span style="background:red;color:white;display:block;">span2</span>
	</div>
	<img style="width:260px;height:260px;object-fit:cover;border-radius:30px;"src="https://fastly.picsum.photos/id/9/250/300.jpg?hmac=Wi5kRxzDwb8n2b8CO8qd2W4EoVcaKNesNCO8zTngKY4"/>
	<input type="text" placeholder="type:id..."/>
	<input type="password"/>
	<input type="number"/>
	<input type="date"/>
	<input type="file"/>
	
	<br/>
	<input type="radio" name="size" value="s"/>
	<span>small</span>
	<input type="radio" name="size" value="m"/>
	<span>medium</span>
	<input type="radio" name="size" value="l"/>
	<span>large</span>
	<select>
		<option value="s">small</option>
		<option value="m">medium</option>
		<option value="l">large</option>
	</select>
	<textarea style="width:300px;height:150px;resize:none;padding:4px;font-size:20px;color:blue;font-weight:700;"></textarea>
</body>
</html>