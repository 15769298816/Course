/**
 * 
 */
package com.course.entity;

import java.util.Date;
import java.util.List;

/**
 * 权限实体类
 * @author  hujuhui
 * @version 2018年6月5日 下午10:04:01
 */
public class Permission {
	private int permission_id;
	private String permission_name;
	private Date created_time;
	private Date update_time;
	//多对多
	private List<Role> roles;
	
	public Permission(int permission_id, String permission_name, Date created_time, Date update_time,
			List<Role> roles) {
		super();
		this.permission_id = permission_id;
		this.permission_name = permission_name;
		this.created_time = created_time;
		this.update_time = update_time;
		this.roles = roles;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public int getPermission_id() {
		return permission_id;
	}
	public void setPermission_id(int permission_id) {
		this.permission_id = permission_id;
	}
	public String getPermission_name() {
		return permission_name;
	}
	public void setPermission_name(String permission_name) {
		this.permission_name = permission_name;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
}
