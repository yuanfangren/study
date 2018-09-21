package com.ren.study.javabase.javastatic;

/**
 * static 静态代码块
 * @author ryf
 * 
 */
public class PersonStaticBlock {
	Book book1 = new Book("book1初始化");
	static Book book2;
	Book book3 = new Book("book3初始化");
	
	
	static {
		book2 = new Book("book2初始化");
		book4 = new Book("book4初始化");
	}
	static Book book4;
	public PersonStaticBlock(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		PersonStaticBlock block = new PersonStaticBlock("person 初始化");
		/**Output
		 * book2初始化
		 * book4初始化
		 * book1初始化
		 * book3初始化
		 * person 初始化
		 */
	}
	

}


class Book {
	public Book(String msg) {
		System.out.println(msg);
	}
}