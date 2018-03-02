/**
 * 牛客网第三题——学生类
 */
package com.finersoft.nowcoder;

/**
 * 名称：学生类 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Student {
	/** 定义最长寿命为200岁 */
	public final int MAXAGE= 200;

	/** * 姓名 */
	private String name;
	/** * 年龄 */
	private int age;

	/** * @return the name */
	public String getName() {
		return name;
	}

	/** * @param name * the name to set to a student */
	public void setName(String name) {
		if (name != null && name != "") {
			this.name = name;
		} else {
			System.out.println("姓名不能为空");
		}
	}

	/** * @return the age */
	public int getAge() {
		return age;
	}

	/** * @param age the age to set to a student */
	public void setAge(int age) {
		if (age >= 0 && age <= MAXAGE) {
			this.age = age;
		} else {
			System.out.println("请输入一个正常现代人的年龄");
		}
	}

	/**
	 * 默认构造函数
	 */
	public Student() {
		this("张三", 18);
	}

	/**
	 * 带一参数的构造函数
	 * 
	 * @param name
	 *            学生姓名
	 */
	public Student(String name) {
		this(name, 18);
	}

	/**
	 * 完整参数构造函数
	 * 
	 * @param name
	 *            学生姓名
	 * @param age
	 *            学生年龄
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * 打印学生信息
	 */
	public void show() {
		System.out.println(this.toString());
	}

	/**
	 * 转换成字符串操作
	 */
	@Override
	public String toString() {
		return "学生信息：\r\n\t姓名：" + this.getName ()+ "\r\n\t年龄：" + this.getAge();

	}
	
	public static void main(String[] args) {
		//无参构造函数
		Student stu1= new Student();
		stu1.show();
		//一参构造函数
		stu1=new Student("牛牛");
		stu1.show();
		//两参构造函数
		stu1=new Student("牛牛",16);
		stu1.show();
		//修改年龄和姓名
		stu1.setAge(20);
		stu1.setName("牛可");
		stu1.show();
		
		//不能输入错误的年龄
		stu1.setAge(-20);
		stu1.show();
		
		//不能输入错误的姓名
		stu1.setName("");
		stu1.show();
	}

}
