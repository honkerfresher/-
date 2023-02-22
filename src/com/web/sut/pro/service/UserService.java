package com.web.sut.pro.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.sut.pro.dao.IUserDao;
import com.web.sut.pro.entify.StuInfo;
import com.web.sut.pro.entify.User;

@Service
public class UserService {
	
	@Resource
	IUserDao dao;
	
	//查询账号 变量为 rt的属性 account
	public User doAccountQuery(User rt) {
		return dao.selectUserByAccount(rt);
	}
	
	

	
	//查询所有用户信息
	public List<User> selAllUser() {
		// TODO Auto-generated method stub
		return dao.selectAllUser();
	}

	

	
	
	//添加用户
	public void addUser(User user) {
		// TODO Auto-generated method stub
		dao.addAccount(user);
	}


	//刪除用戶
	public void delUser(String id) {
		// TODO Auto-generated method stub
		dao.delAccount(id);
	}

	//更新用戶
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		dao.updatePersonal(user);
	}


	public User selectByAccount(String account) {
		// TODO Auto-generated method stub
		return dao.selectByAccount(account);
	}
	
	public User selectByKeyid(String keyid) {
		// TODO Auto-generated method stub
		return dao.selectByKeyid(keyid);
	}
	public User selectBySid(String sid) {
		// TODO Auto-generated method stub
		return dao.selectBySid(sid);
	}
	
	
	public StuInfo UsertoStu(User user) {
		// TODO Auto-generated method stub
		return dao.UsertoStu(user);
	}
	
	
	
}
