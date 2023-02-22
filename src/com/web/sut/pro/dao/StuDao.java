package com.web.sut.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.Wz;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LcInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.LytzInfo;
import com.web.sut.pro.entify.RoleInfo;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TslogInfo;

@Repository
public interface StuDao {

	
	//查室友
	List<StuInfo> selRoomMate(StuInfo stu);
	
	void addTslog(TslogInfo ts);
	
	void deletTslog(int sid);
	

    void addLslog(LslogInfo ls);
	
	void deletLslog(int sid);
	
	
    void addjylog(JylogInfo jy);
	
	void deletjslog(int sid);
	
	
    void addwzlog(WzlogInfo wz);
	
	void deletwzlog(int sid);
	
	
    void addbxlog(BxlogInfo bx);
	
	void deletBxlog(int sid);
	
	
	
	List<TslogInfo> selTslist(StuInfo stu);
	
	List<LslogInfo> selLslist(StuInfo stu);
	
	List<WzlogInfo> selWzlist(StuInfo stu);
	
	List<JylogInfo> selJylist(StuInfo stu);
	
	List<BxlogInfo> selBxlist(StuInfo stu);
	
	FdyInfo selFdy(StuInfo stu);
	
	StuInfo findMe(String snum);
	
	List<WzlogInfo> selwzlclist(LcInfo lcm);
	
	List<BxlogInfo> selbxlclist(LcInfo lcm);
	
	String selrmname(String account);
	
	void wzlcpass(String sid);
	
	void wzlcfail(String sid);
	
	List<LytzInfo> lytz(LytzInfo lytz);
	
	void lccopy(String sid);
	
	List<Wz> getwzname();
	
	WzhzInfo getwzlcsum(LcInfo lcinfo);
	
	void addwzlchz(WzhzInfo wzhz);
	
	void wzgq(LcInfo lcinfo);
	
	void lytzgq(LcInfo lcinfo);
}
