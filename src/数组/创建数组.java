package 数组;

import java.util.Arrays;

public class 创建数组 {

	public static void main(String[] args) {
		//http://how2j.cn/k/array/array-arrays/516.html#step1060
//		数组是一个固定长度的，包含了相同类型数据的 容器
		// 声明一个数组变量
		int[] a = new int[10];
		a[0] = 1 ;
		// 步骤 2 : 创建数组
		/**
		 * 创建数组的时候，要指明数组的长度。 new int[5] 引用概念： 如果变量代表一个数组，比如a,我们把a叫做引用 与基本类型不同 int c = 5;
		 * 这叫给c赋值为5 声明一个引用 int[] a; a = new int[5]; 让a这个引用，指向数组
		 */

//		Arrays是针对数组的工具类，可以进行 排序，查找，复制填充等功能。 大大提高了开发人员的工作效率。

		int[] b = Arrays.copyOfRange(a, 0, 1);
		
		System.out.println(Arrays.toString(a));

		//Arrays.sort(a);
		 int c[] = new int[] { 18, 62, 68, 82, 65, 9 };
	        System.out.println("排序之前 :");
	        System.out.println(Arrays.toString(c));
	        Arrays.sort(c);
	        System.out.println("排序之后:");
	        System.out.println(Arrays.toString(c));
	  
	        //Arrays.fill(a, 22);
	        System.out.println("toString" + Arrays.toString(a));
	        System.out.println("binarySearch = " + Arrays.binarySearch(a, 22));
		
//********
	        int d[] = new int[] { 18, 62, 68, 82, 65, 9 };
	        
	        Arrays.sort(d);
	 
	        System.out.println(Arrays.toString(d));
	        //使用binarySearch之前，必须先使用sort进行排序
	        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(d, 62));
	}

}
