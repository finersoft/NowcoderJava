/**
 * 
 */
package com.finersoft.nowcoder05;

/**
 * ���ƣ���������<br/>
 * ˵����<br/>
 * ���ߣ����� ���ӣ�https://www.nowcoder.com/discuss/70619 ��Դ��ţ����
 * 
 * ����������
 * 
 * �Զ���һ���쳣��NoThisSoundException��Player�࣬��Player���play()������ʹ���Զ����쳣��Ҫ�����£�
 * 
 * NoThisSoundException�̳���Exception�࣬������һ���޲κ�һ������һ��string���Ͳ����Ĺ��췽�������췽���ж�����super�ؼ��ֵ��ø���Ĺ��췽����
 * Player���ж���һ��play(int
 * index)��������������һ��int���͵Ĳ�������ʾ���Ÿ�������������index>10ʱ��play()������throw�ؼ����׳�NoThisSoundException�쳣������һ������ʱ�����õ��вι��췽�������롰�����ŵĸ��������ڡ���
 * �ڲ������д���Player���󣬲�����play()���������Զ����NoThisSoundException�쳣��ʹ��try...catch��䲶���쳣������NoThisSoundException��getMessage()������ӡ�쳣��ʾ��Ϣ��
 * 
 * ����֪ʶ�㣺
 * 
 * �������ļ̳����� �Զ����쳣���ʵ�� �쳣��������֪ʶ��
 * 
 * �ο�֪ʶ�㣺��java�������š���4��<br/>
 * 
 * @author Finersoft
 * @date 2018��3��27��
 */
public class Player {

	/**
	 * ����������ʼ
	 */
	static int startIndex = 0 ;
	/**
	 * ������������ 
	 */
	static int endIndex = 10 ;
	/**
	 * ��������
	 * @param index
	 * @throws NoThisSoundException
	 */
	public static void play(int index) throws NoThisSoundException {
		if (index > startIndex && index <= endIndex) {
			System.out.println("���ڳ�һ�׸裬һ�׼򵥵ĸ�");
		} else {
			throw new NoThisSoundException("�����ŵĸ���������");
		}
	}

	/**
	 * ���Է���
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			play(10);
			play(11);
		} catch (NoThisSoundException e1) {
			System.out.println(e1.getMessage());
		} catch (Exception e) {
			//�õ��쳣ϰ�������Ҫ��һ�������쳣������ʱ��ô����Ĳ���
			System.out.println("�����쳣" + e.getMessage());
		}
		finally {
			//System.out.println("ɨβ����");
		}
		System.out.println("�������");

	}

}
