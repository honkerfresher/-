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
	<body onload="chartsum()">
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
	<a href="javascript:void(0);" onclick="refresh()" class="nav-item nav-link"><i class="fa fa-tachometer-alt me-2"></i>首页</a>
	
	<a  href="usermanege.html" onclick="" class="nav-item nav-link"  ><i class="fa fa-laptop me-2"></i>用户管理</a>
	
	
	<a  href="fjmanage.html" onclick="" class="nav-item nav-link"><i class="fa fa-laptop me-2"></i>房间管理</a>
	
	<a  href="xjwzcl.html" class="nav-item nav-link"><i class="fa fa-laptop me-2"></i>物资申请管理</a>
	
	<a  href="xjtz.html" class="nav-item nav-link"><i class="fa fa-laptop me-2"></i>通知下发</a>
	</div>
	</div>
	
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
	<div class="row g-4">
	<div class="col-sm-12 col-xl-6">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">大数据展示</h6><button style="border:none;"><a href="wzareadetail.html" class="nav-item nav-link">分区物资详情</a></button>
	
	<div id="wz" style="height: 250px;width:550px;float:left;"></div>

	</div>
	</div>
	
	<div class="col-sm-12 col-xl-6">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">大数据展示</h6><!--  <button style="border:none;"><a href="bxareadetail.html" class="nav-item nav-link">分区报修详情</a></button>-->
	
	<div id="bx" style="height: 290px;width:550px;float:left;"></div>

	</div>
	</div>
	
	<div class="col-sm-12 col-xl-6">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">大数据展示</h6><!--  <button style="border:none;"><a href="bxareadetail.html" class="nav-item nav-link">分区报修详情</a></button>-->
	
	<div id="jy" style="height: 290px;width:550px;float:left;"></div>

	</div>
	</div>
	
	<div class="col-sm-12 col-xl-6">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">大数据展示</h6><!--  <button style="border:none;"><a href="bxareadetail.html" class="nav-item nav-link">分区报修详情</a></button>-->
	
	<div id="ts" style="height: 290px;width:550px;float:left;"></div>

	</div>
	</div>
	
	</div>
	
	
	
	
	</div>
	<script src="static/js/echart/echarts.min.js"></script>
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
	
	function wzareadetail(){
		
		 $.ajax({
	          url: "/DM/wzareadetail.html",
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  window.location.href="wzareatz.html";

	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	function usermanage(){
		
		 $.ajax({
	          url: "/DM/usermanege.html",
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  window.location.href="usermanagetz.html";

	        	  },
		          error: function(data){
	                    alert("请求失败");
	           }})
	          }
	
	function chartsum(){
        //接受数据库数据
   
          $.ajax({
	                 url: "/DM/chartsum.html",
                     type: "GET",
                     datatype:"text",
                     success: function(data) {
                    //alert(data.listac);
                   
                     var obj = jQuery.parseJSON(data);
                    
                     var wz = obj.wzinfo;
                     var bx = obj.bxinfo;
                     var jy = obj.jyinfo;
                     var ts = obj.tsinfo;
		               var myChartwz = echarts.init(document.getElementById('wz'));
                       var optionwz = {
   		   
   		                            title:{
   			                        subtext:'本年度全校物资申请汇总条形图'
   			                        	
	                                          },
	                                          
   		                            tooltip:{},
   		                            legend:{
   			                              data:["个数"],
   		                                   },
   		                                 textStyle: {
   		                                   color: 'black',
   		                                   width:'8',
   		                               },
   		                            xAxis:{
   		                            	type:"category",
   			                             data:["面包","香肠","汽水","泡面"],
   		                             axisLine:{
   		                               lineStyle:{
   		                                   color:'white',
   		                                   width:5,
   		                               }
   		                           }, 

   		                                   },
   		                                   
   		                            yAxis:{
   		                            	type:"value",
   		                            	 axisLine:{
         		                               lineStyle:{
         		                                   color:'white',
         		                                   width:7,//这里是为了突出显示加上的
         		                               },
         		                           } 
   		                            },
   		                            series:[{
   			                                 name:"数量单位:个",
   			                                 type:'bar',
   			                                 data:[wz.wz1,wz.wz2,wz.wz3,wz.wz4],
   			                               itemStyle:{
   			                                 normal:{
   			                                     color:function(params){
   			                                         var colorlist = ['#FBC300','#DA251D','blue','#E67716','#32585a','#00ff77','#ff00ff'];
   			                                         return colorlist[params.dataIndex];
   			                                     }
   			                                 }
   			                             }
   		                         
   		                            }]
                                 }; 
                       var myChartbx = echarts.init(document.getElementById('bx'));
                       var optionbx = {
   		   
   		                            title:{
   			                        subtext:'本年度全校报修申请汇总条形图'
   			                        	
	                                          },
	                                          
   		                            tooltip:{},
   		                            legend:{
   			                              data:["个数"],
   		                                   },
   		                                 textStyle: {
   		                                   color: 'black',
   		                                   width:'8',
   		                               },
   		                            xAxis:{
   		                            	type:"category",
   			                             data:["A区","B区","C区"],
   		                             axisLine:{
   		                               lineStyle:{
   		                                   color:'white',
   		                                   width:5,
   		                               }
   		                           }, 

   		                                   },
   		                                   
   		                            yAxis:{
   		                            	type:"value",
   		                            	 axisLine:{
         		                               lineStyle:{
         		                                   color:'white',
         		                                   width:7,//这里是为了突出显示加上的
         		                               },
         		                           } 
   		                            },
   		                            series:[{
   			                                 name:"数量单位:次",
   			                                 type:'bar',
   			                                 data:[bx.atimes,bx.btimes,bx.ctimes],
   			                               itemStyle:{
   			                                 normal:{
   			                                     color:function(params){
   			                                         var colorlist = ['#DA251D'];
   			                                         return colorlist[params.dataIndex];
   			                                     }
   			                                 }
   			                             }
   		                         
   		                            }]
                                 };
                       
                       var myChartjy = echarts.init(document.getElementById('jy'));
                       var optionjy = {
   		   
   		                            title:{
   			                        subtext:'本年度全校就医申请汇总条形图'
   			                        	
	                                          },
	                                          
   		                            tooltip:{},
   		                            legend:{
   			                              data:["个数"],
   		                                   },
   		                                 textStyle: {
   		                                   color: 'black',
   		                                   width:'8',
   		                               },
   		                            xAxis:{
   		                            	type:"category",
   			                             data:["A区","B区","C区"],
   		                             axisLine:{
   		                               lineStyle:{
   		                                   color:'white',
   		                                   width:5,
   		                               }
   		                           }, 

   		                                   },
   		                                   
   		                            yAxis:{
   		                            	type:"value",
   		                            	 axisLine:{
         		                               lineStyle:{
         		                                   color:'white',
         		                                   width:7,//这里是为了突出显示加上的
         		                               },
         		                           } 
   		                            },
   		                            series:[{
   			                                 name:"数量单位:次",
   			                                 type:'bar',
   			                                 data:[jy.atimes,jy.btimes,jy.ctimes],
   			                               itemStyle:{
   			                                 normal:{
   			                                     color:function(params){
   			                                         var colorlist = ['#DA251D'];
   			                                         return colorlist[params.dataIndex];
   			                                     }
   			                                 }
   			                             }
   		                         
   		                            }]
                                 };
                       
                       var myChartts = echarts.init(document.getElementById('ts'));
                       var optionts = {
   		   
   		                            title:{
   			                        subtext:'本年度全校退宿申请汇总条形图'
   			                        	
	                                          },
	                                          
   		                            tooltip:{},
   		                            legend:{
   			                              data:["个数"],
   		                                   },
   		                                 textStyle: {
   		                                   color: 'black',
   		                                   width:'8',
   		                               },
   		                            xAxis:{
   		                            	type:"category",
   			                             data:["A区","B区","C区"],
   		                             axisLine:{
   		                               lineStyle:{
   		                                   color:'white',
   		                                   width:5,
   		                               }
   		                           }, 

   		                                   },
   		                                   
   		                            yAxis:{
   		                            	type:"value",
   		                            	 axisLine:{
         		                               lineStyle:{
         		                                   color:'white',
         		                                   width:7,//这里是为了突出显示加上的
         		                               },
         		                           } 
   		                            },
   		                            series:[{
   			                                 name:"数量单位:次",
   			                                 type:'bar',
   			                                 data:[ts.atimes,ts.btimes,ts.ctimes],
   			                               itemStyle:{
   			                                 normal:{
   			                                     color:function(params){
   			                                         var colorlist = ['#DA251D'];
   			                                         return colorlist[params.dataIndex];
   			                                     }
   			                                 }
   			                             }
   		                         
   		                            }]
                                 };
                       myChartwz.setOption(optionwz); 
                       myChartbx.setOption(optionbx); 
                       myChartjy.setOption(optionjy); 
                       myChartts.setOption(optionts); 
                           },
               error: function(data){
                               alert("请求失败");
                                    }
     });
     setTimeout("chartsum()",5000); 
}
function refresh(){
		
		history.go(0);
		  
		
		 
	}
	

	</script>
	</body>
</html>