package com.web.sut.pro.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.web.sut.pro.dao.StuDao;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.FdyInfo;

import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LcInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.LytzInfo;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TslogInfo;
import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.Wz;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.service.UserService;
import com.web.sut.pro.service.StuService;

@Controller
@SessionAttributes({"RT","FUN","CY"})
public class Stucontroller {

	@Resource
	StuService stu;
	 
	TslogInfo tss=new TslogInfo();
	
	LslogInfo lss=new LslogInfo();
	
	JylogInfo jys=new JylogInfo();
	
	WzlogInfo wzs=new WzlogInfo();
	
	BxlogInfo bxs=new BxlogInfo();
	
	String Snum;
	
    String dormnum ;
	
	String lc ;
	@RequestMapping(value="/stu_log")
	public String stulog(ModelMap map) {
	
	StuInfo me = stu.findMe(Snum);
	List<StuInfo> rmmates = stu.selRoomMate(me);
	FdyInfo fdy = stu.selFdy(me);
	map.put("rmmates", rmmates);
	map.put("fdy", fdy);
	List<TslogInfo> ts = stu.selTslist(me);
	List<LslogInfo> ls = stu.selLslist(me);
	List<WzlogInfo> wz = stu.selWzlist(me);
	List<JylogInfo> jy = stu.selJylist(me);
	List<BxlogInfo> bx = stu.selBxlist(me);
	map.put("tslist",ts);
	map.put("lslist",ls);
	map.put("wzlist",wz);
	map.put("jylist",jy);
	map.put("bxlist",bx);
	
	System.out.println(tss.date);
	return "stu_main";
}
	@RequestMapping(value="/tssubmit")
	public String tssubmit(@RequestParam String snum,@RequestParam String rmname,@RequestParam String lywnum,@RequestParam String date,@RequestParam String reason){//获取多个值后，传给后台保存entify
		tss.setSnum(snum);
		tss.setRmname(rmname);
		tss.setLywnum(lywnum);
		tss.setDate(date);
		tss.setReason(reason);
		String rm=rmname;
		tss.setDormnum(rm.substring(0,2));
		Snum=snum;
		stu.addTslog(tss);
		return "redirect:stu_log.html";}
	
		
	

	@RequestMapping(value="/lssubmit")
	public String lssubmit(@RequestParam String snum,@RequestParam String lywnum,@RequestParam String date,@RequestParam String reason,@RequestParam String enddate,ModelMap map){//获取多个值后，传给后台保存entify
		lss.setSnum(snum);
		lss.setLywnum(lywnum);
		lss.setDate(date);
		lss.setReason(reason);
		lss.setEnddate(enddate);
		Snum=snum;
		stu.addLslog(lss);
		
		
		return "redirect:stu_log.html";
	}
	
	
	
	@RequestMapping(value="/jysubmit")
	public String jysubmit(@RequestParam String snum,@RequestParam String rmname,@RequestParam String content,@RequestParam String date,ModelMap map){//获取多个值后，传给后台保存entify
		jys.setSnum(snum);
		jys.setRmname(rmname);
		String rm=rmname;
		jys.setDormnum(rm.substring(0,2));
		jys.setContent(content);
		jys.setDate(date);
		stu.addJylog(jys);
		Snum=snum;
        
		return "redirect:stu_log.html";
	}
	
	@RequestMapping(value="/wzsubmit")
	public String wzsubmit(@RequestParam String snum,@RequestParam String rmname,@RequestParam String content,@RequestParam String date,@RequestParam String amount){//获取多个值后，传给后台保存entify
		
		wzs.setSnum(snum);
		wzs.setRmname(rmname);
		wzs.setContent(content);
		wzs.setDate(date);
		wzs.setAmount(amount);
		String rm=rmname;
		wzs.setDormnum(rm.substring(0,2));
		wzs.setLc(rm.substring(3,4));
		stu.addWzlog(wzs);
		Snum=snum;
		
		
	
		System.out.println(wzs.date);
		return "redirect:stu_log.html";
	}
	
	/*@RequestMapping(value="/stu_bxsubmit")
	public String BxGo(ModelMap map){//获取多个值后，传给后台保存entify
		
		List<FixwhatInfo> fixlist = stu.findFixwhat();
		map.put("fixwhat",fixlist);
		return "redirect:stu_fixsubmit.jsp";
	}*///维修条目列表c：foreach标签失效或数据问题
	
	
	@RequestMapping(value="/bxsubmit")
	public String bxsubmit(@RequestParam String snum,@RequestParam String rmname,@RequestParam String date,@RequestParam String content,ModelMap map){//获取多个值后，传给后台保存entify
		bxs.setSnum(snum);
		bxs.setRmname(rmname);
		bxs.setContent(content);
		String rm = rmname;
		bxs.setDormnum(rmname.substring(0,2));
		bxs.setLc(rm.substring(3,4));
		bxs.setDate(date);
		stu.addBxlog(bxs);
		Snum=snum;
     	return "redirect:stu_log.html";
	}
	/*@RequestMapping(value="/stu_lclog")
	public String lclog(ModelMap map){//获取多个值后，传给后台保存entify

		List<JylogInfo> jy = stu.selwzlclist(me);
		List<BxlogInfo> bx = stu.selbxlclist(me);
		
		map.put("jylist",jy);
		map.put("bxlist",bx);
		
		
		return "LcInfo";
	}*/
	
	
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
	
	@RequestMapping(value="/stu_lclog",method=RequestMethod.GET)
	@ResponseBody
	public void lclog(@RequestParam String account) {
	
	String rmname = stu.selrmname(account);
	
	System.out.println(rmname);
	dormnum = rmname.substring(0,2);
	
	lc = rmname.substring(3,4);
	
}
	
	@RequestMapping(value="/stu_lclogtz")
	public String lclog(ModelMap map) {
		System.out.println(lc);
		LcInfo lcm = new LcInfo();
		lcm.setLc(lc);
		lcm.setDormnum(dormnum);
		
	List<WzlogInfo> wz = stu.selwzlclist(lcm);

	List<BxlogInfo> bx = stu.selbxlclist(lcm);

	
	
	map.put("wzlist",wz);

	map.put("bxlist",bx);
	
	
	return "stu_lclog";
}


	@RequestMapping(value="/wzlcpass",method=RequestMethod.GET)
	@ResponseBody
	public void wzlcpass(@RequestParam String sid) {
	
	stu.wzlcpass(sid);
	
	
}
	@RequestMapping(value="/wzlcfail",method=RequestMethod.GET)
	@ResponseBody
	public void wzlcfail(@RequestParam String sid) {
	
	stu.wzlcfail(sid);
	
	
}
	@RequestMapping(value="/lccopy",method=RequestMethod.GET)
	@ResponseBody
	public void lccopy(@RequestParam String sid) {
	
	stu.lccopy(sid);
	
	
}
	
	@RequestMapping(value="/stu_wzsubmit")
	public String wzsubmit(ModelMap map) {
		
	List<Wz> wzlist = stu.getwzname();
	map.put("wzlist",wzlist);
	
	
	return "stu_wzsubmit";
}
	
	@RequestMapping(value="/wzlchz")
	@ResponseBody
	public void wzlchz(@RequestParam String account) {
		
	StuInfo stuinfo = stu.findMe(account);
	LcInfo lcinfo = new LcInfo();
	lcinfo.setDormnum(stuinfo.getRmname().substring(0,2));
	lcinfo.setLc(stuinfo.getRmname().substring(3,4));
	
	WzhzInfo wzhzinfo = stu.getwzlcsum(lcinfo);
	System.out.println(wzhzinfo.wz1);
	SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
	wzhzinfo.setDate(dt.format(new Date()));
    stu.addwzlchz(wzhzinfo);
    
}
	
}
