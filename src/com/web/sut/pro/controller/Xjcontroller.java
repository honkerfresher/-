package com.web.sut.pro.controller;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSONObject;
import com.web.sut.pro.dao.StuDao;
import com.web.sut.pro.entify.BxhzInfo;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.JyhzInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LshzInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.QjInfo;
import com.web.sut.pro.entify.RoomInfo;
import com.web.sut.pro.entify.Roommate;
import com.web.sut.pro.entify.Shop;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TshzInfo;
import com.web.sut.pro.entify.TslogInfo;
import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjInfo;
import com.web.sut.pro.entify.XjtzInfo;
import com.web.sut.pro.service.UserService;
import com.web.sut.pro.service.XjService;
import com.web.sut.pro.service.StuService;

@Controller
public class Xjcontroller {

	@Resource
	XjService xj;
	 
	int snum;
	String name;
	String rmname;
	String account;
	int sid;
	@RequestMapping(value="/chartsum")
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void wzchartsum(HttpServletResponse response,ModelMap map) {

		JSONObject obj = new JSONObject();
		WzhzInfo wzlist = xj.wzhzchartYearData();//本年度全校物资申请汇总数据
		BxhzInfo bxlist = xj.bxhzchartYearData();
		JyhzInfo jylist = xj.jyhzchartYearData();
		TshzInfo tslist = xj.tshzchartYearData();
		/*LshzInfo lslist = xj.lshzchartYearData();
		
		
		String str1="";
		
		obj.put("lsinfo", lslist);
		
		*/
		obj.put("jyinfo", jylist);
		obj.put("bxinfo", bxlist);
		obj.put("wzinfo", wzlist);
		obj.put("tsinfo", tslist);
		try {
			response.getWriter().print(obj.toJSONString());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	
		
    }
	
	
	
	/*@RequestMapping(value="/wzdelet")
	@ResponseBody
	public void wzdelet(@RequestParam String snum){//获取多个值后，传给后台保存entify
		
		wz.setSnum(snum);
		wz.setRmname(rmname);
		wz.setContent(content);
		wz.setDate(date);
		stu.addWzlog(wz);
		System.out.println(wz.date);
		
	}*/
	
	@RequestMapping(value="/wzareadetail")
	public String wzareade(ModelMap map){//获取多个值后，传给后台保存entify
		
		
		
		return "xj_wzarea";
	}
	@RequestMapping(value="/wzareachart")
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void wzareachart(HttpServletResponse response) {

		JSONObject obj = new JSONObject();
		WzhzInfo wzA = xj.wzhzchartYearDataA();//本年度全校物资申请汇总数据
		WzhzInfo wzB = xj.wzhzchartYearDataB();
		WzhzInfo wzC = xj.wzhzchartYearDataC();
         obj.put("wzinfoA", wzA);
         obj.put("wzinfoB", wzB);
         obj.put("wzinfoC", wzC);
		try {
			response.getWriter().print(obj.toJSONString());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
	
	@RequestMapping(value="/usermanege")
	public String usermanege(){//获取多个值后，传给后台保存entify
		
		
		
		return "xj_usermanege";
	}
	@RequestMapping(value="/studata",method=RequestMethod.GET)
	public void studata(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		List<StuInfo> xslist = xj.studata();
		List<User> userlist = xj.alluserdata();
	JSONObject obj = new JSONObject();
	String str1="";
	if(xslist.size()>0) {
		for(int j=0;j<xslist.size();j++) {
			
			str1=str1+xslist.get(j).getSnum()+"#"+xslist.get(j).getName()+"#"+xslist.get(j).getRmname()+"#"+xslist.get(j).getMajo()+"#"+xslist.get(j).getLeve()+"#"+xslist.get(j).getClas()+"#"+xslist.get(j).getTele()+"#"+xslist.get(j).getFdynum()+"#"+xslist.get(j).getHome()+"#"+xslist.get(j).getSecrid()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("xslist", str1);str1="";
	
	if(userlist.size()>0) {
		for(int j=0;j<userlist.size();j++) {
			
			str1=str1+userlist.get(j).getAccount()+"#"+userlist.get(j).getName()+"#"+userlist.get(j).getRid()+"#"+userlist.get(j).getSecrid()+"#"+userlist.get(j).getTele()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("userlist", str1);
	response.getWriter().print(obj.toJSONString());
}
	
	@RequestMapping(value="/deletlog",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void deletlog(@RequestParam String snum) {
		this.snum =Integer.parseInt(snum); 
		xj.studelet(this.snum);
	}
	@RequestMapping(value="/updatelog",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void updatelog(@RequestParam String snum) {
		
		this.snum = Integer.parseInt(snum);
	}
	@RequestMapping(value="/updatelogtz")
	public String userupdatetz(ModelMap map){//获取多个值后，传给后台保存entify
		
		StuInfo stu=xj.findstuBySid(this.snum);
		map.put("stu",stu);
		return "xj_stuupdateform";
	}
	
	@RequestMapping(value="/stuupdate",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void stuupdate(@RequestParam String snum,@RequestParam String name,@RequestParam String rmname,@RequestParam String majo,@RequestParam String leve,@RequestParam String clas,@RequestParam String tele,@RequestParam String fdynum,@RequestParam String home) throws UnsupportedEncodingException {
	
		this.snum=Integer.parseInt(snum);
		StuInfo stu = new StuInfo();
		stu.setClas( new String(clas.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setFdynum(new String(fdynum.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setHome(new String(home.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setLeve(new String(leve.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setMajo(new String(majo.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setName(new String(name.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setRmname(new String(rmname.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setSnum(snum);
		stu.setTele(new String(tele.getBytes("ISO-8859-1"),"UTF-8"));
		xj.stuupdate(stu);
		
	}
	@RequestMapping(value="/stuassign",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void stuassign(@RequestParam String snum,@RequestParam String name) {
		
		this.snum = Integer.parseInt(snum);
		try {
			this.name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	@RequestMapping(value="/assigninterprettz")
	public String assigntz(ModelMap map){//获取多个值后，传给后台保存entify
		
	
		map.put("snum",snum);
		map.put("name",name);
		return "xj_stuassign";
	}
	@RequestMapping(value="/assignconfirm",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void assigncon(@RequestParam String snum,HttpServletResponse response) {
		
		this.snum = Integer.parseInt(snum);
		
		StuInfo stu= new StuInfo();
		StuInfo he = xj.findstuBySid(this.snum);
		String dorm = he.getRmname().substring(0,4);//获取寝室楼号并判断是否有寝室
		JSONObject obj = new JSONObject();
		
		if(dorm==null||dorm=="") {
			obj.put("erro", "本学生暂无寝室");
			try {
				response.getWriter().print(obj.toJSONString());
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		StuInfo lcma = xj.lcmanagerWarn(dorm);//楼层管理员冲突判断
		String s = lcma.getSnum();
		System.out.println(s);
		if(s!="")
		{
			obj.put("erro", "本楼层已有管理员");
			try {
				response.getWriter().print(obj.toJSONString());
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}else {	
		
		stu.setSnum(snum);
		xj.assignconfirm(stu);
	}}
	
	@RequestMapping(value="/fjmanage")
	public String fjmanage(){//获取多个值后，传给后台保存entify
		
		
		
		return "xj_fjmanage";
	}
	
	@RequestMapping(value="/fjdata",method=RequestMethod.GET)
	public void fjdata(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		List<RoomInfo> Cfjlist = xj.fjareaCdata();
		List<RoomInfo> Bfjlist = xj.fjareaBdata();
		List<RoomInfo> Afjlist = xj.fjareaAdata();
	JSONObject obj = new JSONObject();
	String str1="";
	if(Cfjlist.size()>0) {
		for(int j=0;j<Cfjlist.size();j++) {
			
			str1=str1+Cfjlist.get(j).getName()+"#"+Cfjlist.get(j).getAvaliable()+"#"+Cfjlist.get(j).getBedcount()+"#"+Cfjlist.get(j).getSid()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("Cfjlist", str1);str1="";
	if(Bfjlist.size()>0) {
		for(int j=0;j<Bfjlist.size();j++) {
			
			str1=str1+Bfjlist.get(j).getName()+"#"+Bfjlist.get(j).getAvaliable()+"#"+Bfjlist.get(j).getBedcount()+"#"+Bfjlist.get(j).getSid()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("Bfjlist", str1);str1="";
	if(Afjlist.size()>0) {
		for(int j=0;j<Afjlist.size();j++) {
			
			str1=str1+Afjlist.get(j).getName()+"#"+Afjlist.get(j).getAvaliable()+"#"+Afjlist.get(j).getBedcount()+"#"+Afjlist.get(j).getSid()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("Afjlist", str1);str1="";
	response.getWriter().print(obj.toJSONString());
}
	
	@RequestMapping(value="/xjcheckroom")
	@ResponseBody
	public void checkroommate(@RequestParam int rmsid) throws UnsupportedEncodingException{
		this.sid = rmsid;
		RoomInfo room = xj.findroomBysid(sid);
		this.rmname = room.getName();
		 
		
}
	@RequestMapping(value="/xjtzcheckroommate")
	public String tzcheckroommate(ModelMap map) throws IOException{
		List<Roommate> rmmat = xj.checkroommate(rmname);
		map.put("rmmtlist",rmmat);
		return "xj_checkroommate";
}
	
	@RequestMapping(value="/xjwzcl")
	public String xjwzcl(ModelMap map) throws IOException{
		
		
		List<WzhzInfo> wzhzlist = xj.qjwzhzYear();
		
		map.put("wzlist",wzhzlist);
		return "xj_wzcl";
}
	
	@RequestMapping(value="/shopbuy")
	@ResponseBody
	public void shop(@RequestParam int sid) throws UnsupportedEncodingException{
		this.sid = sid;
		
		
}
	@RequestMapping(value="/tzshop")
	public String tzshop(ModelMap map) throws IOException{
		
		
		List<Shop> shoplist = xj.getshop();
		
		map.put("shoplist",shoplist);
		map.put("sid",sid);
		return "xj_shop";
}
	@RequestMapping(value="/tzoutter")
	public String outter(ModelMap map) throws IOException{
		
		
		List<Shop> outterlist = xj.getoutter();
		map.put("sid",sid);
		map.put("shoplist",outterlist);
		return "xj_shop";
}
	
	@RequestMapping(value="/purchasetz")
	@ResponseBody
	public void shop(@RequestParam int sid,@RequestParam int shopsid) throws UnsupportedEncodingException{
		this.sid = sid;
		int shop = shopsid;
		//省略超市采购订单生成模块
}
	
	@RequestMapping(value="/deletuser",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void deletuser(@RequestParam String account) {
		this.account =account; 
		xj.userdelet(this.account);
		xj.studelet(Integer.parseInt(account));
	}
	@RequestMapping(value="/updateuser",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void updateuser(@RequestParam String account) {
		
		this.account = account;
	}
	@RequestMapping(value="/updateusertz")
	public String updateusertz(ModelMap map){//获取多个值后，传给后台保存entify
		
		User user=xj.finduserByacc(this.account);
		map.put("user",user);
		return "xj_userupdateform";
	}
	
	@RequestMapping(value="/userupdate",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void userupdate(@RequestParam String password,@RequestParam String name,@RequestParam String tele,@RequestParam String account) throws UnsupportedEncodingException {
	
		String pswd = new String(password.getBytes("ISO-8859-1"),"UTF-8");
		String tl = new String(tele.getBytes("ISO-8859-1"),"UTF-8");
		String nm = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		User user = new User();
		user.setPassword(pswd);
		user.setTele(tl);
		user.setName(nm);
		user.setAccount(account);
		xj.userupdate(user);
		
	}
	
	@RequestMapping(value="/stuadd")
	public String stuadd(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "xj_stuadd";
	}
	
	@RequestMapping(value="/stuaddinfo",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void stuaddinfo(@RequestParam String snum,@RequestParam String name,@RequestParam String rmname,@RequestParam String majo,@RequestParam String leve,@RequestParam String clas,@RequestParam String tele,@RequestParam String fdynum,@RequestParam String home) throws UnsupportedEncodingException {
	
		this.snum=Integer.parseInt(snum);
		StuInfo stu = new StuInfo();
		stu.setClas( new String(clas.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setFdynum(new String(fdynum.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setHome(new String(home.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setLeve(new String(leve.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setMajo(new String(majo.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setName(new String(name.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setRmname(new String(rmname.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setSnum(new String(snum.getBytes("ISO-8859-1"),"UTF-8"));
		stu.setTele(new String(tele.getBytes("ISO-8859-1"),"UTF-8"));
		xj.stuadd(stu);
		
	}
	@RequestMapping(value="/useradd")
	public String useradd(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "xj_useradd";
	}
	
	@RequestMapping(value="/useraddinfo",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void useradd(@RequestParam String password,@RequestParam String name,@RequestParam String tele,@RequestParam String account) throws UnsupportedEncodingException {
	
		String pswd = new String(password.getBytes("ISO-8859-1"),"UTF-8");
		String tl = new String(tele.getBytes("ISO-8859-1"),"UTF-8");
		String nm = new String(name.getBytes("ISO-8859-1"),"UTF-8");
		User user = new User();
		user.setPassword(pswd);
		user.setTele(tl);
		user.setName(nm);
		user.setAccount(account);
		
		xj.useradd(user);
		
	}
	@RequestMapping(value="/xjtz")
	public String xjinfo(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "xj_xjinfo";
	}
	
	@RequestMapping(value="/xj_infoadd")
	public String xjinfotz(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "xj_infoadd";
	}
	@RequestMapping(value="/addxjinfo",method=RequestMethod.GET)
	@ResponseBody//有此注解则为传数据，无则传网页地址
    public void infoadd(@RequestParam String area,@RequestParam String content) throws UnsupportedEncodingException {
	
		String ar = new String(area.getBytes("ISO-8859-1"),"UTF-8");
		String con = new String(content.getBytes("ISO-8859-1"),"UTF-8");
	XjtzInfo info = new XjtzInfo();
		info.setArea(ar);
		info.setContent(con);
		
		xj.addxjtz(info);
		
	}
	@RequestMapping(value="/xjtzdata",method=RequestMethod.GET)
	public void xjtz(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		List<XjtzInfo> tzlist = xj.xjtz();
		
	JSONObject obj = new JSONObject();
	String str1="";
	if(tzlist.size()>0) {
		for(int j=0;j<tzlist.size();j++) {
			
			str1=str1+tzlist.get(j).getArea()+"#"+tzlist.get(j).getContent()+"#"+tzlist.get(j).getDate()+"#"+tzlist.get(j).getStatu()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("tzlist", str1);str1="";
	
	
	response.getWriter().print(obj.toJSONString());
}
}
