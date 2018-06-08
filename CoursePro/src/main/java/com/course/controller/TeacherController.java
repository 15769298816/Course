package com.course.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.entity.Teacher;
import com.course.service.TeacherService;

/**
 * 
 * @author  hujuhui
 * @version 2018年5月24日 下午8:32:20
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	/**
	 * 查询全部教师信息
	 *  @return teacherList
	 */
	@RequestMapping(value="/listTeacher",method = RequestMethod.GET)
	public Map<String, Object> listTeacher(){
		Map<String,Object> modelMap = new HashMap<String , Object>();
		List<Teacher> teacherList = teacherService.getTeacherList();
		modelMap.put("teacherList", teacherList);
		return modelMap;
	}
	/**
	 * 根据教师的编号查询教师信息
	 *  @param number
	 *  @return
	 */
	@RequestMapping(value="/getTeacherByNum", method = RequestMethod.GET)
	public Map<String  , Object> getTeacherByNum(Integer number){
		System.out.println("number===="+number);
		Map<String,Object> modelMap = new HashMap<String , Object>();
		Teacher teacher = teacherService.getTeacherByNum(number);
		modelMap.put("teacher", teacher);
		return modelMap;
	}
	/**
	 * 添加教师信息
	 *  @param teacher
	 *  @return
	 */
	@RequestMapping(value="/addTeacher", method = RequestMethod.POST)
	public Map<String  , Object> addTeacher(@RequestBody Teacher teacher){
		System.out.println(teacher);
		Map<String,Object> modelMap = new HashMap<String , Object>();
		boolean flag = teacherService.addTeacher(teacher);
		modelMap.put("success", flag);
		return modelMap;
	}
	/**
	 * 更新教师信息
	 *  @param teacher
	 *  @return
	 */
	@RequestMapping(value="/updateTeacher",method = RequestMethod.POST)
	public Map<String  , Object> updateTeacher(@RequestBody Teacher teacher){
		Map<String,Object> modelMap = new HashMap<String , Object>();
		boolean flag  = teacherService.updateTeacher(teacher);
		modelMap.put("success", flag);
		return modelMap;
	}
	@RequestMapping(value="/removeTeacher" , method = RequestMethod.GET)
	public Map<String  , Object> removeTeacher(Integer teacherId){
		Map<String,Object> modelMap = new HashMap<String , Object>();
		boolean flag = teacherService.deleteTeacherById(teacherId);
		modelMap.put("success", flag);
		return modelMap;
	}
}
