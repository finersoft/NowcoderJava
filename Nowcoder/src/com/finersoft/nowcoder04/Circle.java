/**
 * 
 */
package com.finersoft.nowcoder04;

/**
 * 名称：圆 说明：
 * 
 * @author Finersoft
 * @date 2018年3月13日
 */
public class Circle implements IShape {

	/**
	 * 计算圆的面积
	 * @param radius
	 * @return 圆的面积
	 * @see com.finersoft.nowcoder04.IShape#area(double)
	 */
	@Override
	public double area(double radius) {
		if (radius < 0) {
			return 0;
		}
		return Math.PI * Math.pow(radius, 2);
	}

}
