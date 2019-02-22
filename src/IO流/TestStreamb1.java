package IO流;

import java.io.File;
import java.io.FileReader;

public class TestStreamb1 {

	public static void main(String[] args) {
		// 准备文件lol.txt其中的内容是AB
		File f = new File ("/Users/Xuan/Macro/testDemo/222.txt");
		 // 创建基于文件的Reader
		try (FileReader fr = new FileReader(f)){
			// 创建字符数组，其长度就是文件的长度
			char [] all = new char[(int) f.length()];
			   // 以字符流的形式读取文件所有内容
			fr.read(all);
			for (char c : all) {
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
