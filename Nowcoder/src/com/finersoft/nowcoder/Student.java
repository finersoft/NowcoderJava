/**
 * ţ���������⡪��ѧ����
 */
package com.finersoft.nowcoder;

/**
 * ���ƣ�ѧ���� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Student {
	/** ���������Ϊ200�� */
	public final int MAXAGE= 200;

	/** * ���� */
	private String name;
	/** * ���� */
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
			System.out.println("��������Ϊ��");
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
			System.out.println("������һ�������ִ��˵�����");
		}
	}

	/**
	 * Ĭ�Ϲ��캯��
	 */
	public Student() {
		this("����", 18);
	}

	/**
	 * ��һ�����Ĺ��캯��
	 * 
	 * @param name
	 *            ѧ������
	 */
	public Student(String name) {
		this(name, 18);
	}

	/**
	 * �����������캯��
	 * 
	 * @param name
	 *            ѧ������
	 * @param age
	 *            ѧ������
	 */
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * ��ӡѧ����Ϣ
	 */
	public void show() {
		System.out.println(this.toString());
	}

	/**
	 * ת�����ַ�������
	 */
	@Override
	public String toString() {
		return "ѧ����Ϣ��\r\n\t������" + this.getName ()+ "\r\n\t���䣺" + this.getAge();

	}
	
	public static void main(String[] args) {
		//�޲ι��캯��
		Student stu1= new Student();
		stu1.show();
		//һ�ι��캯��
		stu1=new Student("ţţ");
		stu1.show();
		//���ι��캯��
		stu1=new Student("ţţ",16);
		stu1.show();
		//�޸����������
		stu1.setAge(20);
		stu1.setName("ţ��");
		stu1.show();
		
		//����������������
		stu1.setAge(-20);
		stu1.show();
		
		//����������������
		stu1.setName("");
		stu1.show();
	}

}
