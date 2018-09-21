/** 说明
 * static 修饰方法也可以通过【类名.方法名】的方式调用。
 * static 方法无法调用非static的成员变量和方法，因为static方法是属于类的，如果直接使用非static变量，不知道是哪个实例对象的变量
 * 
 * 构造器应该不是静态方法，因为构造器中可以使用this，而静态方法是属于类的
 */
package com.ren.study.javabase.javastatic;

/**
 * static 修饰方法
 * @author ryf
 * 
 */
public class PersonStaticMethod {
	
	public static void print() {
		System.out.println("hello static method");
	}

	public static void main(String[] args) {
		PersonStaticMethod.print();
		/** Output
		 * hello static method
		 */
	}

}
