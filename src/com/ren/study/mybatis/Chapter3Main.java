package com.ren.study.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.ren.study.mybatis.Mapper.RoleMapper;
import com.ren.study.mybatis.Mapper.UserMapper;
import com.ren.study.mybatis.pojo.Role;
import com.ren.study.mybatis.pojo.User;

public class Chapter3Main {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(Chapter3Main.class);
		SqlSession sqlSession = null;
		try{
			sqlSession = SqlSessionFactoryUtils.openSqlSession();
			//RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			//Role role = roleMapper.getRole(1L);
			//List<Role> role = roleMapper.findRoles2("roleN");
			//log.info(role.get(0).getRoleName());
			
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			User user = userMapper.getUser(1L);
			log.info(user.getSexEnum().getName());
		}finally{
			if(sqlSession != null){
				sqlSession.close();
			}
		}
	}

}
