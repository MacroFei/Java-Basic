package 注解;

public class Demo {
//	 步骤 1 : @Override
	/**
	 * @Override 用在方法上，表示这个方法重写了父类的方法，如toString()。
	 *           如果父类没有这个方法，那么就无法编译通过，如例所示，在fromString()方法上加上@Override
	 *           注解，就会失败，因为Hero类的父类Object，并没有fromString方法
	 */

	String name ;
	@Override
	public String toString () {
		return name ;
	}
//	@Override //添加注解表示继承重写父类的方法，但是父类没有该方法导致报错
	public String fromString () {
		return name;
		
	}
}
