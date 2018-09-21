package com.ren.study.javabase.javastatic;

/**
 * 正常使用成员变量
 * @author ryf
 *
 */
public class Person {
	String name;
	int age;
	
	//类的方法存储在方法区中
	public String toString() {
		return "name:"+name+" age:"+age;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age=11;
		p1.name="张三";
		
		Person p2 = new Person();
		p2.age=12;
		p2.name="李四";
		
		System.out.println(p1);
		System.out.println(p2);
		/** Output
		 * name:张三 age:11
		 * name:李四 age:12
		 */
		
	}
}
