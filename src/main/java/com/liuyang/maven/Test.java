package com.liuyang.maven;

import org.eclipse.jdt.internal.compiler.batch.Main;

/****
 * 
 * @author 刘阳阳
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("abc");
		System.out.println("def");
		System.out.println("alalei");
	}
	
	public void dev(){
		System.out.println("this id dev");
	}
	
	public void dev2(){
		System.out.println("dev创建方法，但是在master提交");
		System.out.println("master提交");
		System.out.println("现在屎feature1添加");
		System.out.println("储存现场之后");
		System.out.println("在主分支上不commit或者add 能切换分支吗？");
	}
}
