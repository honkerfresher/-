package com.web.sut.pro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.sut.pro.dao.IUserDao;
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

@Service
public class StuService {
	@Resource
	StuDao dao;
	
	public List<StuInfo> selRoomMate(StuInfo stu) {
		// TODO Auto-generated method stub
		return dao.selRoomMate(stu);
	}
	
	public void addTslog(TslogInfo ts) {
		// TODO Auto-generated method stub
		      dao.addTslog(ts);
	}
	
	public void addLslog(LslogInfo ls) {
		// TODO Auto-generated method stub
		      dao.addLslog(ls);
	}
	
	public void addJylog(JylogInfo jy) {
		// TODO Auto-generated method stub
		      dao.addjylog(jy);
	}
	
	public void addWzlog(WzlogInfo wz) {
		// TODO Auto-generated method stub
		      dao.addwzlog(wz);
	}
	
	
	public void addBxlog(BxlogInfo bx) {
		// TODO Auto-generated method stub
		      dao.addbxlog(bx);
	}
	
	
	
	public List<TslogInfo> selTslist(StuInfo stu){
		// TODO Auto-generated method stub
		    return  dao.selTslist(stu);
	}
	
	public List<LslogInfo> selLslist(StuInfo stu){
		// TODO Auto-generated method stub
		    return  dao.selLslist(stu);
	}
	
	public List<WzlogInfo> selWzlist(StuInfo stu){
		// TODO Auto-generated method stub
		    return  dao.selWzlist(stu);
	}
	
	public List<JylogInfo> selJylist(StuInfo stu){
		// TODO Auto-generated method stub
		    return  dao.selJylist(stu);
	}
	
	public List<BxlogInfo> selBxlist(StuInfo stu){
		// TODO Auto-generated method stub
		    return  dao.selBxlist(stu);
	}
	
	public FdyInfo selFdy(StuInfo stu){
		// TODO Auto-generated method stub
		    return  dao.selFdy(stu);
	}
	
	public StuInfo findMe(String snum) {
		
		return dao.findMe(snum);
	}
	public List<WzlogInfo> selwzlclist(LcInfo lcm){
		// TODO Auto-generated method stub
		    return  dao.selwzlclist(lcm);
	}
	public List<BxlogInfo> selbxlclist(LcInfo lcm){
		// TODO Auto-generated method stub
		    return  dao.selbxlclist(lcm);
	}
	
	public String selrmname(String account) {
		
		
		return dao.selrmname(account);
	}
	
	public void wzlcpass(String sid) {
		// TODO Auto-generated method stub
		      dao.wzlcpass(sid);
	}
	public void wzlcfail(String sid) {
		// TODO Auto-generated method stub
		      dao.wzlcfail(sid);
	}
	public List<LytzInfo> lytz(LytzInfo lytz){
		// TODO Auto-generated method stub
		    return  dao.lytz(lytz);
	}
	public void lccopy(String sid) {
		// TODO Auto-generated method stub
		      dao.lccopy(sid);
	}
	
	public List<Wz> getwzname(){
		// TODO Auto-generated method stub
		    return  dao.getwzname();
	}
	
	public WzhzInfo getwzlcsum(LcInfo lcinfo){
		// TODO Auto-generated method stub
		    return  dao.getwzlcsum(lcinfo);
	}
	
	public void addwzlchz(WzhzInfo wzhzinfo) {
		// TODO Auto-generated method stub
		      dao.addwzlchz(wzhzinfo);
	}
	
	public void wzgq(LcInfo lcinfo) {
		// TODO Auto-generated method stub
		      dao.wzgq(lcinfo);
	}
	public void lytzgq(LcInfo lcinfo) {
		// TODO Auto-generated method stub
		      dao.lytzgq(lcinfo);
	}
	
	
	
}
