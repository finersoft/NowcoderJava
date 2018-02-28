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
	 * 能存储记录 不限制能存储的记录条数
	 * 
	 * @param note
	 *            要保存的笔记
	 */
	public void addNote(String note);

	/**
	 * 能知道已经存储的记录的数量
	 * 
	 * @return int 笔记本的笔记数量
	 */
	public int getNoteLength();

	/**
	 * 能查看每一条记录
	 * 
	 * @param position
	 *            获取第position条笔记
	 * @return String 笔记内容
	 */
	public String getOne(int position);

	/**
	 * 能删除一条记录
	 * @param position 待删除笔记位置 
	 * @return String 返回已删除的笔记内容
	 */
	public String deleteOne(int position);

	/**
	 * 能按笔记内容删除一条笔记
	 * 
	 * @param note
	 *            要删除的笔记内容
	 * @return String 已删除笔记内容
	 */
	public String deleteOne(String note);

	/**
	 * 能列出所有的记录
	 * 
	 * @return String 笔记本所有笔记
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
	 * 能存储记录 不限制能存储的记录条数
	 * 
	 * @param note
	 *            要添加的笔记内容
	 */

	public void addNote(String note) {
		notes.add(note);
	}

	/**
	 * 能知道已经存储的记录的数量
	 * 
	 * @return 笔记本笔记条数
	 */
	public int getNoteLength() {
		return notes.size();
	}

	/**
	 * 能查看每一条记录
	 * 
	 * @param 需要获取的笔记所在位置
	 * @return 所在位置的笔记内容
	 */
	public String getOne(int position) {
		return notes.get(position);
	}

	/**
	 * 能删除一条记录
	 * 
	 * @param position
	 *            笔记位置
	 * @return String 删除笔记内容
	 */
	public String deleteOne(int position) {
		return notes.remove(position);
	}

	/**
	 * 能按笔记内容删除一条笔记
	 * 
	 * @param note
	 *            待删除笔记内容
	 * @return String 已删除笔记内容
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
	 * 能列出所有的记录
	 * 
	 * @return String 所有笔记内容
	 */
	public String getAllNotes() {
		StringBuilder sb = new StringBuilder();
		for (String string : notes) {
			sb.append(string);
		}
		return sb.toString();
	}

	/**
	 * 构造函数
	 */
	public NotepadbyList() {
		notes = new ArrayList<String>();
	}

	/**
	 * 测试方法
	 */
	public static void main(String args[]) {
		NotepadbyList np = new NotepadbyList();
		// 添加笔记 好好学习
		np.addNote("好好学习");
		// 添加笔记 天天向上
		np.addNote("天天向上");
		// 添加笔记 少玩游戏
		np.addNote("少玩游戏");
		// 添加笔记 多刷牛客
		np.addNote("多刷牛客");
		// 这儿应该输出4
		System.out.println(np.getNoteLength());
		// 这儿应该输出多刷牛客
		System.out.println(np.getOne(3));
		// 这儿应该输出好好学习天天向上少玩游戏多刷牛客
		System.out.println(np.getAllNotes());
		// 这儿应该输出好好学习
		System.out.println(np.deleteOne(0));
		// 这儿应该输出天天向上
		System.out.println(np.deleteOne("天天向上"));
		// 添加笔记
		np.addNote("好好学习");
		// 添加笔记
		np.addNote("天天向上");
		// 这儿应该输出少玩游戏多刷牛客好好学习天天向上
		System.out.println(np.getAllNotes());

	}
}
