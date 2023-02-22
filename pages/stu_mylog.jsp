<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>我的申请</title>
	
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
	<h3 class="text-primary">学生退宿申请</h3>
	</a>
	<div class="d-flex align-items-center ms-4 mb-4">
	</div>
	
	<div class="navbar-nav w-100">
	<a href="stu_main.jsp" class="nav-item nav-link"><i class="fa fa-tachometer-alt me-2"></i>首页</a>
	<div class="nav-item dropdown">
	<a href="*" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>业务申请</a>
	<div class="dropdown-menu bg-transparent border-0">
	<a href="stu_exsubmit.jsp" class="dropdown-item">调寝申请</a>
	<a href="stu_fixsubmit.jsp" class="dropdown-item">报修申请</a>
	<a href="stu_lssubmit.jsp" class="dropdown-item">留宿申请</a>
	<a href="stu_tssubmit.jsp" class="dropdown-item">退宿申请</a>
	<a href="stu_jysubmit.jsp" class="dropdown-item">就医申请</a>
	<a href="stu_wzsubmit.jsp" class="dropdown-item">物资申请</a>
	</div>
	</div>	
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
	<a href="profile.jsp" class="dropdown-item">个人简介</a>
	<a href="signin.jsp" class="dropdown-item">退出</a>
	</div>
	</div>
	</div>
	</nav>
	
		
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">报修申请</h6>
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
	<th scope="col">日期</th>
	<th scope="col">报修描述</th>
	<th scope="col">状态</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${bxlist}" var="li" >
	<tr>
	<th scope="row">${li.date}</th>
	<td>${li.content}</td>
	<td><c:choose >
	<c:when test="${li.statu==0}">
	待审批
	</c:when>
	<c:when test="${li.statu==1}">
	已审批
	</c:when>
	<c:when test="${li.statu==2}">
	驳回
	</c:when>
	</c:choose></td>
	</tr>
	</c:forEach>
	<tr>
	</tbody>
	</table>
	</div>
	</div>
	</div>
	</div>
	
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">退宿申请</h6>
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
	<th scope="col">日期</th>
	<th scope="col">原因</th>
	<th scope="col">状态</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${tslist}" var="li" >
	<tr>
	<th scope="row">${li.date}</th>
	<td>${li.reason}</td>
	<td><c:choose >
	<c:when test="${li.statu==0}">
	待审批
	</c:when>
	<c:when test="${li.statu==1}">
	已审批
	</c:when>
	<c:when test="${li.statu==2}">
	驳回
	</c:when>
	</c:choose></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
	</div>
	</div>
	</div>
	
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">留宿申请</h6>
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
	<th scope="col">原因</th>
	<th scope="col">申请日期</th>
	<th scope="col">截止日期</th>
	<th scope="col">状态</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${lslist}" var="li" >
	<tr>
	<td>${li.reason}</td>
	<th scope="row">${li.date}</th>
	<td>${li.enddate}</td>
	
	<td><c:choose >
	<c:when test="${li.statu==0}">
	待审批
	</c:when>
	<c:when test="${li.statu==1}">
	已审批
	</c:when>
	<c:when test="${li.statu==2}">
	驳回
	</c:when>
	</c:choose></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
	</div>
	</div>
	</div>
	
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">就医申请</h6>
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
	<th scope="col">申请日期</th>
	<th scope="col">就医描述</th>
	<th scope="col">状态</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${jylist}" var="li" >
	<tr>
	<th scope="row">${li.date}</th>
	<td>${li.content}</td>
	<td><c:choose >
	<c:when test="${li.statu==0}">
	待审批
	</c:when>
	<c:when test="${li.statu==1}">
	已审批
	</c:when>
	<c:when test="${li.statu==2}">
	驳回
	</c:when>
	</c:choose></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
	</div>
	</div>
	</div>
	
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">物资申请</h6>
	<div class="table-responsive">
	<table class="table">
	<thead>
	<tr>
	<th scope="col">申请日期</th>
	<th scope="col">申请内容</th>
	<th scope="col">状态</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${wzlist}" var="li" >
	<tr>
	<th scope="row">${li.date}</th>
	<td>${li.content}</td>
	<td><c:choose >
	<c:when test="${li.statu==0}">
	待审批
	</c:when>
	<c:when test="${li.statu==1}">
	已审批
	</c:when>
	<c:when test="${li.statu==2}">
	驳回
	</c:when>
	</c:choose></td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	</div>
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
	
	
	
	</script>
	</body>
	</html>