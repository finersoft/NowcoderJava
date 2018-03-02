/**
 * 牛客网第三题——研究生类
 */
package com.finersoft.nowcoder;

/**
 * 名称：研究生 说明：
 * 
 * @author Finersoft
 * @date 2018年3月1日
 */
public class Undergraduate extends Student {
	/** 学位 */
	private String degree;

	/** * @return 学位信息 */
	public String getDegree() {
		return degree;
	}

	/** * @param degree 学位信息 */
	public void setDegree(String degree) {
		if (degree != null && degree != "") {
			this.degree = degree;
		} else {
			System.out.println("学位不能为空");
		}
	}

	/**
	 * 无参构造
	 */
	public Undergraduate() {
		this("李四", 22, "Java开发");
	}

	/**
	 * 单参构造
	 * 
	 * @param name
	 *            研究生姓名
	 */
	public Undergraduate(String name) {
		this(name, 22, "Java开发");
	}

	/**
	 * 双参构造
	 * 
	 * @param name
	 *            研究生姓名
	 * @param age
	 *            研究生年龄
	 */
	public Undergraduate(String name, int age) {
		this(name, age, "Java开发");
	}

	/**
	 * 完整参数构造
	 * 
	 * @param name
	 *            研究生姓名
	 * @param age
	 *            研究生年龄
	 * @param degree
	 *            学位信息
	 */
	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}

	/**
	 * 转换成字符串操作
	 * 
	 * @see com.finersoft.nowcoder.Student#toString()
	 */
	@Override
	public String toString() {
		return "研究生"+ super.toString() + "\r\n\t学位：" + this.getDegree();
	}

	/**
	 * 打印研究生信息
	 * 
	 * @see com.finersoft.nowcoder.Student#show()
	 */
	@Override
	public void show() {
		System.out.println(this.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 无参构造函数
		Undergraduate stu1 = new Undergraduate();
		stu1.show();
		// 一参构造函数
		stu1 = new Undergraduate("牛牛");
		stu1.show();
		// 两参构造函数
		stu1 = new Undergraduate("牛牛", 23);
		stu1.show();
		// 完整参数构造函数
		stu1 = new Undergraduate("牛客", 24, "Java架构");
		stu1.show();
		// 修改学位信息
		stu1.setDegree("JavaEE");
		stu1.show();
		// 修改学位信息——报错，学位不能为空
		stu1.setDegree("");
		stu1.show();
	}

}
