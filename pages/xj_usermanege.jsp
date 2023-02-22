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
	<body onload="studata()">
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
	<h6 class="mb-4">宿舍人员</h6><button style="border:none;color:blue;"><a href="stuadd.html">学生添加</a></button>
	<div class="table-responsive">
	<table class="table" id="stu">
	<thead>
	<tr>
	<th scope="col">学号</th>
	<th scope="col">姓名</th>
	<th scope="col">寝室号</th>
	<th scope="col">专业</th>
	<th scope="col">年级班级</th>
	<th scope="col">电话</th>
	
	<th scope="col">辅导员工号</th>
	<th scope="col">家住址</th>
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
	
	<div class="container-fluid pt-4 px-4">
	<div class="col-12">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">用户信息</h6><button style="border:none;color:blue;" ><a href="useradd.html">用户添加</a></button>
	<div class="table-responsive">
	<table class="table" id="user">
	<thead>
	<tr>
	<th scope="col">账号</th>
	<th scope="col">姓名</th>
	<th scope="col">身份</th>
	<th scope="col">第二身份</th>
	<th scope="col">电话</th>

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
	
	
	 function studata(){
		 
		 var tablename = document.getElementById('stu');
	      var row = tablename.insertRow(tablename.rows.length);
	      var tablenameuser = document.getElementById('user');
	      var rowuser = tablenameuser.insertRow(tablenameuser.rows.length);
		 $.ajax({
	          url: "/DM/studata.html",
	         
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
	        	  var col;
	        	  
	                  if(obj.xslist!=""){
		                   var s=obj.xslist;
		                   var xs=s.split("@");//按照元组拆
		                   for(var j=0;j<xs.length;j++){
			                                             var xsinfo=xs[j].split("#");//按照字段拆
			                                             col = row.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = xsinfo[0];//放入新的信息的第一个字段
		                                                 col = row.insertCell(1);
		                                                 col.innerHTML = xsinfo[1];
		                                                 col.id="name"+j;
		                                                 col = row.insertCell(2);
		                                                 col.innerHTML = xsinfo[2];
		                                                 col = row.insertCell(3);
		                                                 col.innerHTML = xsinfo[3];
		                                                 col = row.insertCell(4);
		                                                 col.innerHTML = xsinfo[4]+"级"+xsinfo[5]+"班";
		                                                 col = row.insertCell(5);
		                                                 col.innerHTML = xsinfo[6];
		                                                 col = row.insertCell(6);
		                                                 col.innerHTML = xsinfo[7];
		                                                 col = row.insertCell(7);
		                                                 col.innerHTML = xsinfo[8];
		                                                 col = row.insertCell(8);
		                                                 col.innerHTML = "<button id='delete'  style='border:none;color:red;' onclick='"+"deletlog("+xsinfo[0]+")'>删除 </button>"
		                                                	col = row.insertCell(9);
			                                                 col.innerHTML = "<button id='update' onclick='updatelog("+xsinfo[0]+")' style='border:none;color:green;'>修改</button>"
			                                                if(xsinfo[9]!='10010'){
			                                                 col = row.insertCell(10);
			                                                 col.innerHTML = "<button id='assign' onclick='assign("+xsinfo[0]+","+j+")' style='border:none;color:orange;'>职位任命</button>"
			                                                }
			                                                 row = tablename.insertRow(tablename.rows.length);
		                 }
              }
	                  col="";
	                  if(obj.userlist!=""){
		                   var s=obj.userlist;
		                   var user=s.split("@");//按照元组拆
		                   for(var j=0;j<user.length;j++){
			                                             var userinfo=user[j].split("#");//按照字段拆
			                                             col = rowuser.insertCell(0);//在这一行添加一个单元格
		                                                 col.innerHTML = userinfo[0];//放入新的信息的第一个字段
		                                                 col = rowuser.insertCell(1);
		                                                 col.innerHTML = userinfo[1];
		                                                 col.id="name"+j;
		                                                 col = rowuser.insertCell(2);
		                                                 if(userinfo[2]=='10001')
		                                                 col.innerHTML = "学生";
		                                                 if(userinfo[2]=='10002')
			                                                 col.innerHTML = "老师";
		                                                 if(userinfo[2]=='10003')
			                                                 col.innerHTML ="宿管人员";
		                                                 if(userinfo[2]=='10004')
			                                                 col.innerHTML = "维修人员";
		                                                 if(userinfo[2]=='10005')
			                                                 col.innerHTML = "辅导员";
		                                                 if(userinfo[2]=='10006')
			                                                 col.innerHTML = "系统管理员";
		                                                 if(userinfo[2]=='10007')
			                                                 col.innerHTML = "校级管理员";
		                                                 if(userinfo[2]=='10008')
			                                                 col.innerHTML = "区级管理员";
		                                                 if(userinfo[2]=='10009')
			                                                 col.innerHTML = "楼宇管理员";
		                                                 if(userinfo[2]=='10010')
			                                                 col.innerHTML = "楼层管理员";
		                                                 col = rowuser.insertCell(3);
		                                                 if(userinfo[3]=='10008')
		                                                 col.innerHTML = "区级管理员";
		                                                 if(userinfo[3]=='10009')
			                                                 col.innerHTML = "楼宇管理员";
		                                                 if(userinfo[3]=='10010')
			                                                 col.innerHTML = "楼层管理员";
		                                                 col = rowuser.insertCell(4);
		                                                 col.innerHTML = userinfo[4];
		                                               
		                                                 col = rowuser.insertCell(5);
		                                                 col.innerHTML = "<button id='deleteuser'  style='border:none;color:red;' onclick='"+"deletuser("+userinfo[0]+")'>删除 </button>"
		                                                	col = rowuser.insertCell(6);
			                                                 col.innerHTML = "<button id='updateuser' onclick='updateuser("+userinfo[0]+")' style='border:none;color:green;'>修改</button>"
			                                               
			                                                 rowuser = tablenameuser.insertRow(tablenameuser.rows.length);
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
	
	function deletlog(snum){
		
		 $.ajax({
	          url: "/DM/deletlog.html",
	          data:{"snum":snum},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	 history.go(0);
	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	function updatelog(snum){
		
		 $.ajax({
	          url: "/DM/updatelog.html",
	          data:{"snum":snum},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	window.location.href="updatelogtz.html";
	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	function deletuser(account){
		
		 $.ajax({
	          url: "/DM/deletuser.html",
	          data:{"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	 history.go(0);
	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	function updateuser(account){
		
		 $.ajax({
	          url: "/DM/updateuser.html",
	          data:{"account":account},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	window.location.href="updateusertz.html";
	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	function assign(snum,j){
		var name = document.getElementById("name"+j).innerHTML;
		 $.ajax({
	          url: "/DM/stuassign.html",
	          data:{"snum":snum,"name":name},
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  
	        	window.location.href="assigninterprettz.html";
	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	</script>
	</body>
</html>