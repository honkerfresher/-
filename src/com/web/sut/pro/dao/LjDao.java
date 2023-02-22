package com.web.sut.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.FpqsInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LjInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.LytzInfo;
import com.web.sut.pro.entify.LywzhzInfo;
import com.web.sut.pro.entify.QjtzInfo;
import com.web.sut.pro.entify.RoleInfo;
import com.web.sut.pro.entify.RoomInfo;
import com.web.sut.pro.entify.Roommate;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TslogInfo;

@Repository
public interface LjDao {

	
	//查室友
	List<StuInfo> xsxmcx(String xsxm);
	List<StuInfo> xsqscx(String xsqs);
	List<StuInfo> xsxhcx(String xsxh);
	List<StuInfo> xszycx(String xszy);
	List<StuInfo> xsqycx(String dormnum);
	List<RoomInfo> fjqcx(String dormnum);
	List<RoomInfo> fjfloorcx(RoomInfo room);
	List<Roommate> checkroommate(String rmname);
	List<QjtzInfo> qjtz(QjtzInfo qjtz);
	LjInfo UsertoLj(String account);
	void lj_copy(String sid);
	void qjtzgq(LjInfo ljinfo);
	List<WzhzInfo> lcwz(String dormnum);
	void wzpass(String sid);
	void wzfail(String sid);
	List<TslogInfo> tscl(String dormnum);
	void tspass(String sid);
	void tsfail(String sid);
	List<LslogInfo> lscl(String wnum);
	void lspass(String sid);
	void lsfail(String sid);
	List<BxlogInfo> bxcl(String wnum);
	void bxpass(String sid);
	void bxfail(String sid);
	void addwzlyhz(WzhzInfo wzhzinfo);
    WzhzInfo getlywz(LjInfo ljinfo);
    List<JylogInfo> jycl(String wnum);
    void jypass(String sid);
	void jyfail(String sid);
	void fp(FpqsInfo fpinfo);
	RoomInfo findRoomBysid(String sid);
	void fjrz(String rmname);
	void lssuccess(int lssid);
	void tsclstu(String snum);
	void tsclroom(String rmname);
	TslogInfo getTsBysid(int sid);
	void tscllog(int sid);
	
	List<LytzInfo> ljtz(LjInfo ljinfo);
	void addljtz(LytzInfo ljtz);
}
