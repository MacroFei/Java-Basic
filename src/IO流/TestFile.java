package IO流;

import java.io.File;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) {
		// 绝对路径
		File f1 = new File("/Users/Xuan/Macro/testDemo");
		System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
		// 相对路径，相当于工作目录，如果在eclipse中，就是项目目录
		File f2 = new File("123.txt");
		System.out.println("f2的绝对路径：" + f2.getAbsolutePath());
		// 把f1作为父目录创建文件对象
		File f3 = new File(f1, "234.txt");
		System.out.println("f3的绝对路径" + f3.getAbsolutePath());
		
		System.out.println("当前文件是："+f1);
		//文件是否存在
		System.out.println("判断是否存在："+f1.exists());
		
		//是否是文件夹		
		System.out.println("判断是否是文件夹："+f1.isDirectory());
		
		//是否是文件(非文件夹)
		System.out.println("判断是否是文件："+ f1.isFile());
		
		//文件长度
		System.out.println("获取文件长度"+f1.length());
		
		//文件最后修改时间
		long time = f1.lastModified();
		Date d = new Date(time);
		System.out.println("获取文件最后修改时间："+d);
		//初始化文件修改时间
		f1.setLastModified(0);
		
//		//文件重命名
//		File f4 = new File ("555.txt");
//		f2.renameTo(f4);
//		System.out.println("f2的名字"+f2.getName());
		
		//以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
		f1.list();
	
	}

}
