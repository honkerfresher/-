<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<jsp:include page="WEB-INF/jspinclude/domain.jsp" flush="true" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录</title>
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
<span class="sr-only">Loading...</span>
</div>
</div>


<div class="container-fluid">
<div class="row h-100 align-items-center justify-content-center" style="min-height: 100vh;">
<div class="col-12 col-sm-8 col-md-6 col-lg-5 col-xl-4">
<div class="bg-light rounded p-4 p-sm-5 my-4 mx-3">
<div class="d-flex align-items-center justify-content-between mb-3">
<a href="index1.html" class="">
<h3 class="text-primary"><i class="fa fa-hashtag me-2"></i>登录</h3>
</a>
<h3>Sign In</h3>
</div>
<div class="login-center clearfix">
				
				<div class="login-center-input">
				
					<input type="text" id="account" value="" placeholder="请输入您的用户名" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
					<div class="login-center-input-text">用户名</div>
				</div>
			</div>
			<div class="login-center clearfix">
				
				<div class="login-center-input">
					<input type="password" id="password"value="" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
					<div class="login-center-input-text">密码</div>
				</div>	
			</div>
<div class="d-flex align-items-center justify-content-between mb-4">

<div class="form-floating mb-4" >
                <div class="msg"></div>
            </div>
</div>
<span onclick="go()" class="btn btn-primary py-3 w-100 mb-4" id="btn">Sign In</span>
<!-- <p class="text-center mb-0">Don't have an Account? <a href="signup.html">Sign Up</a></p>  -->
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
<script src="static/js/rocket-loader.min.js" data-cf-settings="3029259e35d7bc1c98cd40a8-|49" defer=""></script></body>

<script type="text/javascript">
	
		function go(){
			var account= document.getElementById('account').value;
			var password= document.getElementById('password').value;
				
						 $.ajax({
				        	    url: "/DM/go.html?account="+account+"&password="+password,//框架规定，后缀加.html
				        	    type: "POST",
				        	    dateType:"text",//与data有关，路径用Jason类型
				        	    success: function(data) {
				        	    	
				        	    	
				        	    	window.location.href="login.html";
				        	    	
				        	 },
				        	    error: function(data){
				        	    	alert("请求失败");
				        	    	 
				        	    }})	
				}
					 		 
</script>

</html>