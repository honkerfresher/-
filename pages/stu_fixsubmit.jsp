<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>学生宿舍管理系统</title>
	
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
	<a href="javascript:void(0);" onclick="refresh()"class="navbar-brand mx-4 mb-3">
	<h3 class="text-primary">保修填报</h3>
	</a>
	<div class="d-flex align-items-center ms-4 mb-4">
	</div>
	<div class="navbar-nav w-100">
	<a href="javascript:void(0);" onclick="refresh()" class="nav-item nav-link"><i class="fa fa-tachometer-alt me-2"></i>首页</a>
	
	
	
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
	<a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
	<img class="rounded-circle me-lg-2" src="static/picture/user.jpg" alt="" style="width: 40px; height: 40px;">
	<span class="d-none d-lg-inline-flex">${RT.name}</span>
	</a>
	<div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
	<a href="profile.html" class="dropdown-item">个人介绍</a>
	<a href="signin.jsp" class="dropdown-item">退出</a>
	</div>
	
	</div>
	</div>
	</nav>
	</head>
	<body>
		<div class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
		
		<div class="col-sm-12 col-xl-6">
		<div class="bg-light rounded h-100 p-4">
		<h6 class="mb-4">保修填报</h6>
		
		<form action="bxsubmit.html" method="post" id="form_bxsubmit">
		<div class="mb-3">
		<label for="exampleInputEmail1" class="form-label">学号</label>
		<input type="text" id="snum" name="snum" class="form-control"/>
		</div>
		<div class="mb-3">
		<label for="exampleInputEmail1" class="form-label">申请日期</label>
		<input type="datetime-local" class="form-control" id="date" name="date"/>
		</div>
		<div class="mb-3">
		
		<div class="mb-3">
		<label for="exampleInputEmail1" class="form-label" placeholder="格式如：c7-512">房间名</label>
		<input type="text"  class="form-control" id="rmname" name="rmname"/>
		</div>
		
		 <!-- <div class="mb-3">
		<label >损坏方面</label>
		<input   class="form-control" autocomplete=“off” id="content" name="content"  list="contentl"
								placeholder="选择损坏方面" required />
								<datalist id="contentl">
								    <c:forEach items="${fixwhat}" var="li" >
								     <option  value="${li.dowhat}">${li.dowhat}</option>
								     </c:forEach> 
								     <option  value="门">门</option>
								     <option  value="柜子">柜子</option>
								</datalist>
							
		</div>-->
		<div class="input-group">
		<span class="input-group-text">具体描述</span>
		<textarea class="form-control" aria-label="With textarea" id="content" name="content"></textarea>
		</div>
		<div class="input-group">
		<input type="submit" />
		</div>
		</form>
		
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
function refresh(){
		
		history.back();
		  
		
		 
	}
	</script>
	</body>