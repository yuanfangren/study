package com.ren.study.mybatis.Mapper;

import java.util.List;

import com.ren.study.mybatis.pojo.Role;

/**
 * 角色mapper 
 * @author RYF
 *
 */
public interface RoleMapper {
	
	public int insertRole(Role role);
	
	public int deleteRole(Long id);
	
	public int updateRole(Role role);
	
	public Role getRole(Long id);
	
	public List<Role> findRoles(String roleName);
	
	public List<Role> findRoles2(String roleName);
	
	
	
}
