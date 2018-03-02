/**
 * 牛客网第三题——测试类
 */
package com.finersoft.nowcoder;

/**
 * 名称：测试学生类
 * 说明：
 * @author Finersoft
 * @date 2018年3月1日
 */
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu = new Student("牛珂",18);
		stu.setAge(20);
		stu.setName("牛可可");
		stu.show();
		
		Undergraduate stu2= new Undergraduate(stu.getName(),stu.getAge(),"Java虚拟机");
		stu2.show();

	}

}
