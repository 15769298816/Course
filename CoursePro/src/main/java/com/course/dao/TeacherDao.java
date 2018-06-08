/**
 * 
 */
package com.course.dao;

import java.util.List;

import com.course.entity.Teacher;

/**
 * 
 * @author  hujuhui
 * @version 2018年5月23日 下午6:08:37
 */
public interface TeacherDao {
	/**
	 * 查询所有教师的信息
	 *  @return
	 */
	List<Teacher> selectAllTeacher();
	/**
	 * 根据教师编号查询教师的信息
	 *  @param teaNumber
	 *  @return
	 */
	Teacher selectTeacherByNumber(int teaNumber);
	/**
	 * 插入教师的信息
	 *  @param teacher
	 *  @return
	 */
	int insertTeacher(Teacher teacher);
	/**
	 * 更新教师的信息
	 *  @param teacher
	 *  @return
	 */
	int updataTeacher(Teacher teacher);
	/**
	 * 删除教师信息
	 *  @param teacherId
	 *  @return
	 */
	int deleteTeacher(int teacherId);
}
