/**
 * 
 */
package com.course.service;

import java.util.List;

import com.course.entity.Teacher;

/**
 * 
 * @author  hujuhui
 * @version 2018年5月24日 下午4:47:30
 */
public interface TeacherService {
	/**
	 * 查询教师信息
	 *  @return
	 */
	List<Teacher> getTeacherList();
	/**
	 * 根据教师编号查询信息
	 *  @param number
	 *  @return
	 */
	Teacher  getTeacherByNum(int number);
	/**
	 * 增加教师信息
	 *  @param teacher
	 *  @return
	 */
	boolean addTeacher(Teacher teacher);
	/**
	 * 更新教师信息
	 *  @param teacher
	 *  @return
	 */
	boolean updateTeacher(Teacher teacher);
	/**
	 * 删除教师信息
	 *  @param teaid
	 *  @return
	 */
	boolean deleteTeacherById(int teaid);
}
