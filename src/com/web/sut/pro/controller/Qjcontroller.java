package com.web.sut.pro.controller;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.DoctorInfo;
import com.web.sut.pro.entify.FixInfo;
import com.web.sut.pro.entify.FixerInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LjInfo;
import com.web.sut.pro.entify.QjInfo;
import com.web.sut.pro.entify.QjtzInfo;
import com.web.sut.pro.entify.RoomInfo;
import com.web.sut.pro.entify.Roommate;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjtzInfo;
import com.web.sut.pro.service.QjService;

@Controller
public class Qjcontroller {

	@Resource
	QjService qj;
	
	JylogInfo jys=new JylogInfo();
	
	WzlogInfo wzs=new WzlogInfo();
	
	BxlogInfo bxs=new BxlogInfo();
	
	String Rmname;
	QjInfo qjinfo = new QjInfo();
	String account;
	int sid;
	@RequestMapping(value="/xslycx",method=RequestMethod.GET)
	public void xslycx(HttpServletRequest request,HttpServletResponse response,@RequestParam String dormnum,@RequestParam String account) throws IOException{
		this.account = account;
		QjInfo qjinfo = qj.UsertoQj(this.account);	
		String dorm = dormnum;
		qjinfo.setDormnum(dormnum);
		List<StuInfo> xslist = qj.xslycx(qjinfo);
	JSONObject obj = new JSONObject();
	String str1="";
	if(xslist.size()>0) {
		for(int j=0;j<xslist.size();j++) {
			
			str1=str1+xslist.get(j).getSnum()+"#"+xslist.get(j).getName()+"#"+xslist.get(j).getRmname()+"#"+xslist.get(j).getMajo()+"#"+xslist.get(j).getLeve()+"#"+xslist.get(j).getClas()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("xslist", str1);
	response.getWriter().print(obj.toJSONString());
}
	@RequestMapping(value="/qjxsqycx",method=RequestMethod.GET)
	public void qjxsqycx(HttpServletRequest request,HttpServletResponse response,@RequestParam String account) throws IOException{
		this.account = account;
		QjInfo qjinfo = qj.UsertoQj(this.account);	
		
		List<StuInfo> xslist = qj.xsqycx(qjinfo);
	JSONObject obj = new JSONObject();
	String str1="";
	if(xslist.size()>0) {
		for(int j=0;j<xslist.size();j++) {
			
			str1=str1+xslist.get(j).getSnum()+"#"+xslist.get(j).getName()+"#"+xslist.get(j).getRmname()+"#"+xslist.get(j).getMajo()+"#"+xslist.get(j).getLeve()+"#"+xslist.get(j).getClas()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("xslist", str1);
	response.getWriter().print(obj.toJSONString());
}
	@RequestMapping(value="/qjfjqcx",method=RequestMethod.GET)
	public void qjfjqcx(HttpServletRequest request,HttpServletResponse response,@RequestParam String account) throws IOException{
	this.account = account;
	QjInfo qjinfo = qj.UsertoQj(this.account);	
	
	List<RoomInfo> fjlist = qj.fjqcx(qjinfo.getArea());
	JSONObject obj = new JSONObject();
	String str1="";
	if(fjlist.size()>0) {
		for(int j=0;j<fjlist.size();j++) {
			
			str1=str1+fjlist.get(j).getName()+"#"+fjlist.get(j).getFloor()+"#"+fjlist.get(j).getAvaliable()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("fjlist", str1);
	response.getWriter().print(obj.toJSONString());
}
	
	@RequestMapping(value="/fjlycx",method=RequestMethod.GET)
	public void fjlycx(HttpServletRequest request,HttpServletResponse response,@RequestParam String account,@RequestParam String dormnum) throws IOException{
	this.account = account;
	QjInfo qjinfo = qj.UsertoQj(this.account);	
    String dorm = dormnum;
    qjinfo.setDormnum(dorm);
	List<RoomInfo> fjlist = qj.fjlycx(qjinfo);
	JSONObject obj = new JSONObject();
	String str1="";
	if(fjlist.size()>0) {
		for(int j=0;j<fjlist.size();j++) {
			
			str1=str1+fjlist.get(j).getName()+"#"+fjlist.get(j).getFloor()+"#"+fjlist.get(j).getAvaliable()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("fjlist", str1);
	response.getWriter().print(obj.toJSONString());
}
	@RequestMapping(value="/qjcr")
	@ResponseBody
	public void checkroommate(@RequestParam String rmname) throws UnsupportedEncodingException{
		String rmnm = rmname;
		this.Rmname = new String(rmnm.getBytes("ISO-8859-1"),"UTF-8");
		 
		
}
	@RequestMapping(value="/qjtzcheckroommate")
	public String tzcheckroommate(ModelMap map) throws IOException{
		List<Roommate> rmmat = qj.checkroommate(Rmname);
		map.put("rmmtlist",rmmat);
		return "qj_checkroommate";
}


	@RequestMapping(value="/qj_copy")
	@ResponseBody
	public void qj_copy(@RequestParam String sid){
		qj.qj_copy(sid);
		 
		
}
	@RequestMapping(value="/wzqjcl")//跳转并查看本区所有楼宇物资申请情况
	@ResponseBody
	public void wzqjcl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/qjwzcltz")//跳转并查看本区所有楼宇物资申请情况
	public String wzqjtz(ModelMap map) {
	
	qjinfo = qj.UsertoQj(this.account);
	
	List<WzhzInfo> lywzlist = qj.lywz(qjinfo.getArea()); 
	
	map.put("lywzlist", lywzlist);
	return "qj_wzcl";
}
	@RequestMapping(value="/qjwzfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void wzfail(@RequestParam String sid) {
	qj.wzfail(sid);

}
	@RequestMapping(value="/qjwzpass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void wzpass(@RequestParam String sid) {
	qj.wzpass(sid);

}

	
	
	@RequestMapping(value="/qjbxcl")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void bxcl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/qjbxtz")//跳转并查看本楼物资申请情况
	public String bxtz(ModelMap map) {
	
	qjinfo = qj.UsertoQj(this.account);
	
	List<BxlogInfo> bxlist = qj.bxcl(qjinfo.getArea()); 
	
	map.put("bxlist", bxlist);
	return "qj_bxcl";
}

	@RequestMapping(value="/qjbxfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void bxfail(@RequestParam String sid) {
	qj.bxfail(sid);

}
	@RequestMapping(value="/qjbxpass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void bxpass(@RequestParam String sid) {
	qj.bxpass(sid);

}
	@RequestMapping(value="/wzqjhz")
	@ResponseBody
	public void wzqjhz(@RequestParam String account) {
		
	QjInfo qjinfo = qj.UsertoQj(account);
	
	WzhzInfo wzhzinfo = qj.getqjwz(qjinfo);//进行本区物资申请信息汇总
	System.out.println(wzhzinfo.wz1);
	SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
	wzhzinfo.setDate(dt.format(new Date()));
	
	wzhzinfo.setArea(qjinfo.getArea());
    qj.addwzqjhz(wzhzinfo);//添加汇总的物资信息入库
    
}
	
	@RequestMapping(value="/qjjycl")
	@ResponseBody
	public void jycl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/qjjytz")//跳转并查看本楼就医申请情况
	public String jytz(ModelMap map) {
	
	qjinfo = qj.UsertoQj(this.account);
	
	List<JylogInfo> jylist = qj.jycl(qjinfo.getArea()); 
	
	map.put("jylist", jylist);
	return "qj_jycl";
}
	@RequestMapping(value="/qjjyfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void jyfail(@RequestParam String sid) {
	qj.jyfail(sid);

}
	@RequestMapping(value="/qjjypass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void jypass(@RequestParam String sid) {
	qj.jypass(sid);

}
	@RequestMapping(value="/bxy")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void bxy(@RequestParam String sid) {
	this.sid=Integer.parseInt(sid);

}
	@RequestMapping(value="/bxytz")//跳转并查看本楼就医申请情况
	public String bxytz(ModelMap map) {
	
	FixInfo fixinfo = new FixInfo();
	fixinfo.setSid(this.sid);
	List<FixerInfo> bxylist = qj.bxy(); 
	map.put("bxsid", this.sid);
	map.put("bxylist", bxylist);
	return "qj_bxy";
}
	@RequestMapping(value="/fixtz")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void fixtz(@RequestParam String sid,@RequestParam String wnum) {
	this.sid =Integer.parseInt(sid);
	String wn = wnum;
	BxlogInfo bxinfo = qj.findBxinfoBysid(this.sid);
    FixInfo fixinfo = new FixInfo();
    fixinfo.setContent(bxinfo.getContent());
    fixinfo.setRmname(bxinfo.getRmname());
    Date date = new Date();
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
    fixinfo.setDate(dateformat.format(date));
	fixinfo.setFixnum(wn);
	qj.addfixtz(fixinfo);
	qj.bxtofixer(this.sid);//报修申请状态：6=通知维修员维修中 
	
}
	@RequestMapping(value="/hospital")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void hospital(@RequestParam String sid) {
	this.sid=Integer.parseInt(sid);

}
	@RequestMapping(value="/hospitaltz")//跳转并查看本楼就医申请情况
	public String hospitaltz(ModelMap map) {
	
	DoctorInfo docinfo = new DoctorInfo();
	//docinfo.setSid(this.sid);
	List<DoctorInfo> doclist = qj.doctor(); 
	map.put("jysid", this.sid);
	map.put("doclist", doclist);
	return "qj_doctor";
}
	
	@RequestMapping(value="/qjtz")
	public String xjinfo(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "qj_qjinfo";
	}
	
	@RequestMapping(value="/qj_infoadd")
	public String qjinfotz(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "qj_infoadd";
	}
	@RequestMapping(value="/addqjinfo",method=RequestMethod.GET)
    public void infoadd(@RequestParam String dormnum,@RequestParam String content,@RequestParam String account,HttpServletResponse response) throws IOException {
	String acc = account;
		String dor = new String(dormnum.getBytes("ISO-8859-1"),"UTF-8");
		String con = new String(content.getBytes("ISO-8859-1"),"UTF-8");
	QjtzInfo info = new QjtzInfo();
		info.setDormnum(dor);
		info.setContent(con);
	    qjinfo = qj.UsertoQj(acc);
	    JSONObject obj = new JSONObject();
		String str1="成功";
		System.out.println(dor.substring(0,1)+"  "+qjinfo.getArea());
	    String a = qjinfo.getArea();
	    String b = dor.substring(0,1);
		if(a.equals(b)) {
			qj.addqjtz(info);
			obj.put("error", str1);//空值会丢失键值对
	    	response.getWriter().print(obj.toJSONString());
	    }else {
	    	obj.put("error", "不能通知他区楼宇，重新检查楼号");
	    	response.getWriter().print(obj.toJSONString());
		
	    }
	}
	@RequestMapping(value="/qjtzdata",method=RequestMethod.GET)
	public void qjtz(HttpServletRequest request,HttpServletResponse response,@RequestParam String account) throws IOException{
		String acc = account;
		qjinfo = qj.UsertoQj(acc);
		List<QjtzInfo> tzlist = qj.qjtz(qjinfo.getArea());
		
	JSONObject obj = new JSONObject();
	String str1="";
	if(tzlist.size()>0) {
		for(int j=0;j<tzlist.size();j++) {
			
			str1=str1+tzlist.get(j).getDormnum()+"#"+tzlist.get(j).getContent()+"#"+tzlist.get(j).getDate()+"#"+tzlist.get(j).getStatu()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("tzlist", str1);str1="";
	
	
	response.getWriter().print(obj.toJSONString());
}
}
