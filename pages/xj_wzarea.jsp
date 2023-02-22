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
	<body onload="areachart()">
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
	<a href="javascript:void(0);" onclick="back()" class="nav-item nav-link"><i class="fa fa-tachometer-alt me-2"></i>首页</a>
	
	
	
	</div>
	
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
	<a href="signin.jsp" class="dropdown-item">退出</a>
	</div>
	</div>
	</div>
	</nav>
	
	<div class="container-fluid pt-4 px-4">
	<div class="row g-4">
	<div class="col-sm-12 col-xl-6">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">大数据展示</h6>
	
	<div id="wzA" style="height: 250px;width:500px;float:left;"></div>

	</div>
	</div>
	
	
	
	<div class="col-sm-12 col-xl-6">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">大数据展示</h6>
	
	<div id="wzB" style="height: 250px;width:500px;float:left;"></div>

	</div>
	</div>
	
	
	<div class="col-sm-12 col-xl-6">
	<div class="bg-light rounded h-100 p-4">
	<h6 class="mb-4">大数据展示</h6>
	
	<div id="wzC" style="height: 250px;width:500px;float:left;"></div>

	</div>
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
	
	function areachart(){
		
		 $.ajax({
	          url: "/DM/wzareachart.html",
	          type: "GET",
	          datatype:"text",
	          success: function(data) {
	        	  var obj = jQuery.parseJSON(data);
                  
                  var wzA = obj.wzinfoA;
                  var wzB = obj.wzinfoB;
                  var wzC = obj.wzinfoC;
                  
		               var myChartA = echarts.init(document.getElementById('wzA'));
                    var optionA = {
		   
		                            title:{
			                        subtext:'本年度A区物资申请汇总条形图'
			                        	
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
			                                 data:[wzA.wz1,wzA.wz2,wzA.wz3,wzA.wz4],
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
                    var myChartB = echarts.init(document.getElementById('wzB'));
                    var optionB = {
		   
		                            title:{
			                        subtext:'本年度B区物资申请汇总条形图'
			                        	
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
			                                 data:[wzB.wz1,wzB.wz2,wzB.wz3,wzB.wz4],
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
                  
                    var myChartC = echarts.init(document.getElementById('wzC'));
                    var optionC = {
		   
		                            title:{
			                        subtext:'本年度C区物资申请汇总条形图'
			                        	
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
			                                 data:[wzC.wz1,wzC.wz2,wzC.wz3,wzC.wz4],
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
                    myChartA.setOption(optionA); 
                    myChartB.setOption(optionB); 
                    myChartC.setOption(optionC); 
                        },
            error: function(data){
                            alert("请求失败");
                                 }
  });
  setTimeout("areachart()",5000); 
	          }
	
	
	
	
function back(){
		
		history.back();
		  
		
		 
	}
	</script>
	</body>
</html>