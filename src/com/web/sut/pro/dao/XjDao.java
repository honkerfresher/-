package com.web.sut.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.WzhzInfo;
import com.web.sut.pro.entify.WzlogInfo;
import com.web.sut.pro.entify.XjInfo;
import com.web.sut.pro.entify.XjtzInfo;
import com.web.sut.pro.entify.BxhzInfo;
import com.web.sut.pro.entify.BxlogInfo;
import com.web.sut.pro.entify.FdyInfo;
import com.web.sut.pro.entify.JyhzInfo;
import com.web.sut.pro.entify.JylogInfo;
import com.web.sut.pro.entify.LslogInfo;
import com.web.sut.pro.entify.RoleInfo;
import com.web.sut.pro.entify.RoomInfo;
import com.web.sut.pro.entify.Roommate;
import com.web.sut.pro.entify.Shop;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.TshzInfo;
import com.web.sut.pro.entify.TslogInfo;

@Repository
public interface XjDao {

	
	//大数据展示
	//List<WzlogInfo> selwzlist(XjInfo xj);
	WzhzInfo wzhzchartYearData();
	WzhzInfo wzhzchartYearDataA();
	WzhzInfo wzhzchartYearDataB();
	WzhzInfo wzhzchartYearDataC();
	
	BxhzInfo bxhzchartYearData();
	
	JyhzInfo jyhzchartYearData();
	
	TshzInfo tshzchartYearData();
	//获取校级身份信息
	XjInfo UsertoXj(String account);

	
	
	//业务查询
	List<StuInfo> xsxmcx(String xsxm);
	List<StuInfo> xsqscx(String xsqs);
	List<StuInfo> xsxhcx(String xsxh);
	List<StuInfo> xszycx(String xszy);
	List<StuInfo> xslycx(String dormnum);
	List<StuInfo> xsqycx();	
	List<RoomInfo> fjqcx();
	List<RoomInfo> fjlycx(String dormnum);
	List<Roommate> checkroommate(String rmname);
	//学生/用户管理
	List<StuInfo> studata();
	void studelet(int snum);
	void stuupdate(StuInfo stu);
	StuInfo findstuBySid(int snum);
	 void stuadd(StuInfo stu);
	
	
	List<User> alluserdata();
	 void userdelet(String account);
	 void userupdate(User user);
	 User finduserByacc(String account);
	 void useradd(User user);
	 //物资处理
	List<WzhzInfo> wzsum();
	void wzfail(String sid);
	void wzpass(String sid);
	
	void assignconfirm(StuInfo stu);
	
	//楼层管理员任命
	StuInfo lcmanagerWarn(String dorm);
	//房间管理
	 List<RoomInfo> fjareaCdata();
	 List<RoomInfo> fjareaBdata();
	 List<RoomInfo> fjareaAdata();
	 
	 RoomInfo findroomBysid(int sid);
	 //校级物资处理
	 List<WzhzInfo> qjwzhzYear();
	 
	 List<Shop> getshop();
	 List<Shop> getoutter();
	 //通知下达
	 void addxjtz(XjtzInfo tz);
	 List<XjtzInfo> xjtz();
}
