package com.web.sut.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjtzInfo;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.DoctorInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.FixInfo;
import com.web.sut.pro.entify.FixerInfo;
import com.web.sut.pro.entify.FpqsInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LjInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.LywzhzInfo;
import com.web.sut.pro.entify.QjInfo;
import com.web.sut.pro.entify.QjtzInfo;
import com.web.sut.pro.entify.RoleInfo;
import com.web.sut.pro.entify.RoomInfo;
import com.web.sut.pro.entify.Roommate;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TslogInfo;

@Repository
public interface QjDao {

	
	//查室友
	List<StuInfo> xsxmcx(String xsxm);
	List<StuInfo> xsqscx(String xsqs);
	List<StuInfo> xsxhcx(String xsxh);
	List<StuInfo> xszycx(String xszy);
	List<StuInfo> xsqycx(QjInfo qjinfo);
	List<StuInfo> xslycx(QjInfo qjinfo);
	List<RoomInfo> fjqcx(String area);
	List<RoomInfo> fjlycx(QjInfo qjinfo);//按楼宇查询,输入楼宇
	List<Roommate> checkroommate(String rmname);
	List<XjtzInfo> xjtz(XjtzInfo xjtz);
	QjInfo UsertoQj(String account);
	void qj_copy(String sid);
	void xjtzgq(QjInfo qjinfo);
	List<WzhzInfo> lywz(String area);
	void wzpass(String sid);
	void wzfail(String sid);
	List<BxlogInfo> bxcl(String area);
	void bxpass(String sid);
	void bxfail(String sid);
	void addwzqjhz(WzhzInfo wzhzinfo);
    WzhzInfo getqjwz(QjInfo qjinfo);
    List<JylogInfo> jycl(String area);
    void jypass(String sid);
	void jyfail(String sid);
	List<FixerInfo> bxy();
	BxlogInfo findBxinfoBysid(int sid);
	void addfixtz(FixInfo fixinfo);
	void bxtofixer(int sid);//状态修改为正在通知维修员
	List<DoctorInfo> doctor();
	
	List<QjtzInfo> qjtz(String area);
	void addqjtz(QjtzInfo qjinfo);
}
