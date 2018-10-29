/**
 * 简单理解单例就是任何时刻，一个类只有一个实例。
 * 确保一个类只有一个实例的话，就是外部不能通过随意通过new方式创建对象，因此私有化构造方法
 * 私有化构造方法后， 外部不能创建，只能内部创建了。static就解决了这个问题
 */
package com.ren.study.javabase.javastatic;

/**
 * 单例
 * @author RYF
 *
 */
public class Singleton {
	
	/**
	 * 私有的属性 只初始化一次（单线程下）
	 * 私有的构造方法，
	 * 公有的静态方法返回类实例
	 */
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	public static Singleton getInstance() {
		return singleton;
	}
	
}
