package com.web.sut.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.sut.pro.dao.IUserDao;
import com.web.sut.pro.dao.LjDao;
import com.web.sut.pro.dao.StuDao;
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
import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.Wz;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;

@Service
public class LjService {
	@Resource
	LjDao dao;
	
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
	public List<StuInfo> xsqycx(String dormnum) {
		// TODO Auto-generated method stub
		return dao.xsqycx(dormnum);
	}
	public List<RoomInfo> fjqcx(String dormnum) {
		// TODO Auto-generated method stub
		return dao.fjqcx(dormnum);
	}
	public List<RoomInfo> fjfloorcx(RoomInfo room) {
		// TODO Auto-generated method stub
		return dao.fjfloorcx(room);
	}
	public List<Roommate> checkroommate(String rmname) {
		// TODO Auto-generated method stub
		return dao.checkroommate(rmname);
	}
	public List<QjtzInfo> qjtz(QjtzInfo qjtz) {
		// TODO Auto-generated method stub
		return dao.qjtz(qjtz);
	}
	/*public void addTslog(TslogInfo ts) {
		// TODO Auto-generated method stub
		      dao.addTslog(ts);
	}*/
	public LjInfo UsertoLj(String account) {
		// TODO Auto-generated method stub
		return dao.UsertoLj(account);
	}
	
	public void lj_copy(String sid) {
		// TODO Auto-generated method stub
		 dao.lj_copy(sid);
	}
	public void qjtzgq(LjInfo ljinfo) {
		// TODO Auto-generated method stub
		 dao.qjtzgq(ljinfo);
	}
	public List<WzhzInfo> lcwz(String dormnum) {
		// TODO Auto-generated method stub
		return dao.lcwz(dormnum);
	}
	public void wzfail(String sid) {
		// TODO Auto-generated method stub
		dao.wzfail(sid);
	}
	public void wzpass(String sid) {
		// TODO Auto-generated method stub
	    dao.wzpass(sid);
	}
	public List<LslogInfo> lscl(String wnum) {
		// TODO Auto-generated method stub
		return dao.lscl(wnum);
	}
	public void lsfail(String sid) {
		// TODO Auto-generated method stub
		dao.lsfail(sid);
	}
	public void lspass(String sid) {
		// TODO Auto-generated method stub
	    dao.lspass(sid);
	}
	public List<TslogInfo> tscl(String dormnum) {
		// TODO Auto-generated method stub
		return dao.tscl(dormnum);
	}
	public void tsfail(String sid) {
		// TODO Auto-generated method stub
		dao.tsfail(sid);
	}
	public void tspass(String sid) {
		// TODO Auto-generated method stub
	    dao.tspass(sid);
	}
	public List<BxlogInfo> bxcl(String wnum) {
		// TODO Auto-generated method stub
		return dao.bxcl(wnum);
	}
	public void bxfail(String sid) {
		// TODO Auto-generated method stub
		dao.bxfail(sid);
	}
	public void bxpass(String sid) {
		// TODO Auto-generated method stub
	    dao.bxpass(sid);
	}
	public void addwzlyhz(WzhzInfo wzhzinfo) {
		// TODO Auto-generated method stub
	    dao.addwzlyhz(wzhzinfo);
	}
	public WzhzInfo getlywz(LjInfo ljinfo) {
		// TODO Auto-generated method stub
	    return dao.getlywz(ljinfo);
	}
	public List<JylogInfo> jycl(String wnum) {
		// TODO Auto-generated method stub
		return dao.jycl(wnum);
	}
	public void jyfail(String sid) {
		// TODO Auto-generated method stub
		dao.jyfail(sid);
	}
	public void jypass(String sid) {
		// TODO Auto-generated method stub
	    dao.jypass(sid);
	}
	public void fp(FpqsInfo fpinfo) {
		// TODO Auto-generated method stub
	    dao.fp(fpinfo);
	}
	
	public RoomInfo findRoomBysid(String sid) {
		// TODO Auto-generated method stub
	    return dao.findRoomBysid(sid);
	}
	public void fjrz(String rmname) {
		// TODO Auto-generated method stub
	    dao.fjrz(rmname);
	}
	public void lssuccess(int lssid) {
		// TODO Auto-generated method stub
	    dao.lssuccess(lssid);
	}
	public void tsclstu(String snum) {
		// TODO Auto-generated method stub
	    dao.tsclstu(snum);
	}
	public void tsclroom(String rmname) {
		// TODO Auto-generated method stub
	    dao.tsclroom(rmname);
	}

	public TslogInfo getTsBysid(int sid) {
		// TODO Auto-generated method stub
	    return dao.getTsBysid(sid);
	}
	public void tscllog(int sid) {
		// TODO Auto-generated method stub
	    dao.tscllog(sid);
	}
	public List<LytzInfo> ljtz(LjInfo ljinfo) {
		// TODO Auto-generated method stub
		return dao.ljtz(ljinfo);
	}
	public void addljtz(LytzInfo ljtz) {
		// TODO Auto-generated method stub
	    dao.addljtz(ljtz);
	}
}
