/**
 * 
 */
package com.finersoft.nowcoder05;

/**
 * ���ƣ������쳣��<br/>
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
public class NoThisSoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5303011482203106325L;

	/**
	 * �޲ι��췽����������
	 */
	public NoThisSoundException() {
		super("û��һ�׸��ܱ��������������");
	}

	/**
	 * ���ι��췽��
	 * @param msg
	 */
	public NoThisSoundException(String msg) {
		super( msg);
	}
}
