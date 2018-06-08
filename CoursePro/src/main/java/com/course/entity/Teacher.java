/**
 * 
 */
package com.course.entity;

import java.util.Date;

/**
 * 
 * @author  hujuhui
 * @version 2018年5月23日 下午4:52:34
 */
public class Teacher {
	//主键ID
	private Integer teaId;
	//教师编号
	private Integer teaNum;
	//教师姓名
	private String teaName;
	//创建时间
	private Date createTime;
	//更新时间
	private Date lastEditTime;
	
	public Integer getTeaId() {
		return teaId;
	}
	public void setTeaId(Integer teaId) {
		this.teaId = teaId;
	}
	public Integer getTeaNum() {
		return teaNum;
	}
	public void setTeaNum(Integer teaNum) {
		this.teaNum = teaNum;
	}
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	
	@Override
	public String toString() {
		return "Teacher [teaId=" + teaId + ", teaNumber=" + teaNum + ", teaName=" + teaName + ", createTime="
				+ createTime + ", lastEdit=" + lastEditTime + "]";
	}
}
