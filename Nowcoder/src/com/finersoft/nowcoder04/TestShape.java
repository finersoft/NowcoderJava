/**
 * 
 */
package com.finersoft.nowcoder04;

/**
 * 名称：
 * 链接：https://www.nowcoder.com/discuss/68639
 * 来源：牛客网
 * 
 * 本期题目：
 * 
 * 接口实现（15分钟）
 * 
 * 需求描述：
 * 
 * 设计一个Shape接口和它的两个实现类Square和Circle，要求如下：
 * Shape接口中有一个抽象方法area()，方法接收一个double类型的参数，返回一个double类型的结果。
 * Square和Circle中实现了Shape接口中的area()抽象方法，分别求正方向和圆形的面积并返回。
 * 在测试类中创建Square和Circle对象，计算边长为2的正方形面积和半径为3的圆形面积。
 * 
 * 考察知识点：
 * 
 * 面向对象基础
 * Java接口基础及其实现
 * 面向对象的多态特性
 * 
 * 参考知识点：《java基础入门》第4章
 * @author Finersoft
 * @date 2018年3月13日
 */
public class TestShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IShape circle = new Circle();
		IShape square = new Square ();
		
		System.out.println(circle.area(10));
		System.out.println(square.area(100));

	}

}
