package com.web.sut.pro.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.sut.pro.entify.User;
import com.web.sut.pro.entify.RoleInfo;
import com.web.sut.pro.entify.StuInfo;

@Repository
public interface IUserDao {
	//查询User_info_tab数据表，查询账号
	User selectUserByAccount(User rt);
	
	//根据账号查询用户
	User selectByAccount(String account);
	
	//根据keyid查询用户
	User selectByKeyid(String keyid);
	
	User selectBySid(String sid);
	
	//插入User_info_tab数据表
	void insertUserInfo(User rt);
	//查询User_info_tab数据表
	User queryUserByKeyid(User rt);
	//查询User_info_tab数据表根据keyid查询所有用户
	List<User> selAllAccList(User rt);
	//查询role_info_tab数据表
	List<RoleInfo> selAllRoleList();
	//添加用户角色
	void addAccount(User addrt);
	//删除用户角色
	void delAccount(String keyid);
	
	User selPersonal(String keyid);

	void updatePersonal(User uppersonrt);
	
	//查询所有用户信息
	List<User> selectAllUser();
	
	//查室友

	StuInfo UsertoStu(User user);
}
