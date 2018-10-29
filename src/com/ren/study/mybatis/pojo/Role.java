package com.ren.study.mybatis.pojo;

/**
 * 角色实体类
 * @author RYF
 *
 */
public class Role {
	
	/**
	 * ID
	 */
	private Long id;
	
	/**
	 * 角色名
	 */
	private String roleName;
	
	/**
	 * 角色注释
	 */
	private String note;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	
}
