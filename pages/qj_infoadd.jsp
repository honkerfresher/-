<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<a href="stu_log.html" class="navbar-brand mx-4 mb-3">
	<h3 class="text-primary">区级通知</h3>
	</a>
	<div class="d-flex align-items-center ms-4 mb-4">
	</div>
	
	<div class="navbar-nav w-100">
	<a href="javascript:void(0);" onclick="back()" class="nav-item nav-link"><i class="fa fa-tachometer-alt me-2"></i>返回</a>
		
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
	<a href="stu_profile.html" class="dropdown-item">个人简介</a>
	<a href="signin.html" class="dropdown-item">退出</a>
	</div>
	</div>
	</div>
	</nav>
	
	    <div align="center" style="margin-top:150px;">
		<div class="col-sm-12 col-xl-6">
		<div class="bg-light rounded h-100 p-4">
		<h6 class="mb-4">通知内容填写</h6>
		
		<form action="" method="post" id="form_lssubmit">
		
		<div class="mb-3">
	    <label >楼号</label>
		<input type="text" class="form-control" id="dormnum"   placeholder="如：c7、a1"/>
		</div>
		<div class="mb-3">
		<label for="exampleInputEmail1" class="form-label">通知内容</label>
		<input type="text" class="form-control" id="tzcontent" />
		</div>
		
	
		<div class="input-group">
		<button style='border:none;color:#0000EE;' onclick="addqjinfo(${RT.account})">确认提交</button>
		</div>
		</form>
		
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
      function back(){
		
		history.back();
		  
		
		 
	}
      
      function addqjinfo(account){
  		var dormnum = document.getElementById("dormnum").value;
  		var content = document.getElementById("tzcontent").value;
  	
  		
 		 $.ajax({
 	          url: "/DM/addqjinfo.html",
 	          data:{"dormnum":dormnum,"content":content,"account":account},
 	          type: "GET",
 	          datatype:"text",
 	          success: function(data) {
 	        	 var obj = jQuery.parseJSON(data);
 	        	 
 	        	alert(obj.error);
 	        	 if(obj.error!=null&&data!=""){
 		        	 
 		        	  alert(obj.error);
 		        	 history.go(0);
 		        	  }else{
 		        		 alert("通知下发成功");
 		 	        	history.back();
 		        	  }
 	        	
 	        	  },
 		          error: function(data){
 	                    alert("请求失败");
 	           }})
 	          }
	</script>
	</body>
	</html>