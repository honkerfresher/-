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
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.FpqsInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LcInfo;
import com.web.sut.pro.entify.LjInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.LytzInfo;
import com.web.sut.pro.entify.LywzhzInfo;
import com.web.sut.pro.entify.QjtzInfo;
import com.web.sut.pro.entify.RoomInfo;
import com.web.sut.pro.entify.Roommate;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TslogInfo;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjtzInfo;
import com.web.sut.pro.service.LjService;


@Controller
public class Ljcontroller {

	
	@Resource
	LjService lj;

	String Rmname;
	LjInfo ljinfo = new LjInfo();
	String account;
	String lssid;//处理完留宿信息，将信息状态改为已分配
	@RequestMapping(value="/xsxmcx",method=RequestMethod.GET)
	public void xsxmcx(HttpServletRequest request,HttpServletResponse response,@RequestParam String xsxm) throws IOException{
	String xsxm1=xsxm;
	String name=new String(xsxm1.getBytes("ISO-8859-1"),"UTF-8");
		List<StuInfo> xslist = lj.xsxmcx(name);
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

	@RequestMapping(value="/xsqscx",method=RequestMethod.GET)
	public void xsqscx(HttpServletRequest request,HttpServletResponse response,@RequestParam String xsqs) throws IOException{
	String xsqs1=xsqs;
	String qs=new String(xsqs1.getBytes("ISO-8859-1"),"UTF-8");
		List<StuInfo> xslist = lj.xsqscx(qs);
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
	@RequestMapping(value="/xsxhcx",method=RequestMethod.GET)
	public void xsxhcx(HttpServletRequest request,HttpServletResponse response,@RequestParam String xsxh) throws IOException{
	String xsxh1=xsxh;
	String xh=new String(xsxh1.getBytes("ISO-8859-1"),"UTF-8");
		List<StuInfo> xslist = lj.xsxhcx(xh);
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
	@RequestMapping(value="/xszycx",method=RequestMethod.GET)
	public void xszycx(HttpServletRequest request,HttpServletResponse response,@RequestParam String xszy) throws IOException{
	String xszy1=xszy;
	String zy=new String(xszy1.getBytes("ISO-8859-1"),"UTF-8");
		List<StuInfo> xslist = lj.xszycx(zy);
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
	@RequestMapping(value="/xsqycx",method=RequestMethod.GET)
	public void xsqycx(HttpServletRequest request,HttpServletResponse response,@RequestParam String account) throws IOException{
		this.account = account;
		LjInfo ljinfo = lj.UsertoLj(this.account);	
		
		
		List<StuInfo> xslist = lj.xsqycx(ljinfo.getDormnum());
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
	@RequestMapping(value="/fjqcx",method=RequestMethod.GET)
	public void fjqcx(HttpServletRequest request,HttpServletResponse response,@RequestParam String account) throws IOException{
	this.account = account;
	LjInfo ljinfo = lj.UsertoLj(this.account);	
	
	List<RoomInfo> fjlist = lj.fjqcx(ljinfo.getDormnum());
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
	@RequestMapping(value="/fjfloorcx",method=RequestMethod.GET)
	public void fjfloorcx(HttpServletRequest request,HttpServletResponse response,@RequestParam String floor,@RequestParam String account) throws IOException{
		this.account  =account;
		LjInfo ljinfo = lj.UsertoLj(this.account);
		String floor1=floor;
		String lc=new String(floor1.getBytes("ISO-8859-1"),"UTF-8");
	    RoomInfo room = new RoomInfo();
	     room.setFloor(lc);
	     room.setDormnum(ljinfo.getDormnum());
		List<RoomInfo> fjlist = lj.fjfloorcx(room);
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
	@RequestMapping(value="/cr")
	@ResponseBody
	public void checkroommate(@RequestParam String rmname) throws UnsupportedEncodingException{
		String rmnm = rmname;
		this.Rmname = new String(rmnm.getBytes("ISO-8859-1"),"UTF-8");
		 
		
}
	@RequestMapping(value="/tzcheckroommate")
	public String tzcheckroommate(ModelMap map) throws IOException{
		List<Roommate> rmmat = lj.checkroommate(Rmname);
		map.put("rmmtlist",rmmat);
		return "ly_checkroommate";
}


	@RequestMapping(value="/lj_copy")
	@ResponseBody
	public void lj_copy(@RequestParam String sid){
		lj.lj_copy(sid);
		 
		
}
	@RequestMapping(value="/wzlycl")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void wzlycl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/wzcltz")//跳转并查看本楼物资申请情况
	public String wzlytz(ModelMap map) {
	
	ljinfo = lj.UsertoLj(this.account);
	
	List<WzhzInfo> lcwzlist = lj.lcwz(ljinfo.getDormnum()); 
	
	map.put("lcwzlist", lcwzlist);
	return "ly_wzcl";
}
	@RequestMapping(value="/wzfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void wzfail(@RequestParam String sid) {
	lj.wzfail(sid);

}
	@RequestMapping(value="/wzpass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void wzpass(@RequestParam String sid) {
	lj.wzpass(sid);

}
	@RequestMapping(value="/tscl")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void tslycl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/tstz")//跳转并查看本楼物资申请情况
	public String tslytz(ModelMap map) {
	
	ljinfo = lj.UsertoLj(this.account);
	
	List<TslogInfo> tslist = lj.tscl(ljinfo.getDormnum()); 
	
	map.put("tslist", tslist);
	return "ly_tscl";
}

	@RequestMapping(value="/tsfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void tsfail(@RequestParam String sid) {
	lj.tsfail(sid);

}
	@RequestMapping(value="/tspass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void tspass(@RequestParam String sid) {
	lj.tspass(sid);

}
	@RequestMapping(value="/lscl")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void lscl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/lstz")//跳转并查看本楼物资申请情况
	public String lstz(ModelMap map) {
	
	ljinfo = lj.UsertoLj(this.account);
	
	List<LslogInfo> lslist = lj.lscl(ljinfo.getWnum()); 
	
	map.put("lslist", lslist);
	return "ly_lscl";
}

	@RequestMapping(value="/lsfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void lsfail(@RequestParam String sid) {
	lj.lsfail(sid);

}
	@RequestMapping(value="/lspass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void lspass(@RequestParam String sid) {
	lj.lspass(sid);

}
	
	@RequestMapping(value="/bxcl")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void bxcl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/bxtz")//跳转并查看本楼物资申请情况
	public String bxtz(ModelMap map) {
	
	ljinfo = lj.UsertoLj(this.account);
	
	List<BxlogInfo> bxlist = lj.bxcl(ljinfo.getWnum()); 
	
	map.put("bxlist", bxlist);
	return "ly_bxcl";
}

	@RequestMapping(value="/bxfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void bxfail(@RequestParam String sid) {
	lj.bxfail(sid);

}
	@RequestMapping(value="/bxpass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void bxpass(@RequestParam String sid) {
	lj.bxpass(sid);

}
	@RequestMapping(value="/wzlyhz")
	@ResponseBody
	public void wzlyhz(@RequestParam String account) {
		
	LjInfo ljinfo = lj.UsertoLj(account);
	
	WzhzInfo wzhzinfo = lj.getlywz(ljinfo);//进行本楼宇物资申请信息汇总
	System.out.println(wzhzinfo.wz1);
	SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
	wzhzinfo.setDate(dt.format(new Date()));
	wzhzinfo.setDormnum(ljinfo.getDormnum());
	wzhzinfo.setArea(ljinfo.getArea());
    lj.addwzlyhz(wzhzinfo);//添加汇总的物资信息入库
    
}
	
	@RequestMapping(value="/jycl")
	@ResponseBody
	public void jycl(@RequestParam String account) {
	this.account=account;

}
	@RequestMapping(value="/jytz")//跳转并查看本楼就医申请情况
	public String jytz(ModelMap map) {
	
	ljinfo = lj.UsertoLj(this.account);
	
	List<JylogInfo> jylist = lj.jycl(ljinfo.getWnum()); 
	
	map.put("jylist", jylist);
	return "ly_jycl";
}
	@RequestMapping(value="/jyfail")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void jyfail(@RequestParam String sid) {
	lj.jyfail(sid);

}
	@RequestMapping(value="/jypass")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void jypass(@RequestParam String sid) {
	lj.jypass(sid);

}
	String snum;
	@RequestMapping(value="/qsfp")//跳转并查看本楼物资申请情况
	@ResponseBody
	public void qsfp(@RequestParam String snum) {
	this.snum = snum;

}
	@RequestMapping(value="/qsfptz")
	public String qsfptz(ModelMap map,@RequestParam String account,@RequestParam String lssid) {
		this.account = account;
		this.lssid=lssid;
		LjInfo ljinfo = lj.UsertoLj(this.account);	
		
		List<RoomInfo> fjlist = lj.fjqcx(ljinfo.getDormnum());
        map.put("snum",this.snum);		
	    map.put("fjlist",fjlist);
	    map.put("lssid",this.lssid);
	return "ly_qsfp";
}
	@RequestMapping(value="/fp")
	@ResponseBody
	public void fp(@RequestParam String snum,@RequestParam String sid,@RequestParam String lssid) {
		String rmsid = sid;
		RoomInfo room = lj.findRoomBysid(rmsid);
		String stu = snum;
		FpqsInfo fpinfo = new FpqsInfo();
		fpinfo.setSnum(stu);
		fpinfo.setRmname(room.getName());
		lj.fp(fpinfo);
		lj.fjrz(room.getName());
        String ls=lssid;
        int lss = Integer.parseInt(ls);
        lj.lssuccess(lss);
}	
	@RequestMapping(value="/checkroom")
	@ResponseBody
	public void checkroom(@RequestParam String sid) throws UnsupportedEncodingException{
		String rm = sid;
		RoomInfo room = lj.findRoomBysid(rm);
		this.Rmname = room.getName();
		 
		
}
	@RequestMapping(value="/tzcheckroom")
	public String tzcheckroom(ModelMap map) throws IOException{
		List<Roommate> rmmat = lj.checkroommate(Rmname);
		map.put("rmmtlist",rmmat);
		return "ly_checkroommate";
}
	@RequestMapping(value="/tsbl")
	@ResponseBody
	public void tsbl(@RequestParam String tssid,@RequestParam String snum) throws UnsupportedEncodingException{
		String tss = tssid;
		int ts = Integer.parseInt(tss);
		TslogInfo tsinfo = lj.getTsBysid(ts);
		
		String Rmname = tsinfo.getRmname();
		this.snum=snum; 
		lj.tscllog(ts);
		lj.tsclstu(this.snum);
		lj.tsclroom(Rmname);
}
	
	@RequestMapping(value="/ljtz")
	public String ljinfo(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "ly_ljinfo";
	}
	
	@RequestMapping(value="/ly_infoadd")
	public String ljinfotz(ModelMap map){//获取多个值后，传给后台保存entify
		
		return "ly_infoadd";
	}
	@RequestMapping(value="/addljinfo",method=RequestMethod.GET)
	@ResponseBody
    public void infoadd(@RequestParam String lc,@RequestParam String content,@RequestParam String account) throws UnsupportedEncodingException {
	    String acc = account;
		String l = new String(lc.getBytes("ISO-8859-1"),"UTF-8");
		String con = new String(content.getBytes("ISO-8859-1"),"UTF-8");
	LytzInfo info = new LytzInfo();
	ljinfo = lj.UsertoLj(acc);
		info.setLc(l);
		info.setContent(con);
		info.setDormnum(ljinfo.getDormnum());
		lj.addljtz(info);
		
	}
	@RequestMapping(value="/ljtzdata",method=RequestMethod.GET)
	public void ljtz(HttpServletRequest request,HttpServletResponse response,@RequestParam String account) throws IOException{
		String acc = account;
		ljinfo = lj.UsertoLj(acc);
		List<LytzInfo> tzlist = lj.ljtz(ljinfo);
		
	JSONObject obj = new JSONObject();
	String str1="";
	if(tzlist.size()>0) {
		for(int j=0;j<tzlist.size();j++) {
			
			str1=str1+tzlist.get(j).getDormnum()+"#"+tzlist.get(j).getLc()+"#"+tzlist.get(j).getContent()+"#"+tzlist.get(j).getDate()+"#"+tzlist.get(j).getStatu()+"@";
			
		}
		str1=str1.substring(0, str1.length()-1);	
	}
	obj.put("tzlist", str1);str1="";
	
	
	response.getWriter().print(obj.toJSONString());
}
	
}
