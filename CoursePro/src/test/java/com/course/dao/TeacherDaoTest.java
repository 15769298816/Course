/**
 * 
 */
package com.course.dao;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.course.entity.Teacher;

/**
 * 
 * @author  hujuhui
 * @version 2018年5月23日 下午6:25:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherDaoTest {

	@Autowired
	private TeacherDao teacherDao;
	
	private static final Logger log = Logger.getLogger(TeacherDaoTest.class);
	
	@Test
	public void selectAllTeacher(){
		
		List<Teacher> allTeacher = teacherDao.selectAllTeacher();
		log.info("成功！！！！！！！");
		System.out.println(allTeacher.get(0)+"!!!!!!");
	}
	
	@Test
	@Ignore
	public void selectByNum(){
		Teacher teacherByNumber = teacherDao.selectTeacherByNumber(123413);
		log.info("成功！！！！！！！");
		System.out.println(teacherByNumber);
	}
	@Test
	@Ignore
	public void insertTeacher(){
		Teacher teacher = new Teacher();
		teacher.setTeaNum(123413);
		teacher.setTeaName("李四");
		log.info("成功！！！！！！！");
		int insertTeacher = teacherDao.insertTeacher(teacher);
		System.out.println("insertTeacher==="+insertTeacher);
	}
	
	@Test
	@Ignore
	public void update(){
		Teacher teacher = new Teacher();
		teacher.setTeaId(1);
		teacher.setTeaNum(111111);
		teacher.setTeaName("张三");
		int updataTeacher = teacherDao.updataTeacher(teacher);
		System.out.println("updataTeacher="+updataTeacher);
	}
}
