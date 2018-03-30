/**
 * 
 */
package com.finersoft.nowcoder04;

/**
 * ���ƣ�
 * ˵����
 * @author Finersoft
 * @date 2018��3��13��
 */
public class Square implements IShape{

	/**
	 * ���������ε����
	 * @param radius �����α߳���һ�룬�����Ҷ���Ĺ������ǿ����Լ��趨�����ǲ���˵��Ҫ�����
	 * @return �����ε����
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
