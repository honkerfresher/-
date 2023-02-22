<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>区级管理员</title>
		
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
	<body>
	<div class="container-fluid position-relative bg-white d-flex p-0">
	
	<div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
	<div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
	
	</div>
	</div>
	
	
	<div class="sidebar pe-4 pb-3">
	<nav class="navbar bg-light navbar-light">
	<a href="main.html" class="navbar-brand mx-4 mb-3">
	<h3 class="text-primary">区级管理员${RT.name}</h3>
	</a>
	<div class="d-flex align-items-center ms-4 mb-4">
	</div>
	<div class="navbar-nav w-100">
	<a href="javascript:void(0);" onclick="refresh()" class="nav-item nav-link"><i class="fa fa-tachometer-alt me-2"></i>首页</a>
	
	<a  href="javascript:void(0);" onclick="qjbxcl(${RT.account})" class="nav-item nav-link">报修申请审批</a>
	<a  href="javascript:void(0);" onclick="qjwzcl(${RT.account})" class="nav-item nav-link">物资申请审批</a>
	<a  href="javascript:void(0);" onclick="qjjycl(${RT.account})" class="nav-item nav-link">就医申请审批</a>
	<a  href="qjtz.html"  class="nav-item nav-link">通知</a>
	
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
	<a href="profile.html" class="dropdown-item">个人简介</a>
	<a href="signin.html" class="dropdown-item">退出</a>
	</div>
	</div>
	</div>
	</nav>
	
	<div class="container-fluid pt-4 px-4">
	<div class="row g-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">学生查询</h6>
	<div align="center">
	<form  action="">
	 输入信息：<input type="text" name="xscxvalue" id="xscxvalue"/>
	</form><br>
	<button onclick="xsqycx(${RT.account})" style=' border:none;color:#0000EE;'>全员查看</button>&nbsp&nbsp<button onclick="xslycx(${RT.account})" style=' border:none;color:#0000EE;'>楼宇查询</button>&nbsp&nbsp<button style=' border:none;color:#0000EE;' onclick="xsxhcx()">学号查询</button>&nbsp&nbsp<button onclick="xsxmcx()" style=' border:none;color:#0000EE;'>姓名查询</button>&nbsp&nbsp<button style=' border:none;color:#0000EE;' onclick="xszycx()">专业查询</button>&nbsp&nbsp<button style=' border:none;color:#0000EE;' onclick="xsqscx()">寝室查询</button>
	<br><br>
	</div>
	<div class="table-responsive">
	<table class="table" id="xscxjgtable">
	<thead>
	<tr>
	<th scope="col">学号</th>
	<th scope="col">姓名</th>
	<th scope="col">宿舍</th>
	<th scope="col">专业</th>
	<th scope="col">班级</th>
	</tr>
	</thead>
	<tbody>
	
	<tr>
	</tbody>
	</table>
	</div>
	</div>
	</div>
	
	
	</div>
	</div>
	
	<div class="container-fluid pt-4 px-4">
	<div class="row g-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">房间查看</h6>
	<div align="center">
	<form  action="">
	 输入信息：<input type="text" name="fjcxvalue" id="fjcxvalue"/>
	</form><br>
	<button onclick="fjlycx(${RT.account})" style=' border:none;color:#0000EE;'>按楼宇查询</button>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button style=' border:none;color:#0000EE;' onclick="fjqcx(${RT.account})">全部房间</button>
	<br><br>
	</div>
	<div class="table-responsive">
	<table class="table" id="fjcxjgtable">
	<thead>
	<tr>
	<th scope="col">房间名</th>
	<th scope="col">楼层</th>
	<th scope="col">空闲床数</th>
	<th scope="col">操作</th>
	</tr>
	</thead>
	<tbody>
	
	<tr>
	</tbody>
	</table>
	</div>
	</div>
	</div>
	</div>
	</div>
	
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">通知</h6>
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
	<th scope="col">日期</th>
	<th scope="col">内容</th>
	<th scope="col">状态</th>
	<th scope="col">操作</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${tzlist}" var="li" >
	<tr>
	<th scope="row">${li.date}</th>
	<td>${li.content}</td>
	<td><c:choose >
	<c:when test="${li.statu==0}">
	待收到
	</c:when>
	<c:when test="${li.statu==2}">
	过期
	</c:when>
	</c:choose>
	</td>
	<td><c:choose >
	<c:when test="${li.statu==0}">
	<button onclick="copy(${li.sid})">收到</button>
	</c:when>
	<c:when test="${li.statu!=0}">
	
	</c:when>
	</c:choose>
	
	</td>
	</tr>
	</c:forEach>
	<tr>
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
	<script type="text/javascript">
	 function xsxhcx(){
		 var inputid=document.getElementById("xscxvalue");
		 var value = inputid.value;
		 var tablename = document.getElementById('xscxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
		 $.ajax({
	          url: "/DM/xsxhcx.html",
	          data: {"xsxh":value},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.xslist!=""){
		                   var s=obj.xslist;
		                   var xs=s.split("@");
		                   for(var j=0;j<xs.length;j++){
			                                             var xsinfo=xs[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = xsinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = xsinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = xsinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML = xsinfo[3];
		                                                 col = row.insertCell(4);
		                                                 col.innerHTML = xsinfo[4]+"级"+xsinfo[5]+"班";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		 
	 }

     function xsxmcx(){
    	 var inputid=document.getElementById('xscxvalue');
		 var value = inputid.value;
		 var tablename = document.getElementById('xscxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
	      var n = tablename.rows.length - 2; //table原有的行数
		 $.ajax({
	          url: "/DM/xsxmcx.html",
	          data: {"xsxm":value},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.xslist!=""){
		                   var s=obj.xslist;
		                   var xs=s.split("@");
		                   for(var j=0;j<xs.length;j++){
			                                             var xsinfo=xs[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = xsinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = xsinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = xsinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML = xsinfo[3];
		                                                 col = row.insertCell(4);
		                                                 col.innerHTML = xsinfo[4]+"级"+xsinfo[5]+"班";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		 
		 
	 }

     function xsqscx(){
    	 var inputid=document.getElementById("xscxvalue");
		 var value = inputid.value;
		 var tablename = document.getElementById('xscxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
		 $.ajax({
	          url: "/DM/xsqscx.html",
	          data: {"xsqs":value},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.xslist!=""){
		                   var s=obj.xslist;
		                   var xs=s.split("@");
		                   for(var j=0;j<xs.length;j++){
			                                             var xsinfo=xs[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = xsinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = xsinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = xsinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML = xsinfo[3];
		                                                 col = row.insertCell(4);
		                                                 col.innerHTML = xsinfo[4]+"级"+xsinfo[5]+"班";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	        	  
	        	  
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
	 
	 
     }

     function xszycx(){
    	 var inputid=document.getElementById("xscxvalue");
		 var value = inputid.value;
		 var tablename = document.getElementById('xscxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
		 $.ajax({
	          url: "/DM/xszycx.html",
	          data: {"xszy":value},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.xslist!=""){
		                   var s=obj.xslist;
		                   var xs=s.split("@");
		                   for(var j=0;j<xs.length;j++){
			                                             var xsinfo=xs[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = xsinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = xsinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = xsinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML = xsinfo[3];
		                                                 col = row.insertCell(4);
		                                                 col.innerHTML = xsinfo[4]+"级"+xsinfo[5]+"班";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		 
		 
	 }
     function xslycx(account){
    	 var inputid=document.getElementById("xscxvalue");
		 var value = inputid.value;
		 var tablename = document.getElementById('xscxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
		 $.ajax({
	          url: "/DM/xslycx.html",
	          data: {"dormnum":value,"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.xslist!=""){
		                   var s=obj.xslist;
		                   var xs=s.split("@");
		                   for(var j=0;j<xs.length;j++){
			                                             var xsinfo=xs[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = xsinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = xsinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = xsinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML = xsinfo[3];
		                                                 col = row.insertCell(4);
		                                                 col.innerHTML = xsinfo[4]+"级"+xsinfo[5]+"班";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		 
		 
	 }
     function xsqycx(account){
		 var tablename = document.getElementById('xscxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
		 $.ajax({
	          url: "/DM/qjxsqycx.html",
	          data:{"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.xslist!=""){
		                   var s=obj.xslist;
		                   var xs=s.split("@");
		                   for(var j=0;j<xs.length;j++){
			                                             var xsinfo=xs[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = xsinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = xsinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = xsinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML = xsinfo[3];
		                                                 col = row.insertCell(4);
		                                                 col.innerHTML = xsinfo[4]+"级"+xsinfo[5]+"班";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		 
		 
	 }
     function fjqcx(account){
    	 var inputid=document.getElementById("fjcxvalue");
		 var value = inputid.value;
		 var tablename = document.getElementById('fjcxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
		 $.ajax({
	          url: "/DM/qjfjqcx.html",
	          data:{"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.fjlist!=""){
		                   var s=obj.fjlist;
		                   var fj=s.split("@");
		                   for(var j=0;j<fj.length;j++){
			                                             var fjinfo=fj[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = fjinfo[0];//放入新的信息的第一个字段
		                                                 col.id="name"+j;
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = fjinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = fjinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML ="<button  onclick='"+"checkroommate("+j+")"+"'>查看</button>";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		 
		 
	 }
     function fjlycx(account){
    	 var inputid=document.getElementById("fjcxvalue");
		 var value = inputid.value;
		 var tablename = document.getElementById('fjcxjgtable');
	      var row = tablename.insertRow(tablename.rows.length);
		 $.ajax({
	          url: "/DM/fjlycx.html",
	          data:{"account":account,"dormnum":value},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	                  if(obj.fjlist!=""){
		                   var s=obj.fjlist;
		                   var fj=s.split("@");
		                   for(var j=0;j<fj.length;j++){
			                                             var fjinfo=fj[j].split("#");
			                                             col = row.insertCell(0);//在这一行添加一个单元格
			                                             col.id="name"+j;
			                                            
		                                                 col.innerHTML = fjinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = fjinfo[1];
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = fjinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML ="<button  onclick='"+"checkroommate("+j+")"+"'>查看</button>";
		                                                 
			                                             row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	          },
	          error: function(data){
	                    alert("请求失败");
	           }})
		 
		 
		 
	 }
	function refresh(){
		
		history.go(0);
		  
		
		 
	}
	function checkroommate(j){
	var name = document.getElementById("name"+j).innerHTML;
	
		 $.ajax({
	          url: "/DM/qjcr.html",
	          data: {"rmname":name},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  window.location.href="qjtzcheckroommate.html";
	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	function copy(sid){
		
			 $.ajax({
		          url: "/DM/qj_copy.html",
		          data: {"sid":sid},
		          type: "GET",
		          datatype:"text",
		          success: function(data) {
		        	  history.go(0);
		        	  },
			          error: function(data){
		                    alert("请求失败");
		           }})
		          }
	
	function qjwzcl(account){
		
		 $.ajax({
	          url: "/DM/wzqjcl.html",
	          data: {"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  window.location.href="qjwzcltz.html";

	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	function qjbxcl(account){
		
		 $.ajax({
	          url: "/DM/qjbxcl.html",
	          data: {"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  window.location.href="qjbxtz.html";

	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	function qjjycl(account){
		
		 $.ajax({
	          url: "/DM/qjjycl.html",
	          data: {"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  window.location.href="qjjytz.html";

	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	</script>
	</body>
</html>