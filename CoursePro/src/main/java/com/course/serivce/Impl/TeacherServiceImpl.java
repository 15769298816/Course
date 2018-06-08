package com.course.serivce.Impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.dao.TeacherDao;
import com.course.entity.Teacher;
import com.course.service.TeacherService;

/**
 * 
 * @author  hujuhui
 * @version 2018年5月24日 下午4:53:00
 */
@Service
public class TeacherServiceImpl implements TeacherService {

	private  static final Logger log = Logger.getLogger(TeacherServiceImpl.class);
	
	@Autowired
	private TeacherDao teacherDao;
	
	/**
	 * 获取全部教师信息
	 */
	public List<Teacher> getTeacherList() {
		return teacherDao.selectAllTeacher();
	}

	/**
	 * 根据教师编号查询信息
	 */
	public Teacher getTeacherByNum(int number) {
		log.info("根据教师编号查询的编号为："+number);
		return teacherDao.selectTeacherByNumber(number);
	}
	/**
	 * 添加教师信息
	 */
	@Transactional
	public boolean addTeacher(Teacher teacher) {
		//控制判断，主要判断name是否为空
		log.info("teacher.getTeaName()="+teacher.getTeaName());
		if(teacher.getTeaName() != null && !"".equals(teacher.getTeaName())){
			teacher.setCreateTime(new Date());
			teacher.setLastEditTime(new Date());
			log.info("addTeacher="+teacher);
			try {
				int insertResult = teacherDao.insertTeacher(teacher);
				if(insertResult > 0){
					return true;
				}else {
					throw new RuntimeException("添加教师信息失败");
				}
			} catch (Exception e) {
				throw new RuntimeException("添加教师信息失败");
			}
		}else {
			throw new RuntimeException("添加教师信息失败");
		}
	}
	/**
	 * 更新教师信息
	 */
	@Transactional
	public boolean updateTeacher(Teacher teacher) {
		//判断id是否为空值
		if(teacher.getTeaId() != null && teacher.getTeaId() > 0){
			teacher.setLastEditTime(new Date());
			log.info("updateTeacher="+teacher);
			try {
				int updataResult = teacherDao.updataTeacher(teacher);
				if(updataResult > 0){
					return true;
				}else {
					throw new RuntimeException("更新教师信息失败");
				}
			} catch (Exception e) {
				throw new RuntimeException("更新教师信息失败");
			}
		}else {
			throw new RuntimeException("更新教师信息失败");
		}
	}
	/**
	 * 删除教师信息
	 */
	@Transactional
	public boolean deleteTeacherById(int teaid) {
		if(teaid > 0){
			int deleteResult;
			try {
				deleteResult = teacherDao.deleteTeacher(teaid);
				if(deleteResult > 0){
					return true;
				}else {
					throw new RuntimeException("删除教师信息失败");
				}
			} catch (Exception e) {
				throw new RuntimeException("删除教师信息失败");
			}
		}else {
			throw new RuntimeException("删除教师信息失败");
		}	
	}

}
