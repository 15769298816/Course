package com.course.entity;

import java.util.Date;

/**
 * 用户实体类
 * @author  hujuhui
 * @version 2018年6月5日 下午9:58:22
 */
public class User {
	private int user_id;
	private String user_name;
	private String password;
	private Date created_time;
	private Date update_time;
	//多对一关联
	private Role role;
	public User(int user_id, String user_name, String password, Date created_time, Date update_time, Role role) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.created_time = created_time;
		this.update_time = update_time;
		this.role = role;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
