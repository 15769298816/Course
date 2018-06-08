/**
 * 
 */
package com.course.entity;

import java.util.Date;
import java.util.List;

/**
 * 角色实体类
 * @author  hujuhui
 * @version 2018年6月5日 下午10:01:23
 */
public class Role {
	private int role_id;
	private String role_name;
	private Date created_time;
	private Date update_time;
	//一对多个用户
	private List<User> users;
	//多对多
	private List<Permission> permission;
	public Role(int role_id, String role_name, Date created_time, Date update_time, List<User> users,
			List<Permission> permission) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.created_time = created_time;
		this.update_time = update_time;
		this.users = users;
		this.permission = permission;
	}
	public List<Permission> getPermission() {
		return permission;
	}
	public void setPermission(List<Permission> permission) {
		this.permission = permission;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
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
