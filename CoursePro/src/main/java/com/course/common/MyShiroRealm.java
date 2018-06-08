/**
 * 
 */
package com.course.common;

import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 自定定义Realm
 * Realm:当用户执行登陆和授权访问时，shiro会从应用配置的realm中查找用户及其权限信息。
 * @author  hujuhui
 * @version 2018年6月5日 下午5:00:17
 */
public class MyShiroRealm {
	//用户用户查询
//	@Autowired
//	private LoginService loginService;
	/*
	//角色权限和对应权限添加
	 @Override
	    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
	        //获取登录用户名
	        String name= (String) principalCollection.getPrimaryPrincipal();
	        //查询用户名称
	        User user = loginService.findByName(name);
	        //添加角色和权限
	        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
	        for (Role role:user.getRoles()) {
	            //添加角色
	            simpleAuthorizationInfo.addRole(role.getRoleName());
	            for (Permission permission:role.getPermissions()) {
	                //添加权限
	                simpleAuthorizationInfo.addStringPermission(permission.getPermission());
	            }
	        }
	        return simpleAuthorizationInfo;
	    }
	*/
	
}
