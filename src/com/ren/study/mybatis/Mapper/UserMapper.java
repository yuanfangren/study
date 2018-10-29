package com.ren.study.mybatis.Mapper;

import com.ren.study.mybatis.pojo.User;

/**
 * 用户表的Mapper
 * @author RYF
 *
 */
public interface UserMapper {

	User getUser(Long id);

}
