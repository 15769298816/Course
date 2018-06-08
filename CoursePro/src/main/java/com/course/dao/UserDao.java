/**
 * 
 */
package com.course.dao;

import java.util.List;

import com.course.entity.User;

/**
 * 用户DAO
 * @author  hujuhui
 * @version 2018年6月7日 下午10:08:34
 */
public interface UserDao {
	/**
	 * 查询所有用户的信息和权限
	 *  @return
	 */
	public List<User> listAllUser();
	
}
