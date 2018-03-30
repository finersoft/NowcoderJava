/**
 * 
 */
package com.finersoft.nowcoder05;

/**
 * 名称：播放器类<br/>
 * 说明：<br/>
 * 作者：筱茜 链接：https://www.nowcoder.com/discuss/70619 来源：牛客网
 * 
 * 需求描述：
 * 
 * 自定义一个异常类NoThisSoundException和Player类，在Player类的play()方法中使用自定义异常，要求如下：
 * 
 * NoThisSoundException继承自Exception类，类中有一个无参和一个接收一个string类型参数的构造方法，构造方法中都是用super关键字调用父类的构造方法。
 * Player类中定义一个play(int
 * index)方法，方法接收一个int类型的参数，表示播放歌曲的索引，当index>10时，play()方法用throw关键字抛出NoThisSoundException异常，创建一场对象时，调用的有参构造方法，传入“您播放的歌曲不存在”。
 * 在测试类中创建Player对象，并调用play()方法测试自定义的NoThisSoundException异常，使用try...catch语句捕获异常，调用NoThisSoundException的getMessage()方法打印异常提示信息。
 * 
 * 考查知识点：
 * 
 * 面向对象的继承特性 自定义异常类的实现 异常处理的相关知识点
 * 
 * 参考知识点：《java基础入门》第4章<br/>
 * 
 * @author Finersoft
 * @date 2018年3月27日
 */
public class Player {

	/**
	 * 歌曲索引开始
	 */
	static int startIndex = 0 ;
	/**
	 * 歌曲索引结束 
	 */
	static int endIndex = 10 ;
	/**
	 * 播放音乐
	 * @param index
	 * @throws NoThisSoundException
	 */
	public static void play(int index) throws NoThisSoundException {
		if (index > startIndex && index <= endIndex) {
			System.out.println("我在唱一首歌，一首简单的歌");
		} else {
			throw new NoThisSoundException("您播放的歌曲不存在");
		}
	}

	/**
	 * 测试方法
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			play(10);
			play(11);
		} catch (NoThisSoundException e1) {
			System.out.println(e1.getMessage());
		} catch (Exception e) {
			//好的异常习惯是最后要加一个上面异常处理不了时怎么处理的操作
			System.out.println("其他异常" + e.getMessage());
		}
		finally {
			//System.out.println("扫尾操作");
		}
		System.out.println("播放完毕");

	}

}
