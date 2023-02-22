<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>校级管理${RT.name}</title>
		
	<meta content="width=device-width, initial-scale=1.0" name="viewport">
	<meta content="" name="keywords">
	<meta content="" name="description">
	
	
	
	<link rel="preconnect" href="https://fonts.googleapis.com/">
	<link rel="preconnect" href="https://fonts.gstatic.com/" crossorigin="">
	<link href="static/css/css2.css" rel="stylesheet">
	
	<link href="static/css/all.min.css" rel="stylesheet">
	<link href="static/css/bootstrap-icons.css" rel="stylesheet">
	
	<link href="static/css/owl.carousel.min.css" rel="stylesheet">
	<link href="static/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet">
	
	<link href="static/css/bootstrap.min.css" rel="stylesheet">
	
	<link href="static/css/style.css" rel="stylesheet">
	</head>
	<body onload="fjdata()">
	<div class="container-fluid position-relative bg-white d-flex p-0">
	
	<div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
	<div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
	
	</div>
	</div>
	
	
	<div class="sidebar pe-4 pb-3">
	<nav class="navbar bg-light navbar-light">
	<a href="xj_main.html" class="navbar-brand mx-4 mb-3">
	<h3 class="text-primary">校级管理员，你好！</h3>
	</a>
	<div class="d-flex align-items-center ms-4 mb-4">
	</div>
	<div class="navbar-nav w-100">
	<a  href="javascript:void(0);" onclick="back()" class="nav-item nav-link"><i class="fa fa-tachometer-alt me-2"></i>返回</a>
	
	
	
	</div>
	</nav>
	</div>
	
	
	<div class="content">
	
	<nav class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0">
	<a href="index1.html" class="navbar-brand d-flex d-lg-none me-4">
	<h2 class="text-primary mb-0"><i class="fa fa-hashtag"></i></h2>
	</a>
	<a href="#" class="sidebar-toggler flex-shrink-0">
	<i class="fa fa-bars"></i>
	</a>
	<div class="navbar-nav align-items-center ms-auto">
	<div class="nav-item dropdown">
	<div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">	
	</div>
	</div>
	<div class="nav-item dropdown">
	<a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
	<img class="rounded-circle me-lg-2" src="static/picture/user.jpg" alt="" style="width: 40px; height: 40px;">
	<span class="d-none d-lg-inline-flex">${RT.name}</span>
	</a>
	<div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
	<a href="signin.jsp" class="dropdown-item">退出</a>
	</div>
	</div>
	</div>
	</nav>
	
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">A区</h6>
	<div class="table-responsive">
	<table class="table" id="Aroom">
	<thead>
	<tr>
	<th scope="col">房间名</th>
	<th scope="col">空床</th>
	<th scope="col">总床数</th>
	
	<th scope="col" colspan="3">操作</th>
	</tr>
	</thead>
	<tbody>
	
	<tr>
	
	
	</tr>
	
	</tbody>
	</table>
	</div>
	</div>
	</div>
	
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">B区</h6>
	<div class="table-responsive">
	<table class="table" id="Broom">
	<thead>
	<tr>
	<th scope="col">房间名</th>
	<th scope="col">空床</th>
	<th scope="col">总床数</th>
	
	<th scope="col" colspan="3">操作</th>
	</tr>
	</thead>
	<tbody>
	
	<tr>
	
	
	</tr>
	
	</tbody>
	</table>
	</div>
	</div>
	</div>
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">C区</h6>
	<div class="table-responsive">
	<table class="table" id="Croom">
	<thead>
	<tr>
	<th scope="col">房间名</th>
	<th scope="col">空床</th>
	<th scope="col">总床数</th>
	
	<th scope="col" colspan="3">操作</th>
	</tr>
	</thead>
	<tbody>
	
	<tr>
	
	
	</tr>
	
	</tbody>
	</table>
	</div>
	</div>
	</div>
	</div>
	
	</div>
	<script src="static/js/jquery-3.4.1.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/bootstrap.bundle.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/chart.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/easing.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/waypoints.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/owl.carousel.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/moment.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/moment-timezone.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/tempusdominus-bootstrap-4.min.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		
		<script src="static/js/main.js" type="3029259e35d7bc1c98cd40a8-text/javascript"></script>
		<script src="static/js/rocket-loader.min.js" data-cf-settings="3029259e35d7bc1c98cd40a8-|49" defer=""></script>
	<script >
	
	
	 function fjdata(){
		 
		 var tableA = document.getElementById('Aroom');
	      var rowA = tableA.insertRow(tableA.rows.length);
	 	 var tableB = document.getElementById('Broom');
	      var rowB = tableB.insertRow(tableB.rows.length);
	 	 var tableC = document.getElementById('Croom');
	      var rowC = tableC.insertRow(tableC.rows.length);
		 $.ajax({
	          url: "/DM/fjdata.html",
	         
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.Afjlist!=""){
		                   var A=obj.Afjlist;
		                   var fj=A.split("@");//按照元组拆
		                   for(var j=0;j<fj.length;j++){
			                                             var fjinfo=fj[j].split("#");//按照字段拆
			                                             col = rowA.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = fjinfo[0];//放入新的信息的第一个字段
		                                                 col = rowA.insertCell(1);
		                                                 col.innerHTML = fjinfo[1];
		                                                 col.id="name"+j;
		                                                 col = rowA.insertCell(2);
		                                                 col.innerHTML = fjinfo[2];
		                                                 col = rowA.insertCell(3);
		                                                 col.innerHTML = "<button id='checkroommate'  style='border:none;' onclick='"+"checkroommate("+fjinfo[3]+")'>查看</button>"
		                                                	
			                                                 rowA = tableA.insertRow(tableA.rows.length);
		                 }
	                  }
		                   if(obj.Bfjlist!=""){
			                   var B=obj.Bfjlist;
			                   var fj=B.split("@");//按照元组拆
			                   for(var j=0;j<fj.length;j++){
				                                             var fjinfo=fj[j].split("#");//按照字段拆
				                                             col = rowB.insertCell(0);//在这一行添加一个单元格
			                                                 col.innerHTML = fjinfo[0];//放入新的信息的第一个字段
			                                                 col = rowB.insertCell(1);
			                                                 col.innerHTML = fjinfo[1];
			                                                 col.id="name"+j;
			                                                 col = rowB.insertCell(2);
			                                                 col.innerHTML = fjinfo[2];
			                                                 col = rowB.insertCell(3);
			                                                 col.innerHTML = "<button id='checkroommate'  style='border:none;' onclick='"+"checkroommate("+fjinfo[3]+")'>查看</button>"
			                                                	
				                                                 rowB = tableB.insertRow(tableB.rows.length);
			                 }
		                   }
			                   if(obj.Cfjlist!=""){
				                   var C=obj.Cfjlist;
				                   var fj=C.split("@");//按照元组拆
				                   for(var j=0;j<fj.length;j++){
					                                             var fjinfo=fj[j].split("#");//按照字段拆
					                                             col = rowC.insertCell(0);//在这一行添加一个单元格
				                                                 col.innerHTML = fjinfo[0];//放入新的信息的第一个字段
				                                                 col = rowC.insertCell(1);
				                                                 col.innerHTML = fjinfo[1];
				                                                 col.id="name"+j;
				                                                 col = rowC.insertCell(2);
				                                                 col.innerHTML = fjinfo[2];
				                                                 col = rowC.insertCell(3);
				                                                 col.innerHTML = "<button id='checkroommate'  style='border:none;' onclick='"+"checkroommate("+fjinfo[3]+")'>查看</button>"
				                                                	
					                                                 rowC = tableC.insertRow(tableC.rows.length);
				                 }      
              }
	                  
	                  
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		
	 }

   
	function back(){
		
		history.back();	 
	}
	

	function checkroommate(sid){
		
		 $.ajax({
	          url: "/DM/xjcheckroom.html",
	          data:{"rmsid":sid},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	 window.location.href="xjtzcheckroommate.html";
	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	

	
	
	</script>
	</body>
</html>