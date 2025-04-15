<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멋사 영화</title>
<link rel="stylesheet" href="./css/index.css"/>
</head>
<body>
	<header>
		<div class="">
			<img class="logo" src="./image/logo.png"/>
			<div>
				<span class="menu-item">영화리스트</span>
	            <span class="menu-item">국내영화</span>
	            <span class="menu-item">외국영화</span>
	            <span class="menu-item">전국영화</span>
	            <span class="menu-item">최근기사</span>
	            <span class="menu-item">블로그</span>
			</div>	
 		</div>
	</header>
  	<div class="top-img-container">
  		<img src="./image/bg.jpg">
        <div class="overlay-box">
        	<span>
            	<font class="highlight">멋쟁이 사자처럼</font>
                <br/>
                <font>일별 박스오피스 조회</font>
            </span>
        </div>
	</div>
    <section>
    	<div class="inner">
        	<div style="display: flex;justify-content: space-between;margin-bottom: 30px;">
            	<span class="mini-tittle">일별박스 오피스 조회</span>
                <div>
                	<input type="date"/>
                    <button>
                    	<i class="fa-solid fa-magnifying-glass"></i>
                        <span>조회하기</span>
                    </button>
				</div>
			</div>
			<table class="table">
            	<thead>
					<tr>
                    	<th scope="col">순위</th>
                        <th scope="col">영화명명</th>
                        <th scope="col">누적관객수수</th>
                        <th scope="col">개봉일</th>
                    </tr>
                </thead>
                <tbody>
                     <tr>
                         <th scope="row">1</th>
                         <td>멋사영화</td>
                         <td>10000000 명</td>
                         <td>2021-04-02</td>
                     </tr>
                     <tr>
                         <th scope="row">1</th>
                         <td>멋사영화</td>
                         <td>10000000 명</td>
                         <td>2021-04-02</td>
                     </tr>
                     <tr>
                         <th scope="row">1</th>
                         <td>멋사영화</td>
                         <td>10000000 명</td>
                         <td>2021-04-02</td>
                     </tr>
                     <tr>
                         <th scope="row">1</th>
                         <td>멋사영화</td>
                         <td>10000000 명</td>
                         <td>2021-04-02</td>
                     </tr>           
				</tbody>
			</table>
 		</div>
	</section>
</body>
</html>