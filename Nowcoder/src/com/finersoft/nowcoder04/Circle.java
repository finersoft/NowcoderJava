/**
 * 
 */
package com.finersoft.nowcoder04;

/**
 * ���ƣ�Բ ˵����
 * 
 * @author Finersoft
 * @date 2018��3��13��
 */
public class Circle implements IShape {

	/**
	 * ����Բ�����
	 * @param radius
	 * @return Բ�����
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
