/**
 * 
 */
package com.finersoft.nowcoder04;

/**
 * ���ƣ�
 * ���ӣ�https://www.nowcoder.com/discuss/68639
 * ��Դ��ţ����
 * 
 * ������Ŀ��
 * 
 * �ӿ�ʵ�֣�15���ӣ�
 * 
 * ����������
 * 
 * ���һ��Shape�ӿں���������ʵ����Square��Circle��Ҫ�����£�
 * Shape�ӿ�����һ�����󷽷�area()����������һ��double���͵Ĳ���������һ��double���͵Ľ����
 * Square��Circle��ʵ����Shape�ӿ��е�area()���󷽷����ֱ����������Բ�ε���������ء�
 * �ڲ������д���Square��Circle���󣬼���߳�Ϊ2������������Ͱ뾶Ϊ3��Բ�������
 * 
 * ����֪ʶ�㣺
 * 
 * ����������
 * Java�ӿڻ�������ʵ��
 * �������Ķ�̬����
 * 
 * �ο�֪ʶ�㣺��java�������š���4��
 * @author Finersoft
 * @date 2018��3��13��
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
