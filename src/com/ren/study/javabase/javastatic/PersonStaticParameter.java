/** 说明
 * static 修饰了 age属性后 age属性就统一由PersonStaticParameter类来管理了，任意一个对象修改了age属性，其他的对象的age值也随着变化
 * 共享static变量存储在方法区
 * 
 * static修饰的变量是所有实例对象共享的，一个实例对象修改了该变量，其他实例对象的该属性也变了。
 * 可以通过【类名.属性名】的方式直接调用。
 * static 修饰的类成员只会初始化一次
 */
package com.ren.study.javabase.javastatic;

/**
 * static关键字修饰属性
 * @author ryf
 *
 */
public class PersonStaticParameter {
	String name;
	static int age;
	
	public String toString() {//类的方法存储在方法区中
		return "name:"+name+" age:"+age;
	}
	
	public static void main(String[] args) {
		PersonStaticParameter p1 = new PersonStaticParameter();
		p1.age=11;
		p1.name="张三";
		
		PersonStaticParameter p2 = new PersonStaticParameter();
		p2.age=12;
		p2.name="李四";
		
		System.out.println(p1);
		System.out.println(p2);
		/** Output
		 * name:张三 age:12
		 * name:李四 age:12
		 */
		
		PersonStaticParameter.age=123;
		System.out.println(p1);
		System.out.println(p2);
		/** Output
		 * name:张三 age:123
		 * name:李四 age:123
		 */
		
	}
}
