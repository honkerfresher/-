package com.web.sut.pro.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LcInfo;
import com.web.sut.pro.entify.LjInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.LytzInfo;
import com.web.sut.pro.entify.QjInfo;
import com.web.sut.pro.entify.QjtzInfo;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TslogInfo;
import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjInfo;
import com.web.sut.pro.entify.XjtzInfo;
import com.web.sut.pro.service.UserService;
import com.web.sut.pro.service.XjService;
import com.web.sut.pro.service.LjService;
import com.web.sut.pro.service.QjService;
import com.web.sut.pro.service.StuService;
@Controller
@SessionAttributes({"RT","FUN","CY"})
public class Logincontroller {

	@Resource
	UserService UserService;
	
	@Resource
	StuService StuService;
	
	@Resource
	LjService lj;
	
	@Resource
	QjService qj;
	
	@Resource
	XjService xj;
	
	private String account;
	private String password;
	static String Snum;
	@RequestMapping(value="/go")
	@ResponseBody
	public void  go(@RequestParam String account,@RequestParam String password) {
		
		this.account=account;
		this.password=password;
	
		Snum=account;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String UserLogin(ModelMap map){//获取多个值后，传给后台保存entify
		User user = new User();
		user.setAccount(account);
		System.out.println(account);
		user = UserService.doAccountQuery(user);
		System.out.println(user.getSecrid());
	
		if(user == null || user.getStatus().equals("0")){
			System.out.println("账号不可用");
			return "redirect:signin.jsp?err=500";
		}else if(!user.getPassword().equals(password)){
				System.out.println("密码错误");
				return "redirect:signin.jsp?err=500";
			}else if((user.getRid().equals("10001"))&&(!user.getSecrid().equals("10010"))) {
				StuInfo stu = UserService.UsertoStu(user);
				
				map.put("RT", user);
				List<StuInfo> rmmates = StuService.selRoomMate(stu);
				FdyInfo fdy = StuService.selFdy(stu);
				map.put("rmmates", rmmates);
				map.put("fdy", fdy);
				List<TslogInfo> ts = StuService.selTslist(stu);
				List<LslogInfo> ls = StuService.selLslist(stu);
				List<WzlogInfo> wz = StuService.selWzlist(stu);
				List<JylogInfo> jy = StuService.selJylist(stu);
				List<BxlogInfo> bx = StuService.selBxlist(stu);
				map.put("tslist",ts);
				map.put("lslist",ls);
				map.put("wzlist",wz);
				map.put("jylist",jy);
				map.put("bxlist",bx);
                return "stu_main";
				}else if((user.getRid().equals("10001"))&&(user.getSecrid().equals("10010"))) {
					StuInfo stu = UserService.UsertoStu(user);
					
					map.put("RT", user);
					List<StuInfo> rmmates = StuService.selRoomMate(stu);
					FdyInfo fdy = StuService.selFdy(stu);
					map.put("rmmates", rmmates);
					map.put("fdy", fdy);
					List<TslogInfo> ts = StuService.selTslist(stu);
					List<LslogInfo> ls = StuService.selLslist(stu);
					List<WzlogInfo> wz = StuService.selWzlist(stu);
					List<JylogInfo> jy = StuService.selJylist(stu);
					List<BxlogInfo> bx = StuService.selBxlist(stu);
					map.put("tslist",ts);
					map.put("lslist",ls);
					map.put("wzlist",wz);
					map.put("jylist",jy);
					map.put("bxlist",bx);
        
					LytzInfo lytz = new LytzInfo();
					lytz.setArea(stu.getRmname().substring(0,1));
					lytz.setDormnum(stu.getRmname().substring(0,2));
					lytz.setLc(stu.getRmname().substring(3,4));
					List<LytzInfo> tzlist =  StuService.lytz(lytz);
					map.put("tzlist",tzlist);
					
					
					LcInfo lcinfo =new LcInfo();
					lcinfo.setDormnum(stu.getRmname().substring(0,2));
					lcinfo.setLc(stu.getRmname().substring(3,4));
					
					StuService.wzgq(lcinfo);//学生物资申请过期
					StuService.lytzgq(lcinfo);//楼宇下发通知过期
					return "cj_main";
					
					}else if(user.getRid().equals("10007")) {
					map.put("RT", user);
					XjInfo xjinfo = xj.UsertoXj(account);
					
					
					
					
					System.out.println("校级管理员登录");
					
					
					return "xj_main";
					}else if(user.getRid().equals("10008")) {
						map.put("RT", user);
						XjtzInfo xjtz = new XjtzInfo(); 
						QjInfo qjinfo = qj.UsertoQj(account);
						xjtz.setArea(qjinfo.getArea());
						List<XjtzInfo> tz =  qj.xjtz(xjtz);
						
						map.put("tzlist",tz);
						
						qj.xjtzgq(qjinfo);
						System.out.println("区级管理员登录");
						
						
						return "qj_main";
						}else if(user.getRid().equals("10009")) {
							map.put("RT", user);
							QjtzInfo qjtz = new QjtzInfo();
							LjInfo ljinfo = lj.UsertoLj(account);
							qjtz.setDormnum(ljinfo.getDormnum());
							List<QjtzInfo> tz =  lj.qjtz(qjtz);
							map.put("tzlist",tz);
							System.out.println("楼宇管理员登录");
							lj.qjtzgq(ljinfo);
							
							return "ly_main";
							}else {
					
					return "redirect:signin.jsp?err=500";
				}
	}
	
	
	
	
}
