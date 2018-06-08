package com.course.dao;

import java.awt.print.Book;

/**
 * 
 * @author  hujuhui
 * @version 2018年6月2日 下午5:46:14
 */
public class CodeDemo {
	public static void main(String[] args) {
		/*
		 * 1.设计一个Student类，有名字，年龄，性别等属性，
		 * 	定义构造方法来初始化类的这些属性，定义一个输出Student信息的方法。
		 * 2.字符串操作：
		 * 	(1) 将"GAOXINXUEYUAN JAVA"字符串中的JAVA替换为J2EE
		 * 	(2) 截取字符串"HELLO JAVA"中的LL
		 * 3. 声明一个图书类，其属性有书名、价格，静态属性为书册数目（属性全部进行封装），
		 * 	在构造方法中利用此静态属性为对象的编号赋值，求出数目的总册书。
		 * 4. 声明一个Student类，其属性有姓名，年龄，私有化其构造方法，	
		 * 	但要对属性进行赋值，并获取这些值。	
		 * */
		/*String str1 = "GAOXINXUEYUAN JAVA";
		String str2 = str1.replaceAll("JAVA", "J2EE");
		System.out.println(str2);*/
	
		//String str1 = "GAOXINXUEYUAN";
		//String str2 = str1.substring(3,6);
		//System.out.println(str2);
		//Student stu = Student.getInstance();
		//stu.setName("aa11");
		//System.out.println(stu.getName());
		
		//2．	定义数组int score[] ={52,33,61,46};进行从小到大的排序。
		//int scorse[] = {52,33,61,46};
		//int a = 9, b = 3; 
		//a *= b++;
		//System.out.println("a:"+a+",b:"+b);
		
		int x[ ][ ]=new int[4][7];
		System.out.println(x.length);
	}
}


/*class Student{
	private String name;
	private int age;
	private Student(){}
	private static Student stu = new Student();
	public static Student getInstance(){
		return stu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}*/



