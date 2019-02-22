package 变量;

public class 基本变量类型 {
	public static void main(String[] args) {
		/**
		 * 一个变量的类型，决定了该变量可以包含什么样的值。 Java中有八种基本类型，都是Java语言预先定义好的，并且是关键字。
		 * 
		 * 这八种基本类型分别是： 整型 （4种） 字符型 （1种） 浮点型 （2种） 布尔型（1种）
		 */
		byte b = 127;// -128~127
		short c = 32767;
		int d = 2147483647;
		long f = 9223372;// ...
		/**
		 * char类型用于存放一个字符，值用单引号'表示 (双引号表示字符串) 其长度和short一样，也是16位的 只能存放一个字符，超过一个字符就会产生编译错误
		 */
		char c1 = '非';
//		char c2 = '非凡';//报错
//		char c3 = 'asd';//报错
		/**
		 * 浮点数类型有两种 float 长度为32位 double 长度为64位 注意： 默认的小数值是double类型的 所以 float f =
		 * 54.321会出现编译错误，因为54.321的默认类型是 double，其类型 长度为64，超过了float的长度32
		 * 在数字后面加一个字母f，直接把该数字声明成float类型 float f2 = 54.321f, 这样就不会出错了
		 * 
		 */
		double d1 = 123.45;
//		float f1 = 54.312;//该行会出现编译错误，因为54.321是double型的
		float f2 = 54.312f;
		/**
		 * 布尔型用于表示真假 其长度为1
		 * 
		 * boolean b1 = true; boolean b2 = false;
		 * 
		 * 分别代表真假 虽然布尔型真正存放的数据是0(false) 1(true) 但是，不能直接使用0 1 进行赋值
		 */
		boolean b1 = true;
		boolean b2 = false;
		
//		String类型其实并不是基本类型，但是它是如此广泛的被使用，常常被误以为是一种基本类型。
//		String类型是Immutable的，一旦创建就不能够被改变，更多的关于String的学习，请参考String

	}

}
