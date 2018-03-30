/**
 * 
 */
package com.finersoft.nowcoder04;

/**
 * 名称：
 * 说明：
 * @author Finersoft
 * @date 2018年3月13日
 */
public class Square implements IShape{

	/**
	 * 计算正方形的面积
	 * @param radius 正方形边长的一半，这是我定义的哈，亲们可以自己设定，但是参数说明要讲清楚
	 * @return 正方形的面积
	 * @see com.finersoft.nowcoder04.IShape#area(double)
	 */
	@Override
	public double area(double radius) {
		if(radius<0)
		{
			return 0; 
		}
		double sideLength = radius*2;
		return Math.pow(sideLength, 2);
	}

}
