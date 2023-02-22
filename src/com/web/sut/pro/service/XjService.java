package com.web.sut.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.sut.pro.dao.IUserDao;
import com.web.sut.pro.dao.LjDao;
import com.web.sut.pro.dao.QjDao;
import com.web.sut.pro.dao.StuDao;
import com.web.sut.pro.dao.XjDao;
import com.web.sut.pro.entify.BxhzInfo;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.DoctorInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.FixInfo;
import com.web.sut.pro.entify.FixerInfo;
import com.web.sut.pro.entify.FpqsInfo;
import com.web.sut.pro.entify.JyhzInfo;
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
import com.web.sut.pro.entify.Shop;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TshzInfo;
import com.web.sut.pro.entify.TslogInfo;
import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.Wz;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjInfo;
import com.web.sut.pro.entify.XjtzInfo;

@Service
public class XjService {
	@Resource
	XjDao dao;
	
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

	public List<StuInfo> xslycx(String dormnum) {
		// TODO Auto-generated method stub
		return dao.xslycx(dormnum);
	}
	public List<StuInfo> xsqycx() {
		// TODO Auto-generated method stub
		return dao.xsqycx();
	}
	public List<RoomInfo> fjqcx() {
		// TODO Auto-generated method stub
		return dao.fjqcx();
	}
	
	public List<RoomInfo> fjlycx(String dormnum) {
		// TODO Auto-generated method stub
		return dao.fjlycx(dormnum);
	}
	
	public List<Roommate> checkroommate(String rmname) {
		// TODO Auto-generated method stub
		return dao.checkroommate(rmname);
	}
	
	public XjInfo UsertoXj(String account) {
		// TODO Auto-generated method stub
		return dao.UsertoXj(account);
	}
	
	
	
	public List<WzhzInfo> wzsum() {
		// TODO Auto-generated method stub
		return dao.wzsum();
	}
	public void wzfail(String sid) {
		// TODO Auto-generated method stub
		dao.wzfail(sid);
	}
	public void wzpass(String sid) {
		// TODO Auto-generated method stub
	    dao.wzpass(sid);
	}
	
	public WzhzInfo wzhzchartYearData() {
		
		return dao.wzhzchartYearData();
	}
public WzhzInfo wzhzchartYearDataA() {
		
		return dao.wzhzchartYearDataA();
	}
public WzhzInfo wzhzchartYearDataB() {
	
	return dao.wzhzchartYearDataB();
}
public WzhzInfo wzhzchartYearDataC() {
	
	return dao.wzhzchartYearDataC();
}

public BxhzInfo bxhzchartYearData() {
	
	return dao.bxhzchartYearData();
}	
public JyhzInfo jyhzchartYearData() {
	
	return dao.jyhzchartYearData();
}	

public TshzInfo tshzchartYearData() {
	
	return dao.tshzchartYearData();
}

public List<StuInfo> studata() {
	
	return dao.studata();
}

public void studelet(int snum) {
	// TODO Auto-generated method stub
    dao.studelet(snum);
}
public void stuupdate(StuInfo stu) {
	// TODO Auto-generated method stub
    dao.stuupdate(stu);
}

public StuInfo findstuBySid(int snum) {
	// TODO Auto-generated method stub
   return dao.findstuBySid(snum);
}

public void assignconfirm(StuInfo stu) {
	// TODO Auto-generated method stub
    dao.assignconfirm(stu);
}

public StuInfo lcmanagerWarn(String dorm) {
	// TODO Auto-generated method stub
   return dao.lcmanagerWarn(dorm);
}

public List<RoomInfo> fjareaCdata() {
	// TODO Auto-generated method stub
   return dao.fjareaCdata();
}

public List<RoomInfo> fjareaBdata() {
	// TODO Auto-generated method stub
   return dao.fjareaBdata();
}

public RoomInfo findroomBysid(int sid) {
	// TODO Auto-generated method stub
   return dao.findroomBysid(sid);
}

public List<RoomInfo> fjareaAdata() {
	// TODO Auto-generated method stub
   return dao.fjareaAdata();
}

public List<WzhzInfo> qjwzhzYear() {
	// TODO Auto-generated method stub
   return dao.qjwzhzYear();
}

public List<Shop> getshop() {
	// TODO Auto-generated method stub
  return  dao.getshop();
}
public List<Shop> getoutter() {
	// TODO Auto-generated method stub
  return  dao.getoutter();
}

public List<User> alluserdata() {
	// TODO Auto-generated method stub
  return  dao.alluserdata();
}
public void userdelet(String account) {
	// TODO Auto-generated method stub
    dao.userdelet(account);
}
public void userupdate(User user) {
	// TODO Auto-generated method stub
    dao.userupdate(user);
}

public User finduserByacc(String account) {
	// TODO Auto-generated method stub
   return dao.finduserByacc(account);
}

public void useradd(User user) {
	// TODO Auto-generated method stub
    dao.useradd(user);
}
public void stuadd(StuInfo stu) {
	// TODO Auto-generated method stub
    dao.stuadd(stu);
}
public void addxjtz(XjtzInfo tz) {
	// TODO Auto-generated method stub
    dao.addxjtz(tz);
}
public List<XjtzInfo> xjtz() {
	// TODO Auto-generated method stub
  return  dao.xjtz();
}
}
