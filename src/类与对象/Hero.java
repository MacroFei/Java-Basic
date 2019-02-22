package 类与对象;

public class Hero {
	String name;
	int age;

	public static void main(String[] args) {
//		引用的概念，如果一个变量的类型是 类类型，而非基本类型，那么该变量又叫做引用。
//		1.引用和指向
		/**
		 * 代表创建了一个Hero对象 但是也仅仅是创建了一个对象，没有办法访问它 为了访问这个对象，会使用引用来代表这个对象
		 */
		new Hero();
		/**
		 * h这个变量是Hero类型，又叫做引用 =的意思指的h这个引用代表右侧创建的对象 “代表” 在面向对象里，又叫做“指向”
		 */
		Hero h = new Hero();
		Hero h1 = new Hero();
		Hero h2 = new Hero();// 多个引用，一个对象

//		3.一个引用，多个对象
		/**
		 * 第8行，引用garen指向新创建的对象（对象1） 第9行，同一个引用garen指向新创建的对象（对象2） 这个时候，对象1，就没有任何引用指向了
		 * 换句话说，就没有任何手段控制和访问该对象，那么该对象就变得没有意义。
		 */
		Hero garen = new Hero();
		garen = new Hero();
	}

}
