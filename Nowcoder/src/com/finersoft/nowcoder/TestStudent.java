/**
 * ţ���������⡪��������
 */
package com.finersoft.nowcoder;

/**
 * ���ƣ�����ѧ����
 * ˵����
 * @author Finersoft
 * @date 2018��3��1��
 */
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu = new Student("ţ��",18);
		stu.setAge(20);
		stu.setName("ţ�ɿ�");
		stu.show();
		
		Undergraduate stu2= new Undergraduate(stu.getName(),stu.getAge(),"Java�����");
		stu2.show();

	}

}
