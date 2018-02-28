import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Finersoft
 * @version 1.0
 *
 */
interface Notepad {

	/**
	 * �ܴ洢��¼ �������ܴ洢�ļ�¼����
	 * 
	 * @param note
	 *            Ҫ����ıʼ�
	 */
	public void addNote(String note);

	/**
	 * ��֪���Ѿ��洢�ļ�¼������
	 * 
	 * @return int �ʼǱ��ıʼ�����
	 */
	public int getNoteLength();

	/**
	 * �ܲ鿴ÿһ����¼
	 * 
	 * @param position
	 *            ��ȡ��position���ʼ�
	 * @return String �ʼ�����
	 */
	public String getOne(int position);

	/**
	 * ��ɾ��һ����¼
	 * @param position ��ɾ���ʼ�λ�� 
	 * @return String ������ɾ���ıʼ�����
	 */
	public String deleteOne(int position);

	/**
	 * �ܰ��ʼ�����ɾ��һ���ʼ�
	 * 
	 * @param note
	 *            Ҫɾ���ıʼ�����
	 * @return String ��ɾ���ʼ�����
	 */
	public String deleteOne(String note);

	/**
	 * ���г����еļ�¼
	 * 
	 * @return String �ʼǱ����бʼ�
	 */
	public String getAllNotes();
}

/**
 * 
 * @author Finersoft
 *
 */
public class NotepadbyList implements Notepad {

	private List<String> notes;

	/**
	 * �ܴ洢��¼ �������ܴ洢�ļ�¼����
	 * 
	 * @param note
	 *            Ҫ��ӵıʼ�����
	 */

	public void addNote(String note) {
		notes.add(note);
	}

	/**
	 * ��֪���Ѿ��洢�ļ�¼������
	 * 
	 * @return �ʼǱ��ʼ�����
	 */
	public int getNoteLength() {
		return notes.size();
	}

	/**
	 * �ܲ鿴ÿһ����¼
	 * 
	 * @param ��Ҫ��ȡ�ıʼ�����λ��
	 * @return ����λ�õıʼ�����
	 */
	public String getOne(int position) {
		return notes.get(position);
	}

	/**
	 * ��ɾ��һ����¼
	 * 
	 * @param position
	 *            �ʼ�λ��
	 * @return String ɾ���ʼ�����
	 */
	public String deleteOne(int position) {
		return notes.remove(position);
	}

	/**
	 * �ܰ��ʼ�����ɾ��һ���ʼ�
	 * 
	 * @param note
	 *            ��ɾ���ʼ�����
	 * @return String ��ɾ���ʼ�����
	 */
	public String deleteOne(String note) {
		Iterator<String> iterator = notes.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.equals(note)) {
				iterator.remove();
				return note;
			}
		}
		return "";
	}

	/**
	 * ���г����еļ�¼
	 * 
	 * @return String ���бʼ�����
	 */
	public String getAllNotes() {
		StringBuilder sb = new StringBuilder();
		for (String string : notes) {
			sb.append(string);
		}
		return sb.toString();
	}

	/**
	 * ���캯��
	 */
	public NotepadbyList() {
		notes = new ArrayList<String>();
	}

	/**
	 * ���Է���
	 */
	public static void main(String args[]) {
		NotepadbyList np = new NotepadbyList();
		// ��ӱʼ� �ú�ѧϰ
		np.addNote("�ú�ѧϰ");
		// ��ӱʼ� ��������
		np.addNote("��������");
		// ��ӱʼ� ������Ϸ
		np.addNote("������Ϸ");
		// ��ӱʼ� ��ˢţ��
		np.addNote("��ˢţ��");
		// ���Ӧ�����4
		System.out.println(np.getNoteLength());
		// ���Ӧ�������ˢţ��
		System.out.println(np.getOne(3));
		// ���Ӧ������ú�ѧϰ��������������Ϸ��ˢţ��
		System.out.println(np.getAllNotes());
		// ���Ӧ������ú�ѧϰ
		System.out.println(np.deleteOne(0));
		// ���Ӧ�������������
		System.out.println(np.deleteOne("��������"));
		// ��ӱʼ�
		np.addNote("�ú�ѧϰ");
		// ��ӱʼ�
		np.addNote("��������");
		// ���Ӧ�����������Ϸ��ˢţ�ͺú�ѧϰ��������
		System.out.println(np.getAllNotes());

	}
}
