/**
 * ţ���������⡪���о�����
 */
package com.finersoft.nowcoder;

/**
 * ���ƣ��о��� ˵����
 * 
 * @author Finersoft
 * @date 2018��3��1��
 */
public class Undergraduate extends Student {
	/** ѧλ */
	private String degree;

	/** * @return ѧλ��Ϣ */
	public String getDegree() {
		return degree;
	}

	/** * @param degree ѧλ��Ϣ */
	public void setDegree(String degree) {
		if (degree != null && degree != "") {
			this.degree = degree;
		} else {
			System.out.println("ѧλ����Ϊ��");
		}
	}

	/**
	 * �޲ι���
	 */
	public Undergraduate() {
		this("����", 22, "Java����");
	}

	/**
	 * ���ι���
	 * 
	 * @param name
	 *            �о�������
	 */
	public Undergraduate(String name) {
		this(name, 22, "Java����");
	}

	/**
	 * ˫�ι���
	 * 
	 * @param name
	 *            �о�������
	 * @param age
	 *            �о�������
	 */
	public Undergraduate(String name, int age) {
		this(name, age, "Java����");
	}

	/**
	 * ������������
	 * 
	 * @param name
	 *            �о�������
	 * @param age
	 *            �о�������
	 * @param degree
	 *            ѧλ��Ϣ
	 */
	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}

	/**
	 * ת�����ַ�������
	 * 
	 * @see com.finersoft.nowcoder.Student#toString()
	 */
	@Override
	public String toString() {
		return "�о���"+ super.toString() + "\r\n\tѧλ��" + this.getDegree();
	}

	/**
	 * ��ӡ�о�����Ϣ
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
		// �޲ι��캯��
		Undergraduate stu1 = new Undergraduate();
		stu1.show();
		// һ�ι��캯��
		stu1 = new Undergraduate("ţţ");
		stu1.show();
		// ���ι��캯��
		stu1 = new Undergraduate("ţţ", 23);
		stu1.show();
		// �����������캯��
		stu1 = new Undergraduate("ţ��", 24, "Java�ܹ�");
		stu1.show();
		// �޸�ѧλ��Ϣ
		stu1.setDegree("JavaEE");
		stu1.show();
		// �޸�ѧλ��Ϣ��������ѧλ����Ϊ��
		stu1.setDegree("");
		stu1.show();
	}

}
