package com.web.sut.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.sut.pro.dao.IUserDao;
import com.web.sut.pro.dao.LjDao;
import com.web.sut.pro.dao.QjDao;
import com.web.sut.pro.dao.StuDao;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.DoctorInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.FixInfo;
import com.web.sut.pro.entify.FixerInfo;
import com.web.sut.pro.entify.FpqsInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LcInfo;
import com.web.sut.pro.entify.LjInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.LytzInfo;
import com.web.sut.pro.entify.LywzhzInfo;
import com.web.sut.pro.entify.QjInfo;
import com.web.sut.pro.entify.QjtzInfo;
import com.web.sut.pro.entify.RoomInfo;
import com.web.sut.pro.entify.Roommate;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TslogInfo;
import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.Wz;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjtzInfo;

@Service
public class QjService {
	@Resource
	QjDao dao;
	
	public List<StuInfo> xsxmcx(String xsxm) {
		// TODO Auto-generated method stub
		return dao.xsxmcx(xsxm);
	}
	public List<StuInfo> xsqscx(String xsqs) {
		// TODO Auto-generated method stub
		return dao.xsqscx(xsqs);
	}
	public List<StuInfo> xsxhcx(String xsxh) {
		// TODO Auto-generated method stub
		return dao.xsxhcx(xsxh);
	}
	public List<StuInfo> xszycx(String xszy) {
		// TODO Auto-generated method stub
		return dao.xszycx(xszy);
	}

	public List<StuInfo> xslycx(QjInfo qjinfo) {
		// TODO Auto-generated method stub
		return dao.xslycx(qjinfo);
	}
	public List<StuInfo> xsqycx(QjInfo qjinfo) {
		// TODO Auto-generated method stub
		return dao.xsqycx(qjinfo);
	}
	public List<RoomInfo> fjqcx(String area) {
		// TODO Auto-generated method stub
		return dao.fjqcx(area);
	}
	
	public List<RoomInfo> fjlycx(QjInfo qjinfo) {
		// TODO Auto-generated method stub
		return dao.fjlycx(qjinfo);
	}
	
	public List<Roommate> checkroommate(String rmname) {
		// TODO Auto-generated method stub
		return dao.checkroommate(rmname);
	}
	public List<XjtzInfo> xjtz(XjtzInfo xjtz) {//区级获取校级通知
		// TODO Auto-generated method stub
		return dao.xjtz(xjtz);
	}
	/*public void addTslog(TslogInfo ts) {
		// TODO Auto-generated method stub
		      dao.addTslog(ts);
	}*/
	public QjInfo UsertoQj(String account) {
		// TODO Auto-generated method stub
		return dao.UsertoQj(account);
	}
	
	public void qj_copy(String sid) {
		// TODO Auto-generated method stub
		 dao.qj_copy(sid);
	}
	public void xjtzgq(QjInfo Qjinfo) {//区级接受的校级通知
		// TODO Auto-generated method stub
		 dao.xjtzgq(Qjinfo);
	}
	public List<WzhzInfo> lywz(String area) {
		// TODO Auto-generated method stub
		return dao.lywz(area);
	}
	public void wzfail(String sid) {
		// TODO Auto-generated method stub
		dao.wzfail(sid);
	}
	public void wzpass(String sid) {
		// TODO Auto-generated method stub
	    dao.wzpass(sid);
	}
	
	public List<BxlogInfo> bxcl(String area) {
		// TODO Auto-generated method stub
		return dao.bxcl(area);
	}
	public void bxfail(String sid) {
		// TODO Auto-generated method stub
		dao.bxfail(sid);
	}
	public void bxpass(String sid) {
		// TODO Auto-generated method stub
	    dao.bxpass(sid);
	}
	public void addwzqjhz(WzhzInfo wzhzinfo) {
		// TODO Auto-generated method stub
	    dao.addwzqjhz(wzhzinfo);
	}
	public WzhzInfo getqjwz(QjInfo qjinfo) {
		// TODO Auto-generated method stub
	    return dao.getqjwz(qjinfo);
	}
	public List<JylogInfo> jycl(String area) {
		// TODO Auto-generated method stub
		return dao.jycl(area);
	}
	public void jyfail(String sid) {
		// TODO Auto-generated method stub
		dao.jyfail(sid);
	}
	public void jypass(String sid) {
		// TODO Auto-generated method stub
	    dao.jypass(sid);
	}
	public List<FixerInfo> bxy() {
		// TODO Auto-generated method stub
		return dao.bxy();
	}
	public BxlogInfo findBxinfoBysid(int sid) {
		// TODO Auto-generated method stub
		return dao.findBxinfoBysid(sid);
	}
	public void addfixtz(FixInfo fixinfo) {
		// TODO Auto-generated method stub
	    dao.addfixtz(fixinfo);
	}
	public void bxtofixer(int sid) {
		// TODO Auto-generated method stub
	    dao.bxtofixer(sid);
	}
	public List<DoctorInfo> doctor() {
		// TODO Auto-generated method stub
		return dao.doctor();
	}
	public List<QjtzInfo> qjtz(String area) {
		// TODO Auto-generated method stub
		return dao.qjtz(area);
	}
	public void addqjtz(QjtzInfo qjinfo) {
		// TODO Auto-generated method stub
	    dao.addqjtz(qjinfo);
	}
}
