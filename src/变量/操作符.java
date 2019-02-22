package 变量;

public class 操作符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		任意运算单元的长度超过int
		/**
		 * 如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算 比如 int a = 5; long b = 6; a+b -> 结果类型是long
		 */
		int a = 5;
		long b = 6;
		int c = (int) (a + b);// a+b的结果是long型，所以要进行强制类型转换
		long d = a + b;
//		任意运算单元的长度小于int
		/**
		 * 如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算 byte a = 1; byte b= 2; a+b -> int 类型
		 */
		byte a1 = 1;
		byte b1 = 2;
		byte c1 = (byte) (a1 + b1); // 虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
		int d1 = a1 + b1;

//		%取模
		/**
		 * % 取余数，又叫取模 5除以2，余1
		 */
		int i0 = 5;
		int j0 = 2;
		System.out.println(i0 % j0); // 输出为1
//        自增 自减操作符置前以及置后的区别
		/**
		 * 以++为例 int i = 5; i++; 先取值，再运算 ++i; 先运算，再取值
		 */
		int i1 = 5;
		System.out.println(i1++); // 输出5
		System.out.println(i1); // 输出6

		int j1 = 5;
		System.out.println(++j1); // 输出6
		System.out.println(j1); // 输出6

//		关系操作符
		// 长路或 无论第一个表达式的值是true或者false,第二个的值，都会被运算
		int i = 2;
		System.out.println(i == 1 | i++ == 2); // 无论如何i++都会被执行，所以i的值变成了3
		System.out.println(i);

		// 短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
		int j = 2;
		System.out.println(j == 2 || j++ == 2); // 因为j==2返回true,所以右边的j++就没有执行了，所以j的值，还是2
		System.out.println(j);

//        三元操作符
		/**
		 * 表达式?值1:值2 如果表达式为真 返回值1 如果表达式为假 返回值2
		 */
		int m = 5;
		int n = 6;
		int k = n > m ? 22 : 33;
		// 相当于
		if (n < m) {
			k = 99;
		} else {
			k = 88;
		}

		System.out.println(k);

//	        continue 

		// 继续下一次循环

//		break
		// 通过添加标记终止外部循环

	}

	void show() {
		boolean breakout = false;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				if (j == 11) {
					breakout = true;
					break;
				}
			}
			if (breakout == true) {
				break;
			}
		}
	}

}
