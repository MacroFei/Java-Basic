package IO流;

import java.io.File;
import java.io.FileWriter;

public class TestStreamb2 {
	public static void main(String[] args) {
//		 步骤 2 : 使用字符流把字符串写入到文件
//		FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件

		//准备文件
		File f = new File ("/Users/Xuan/Macro/testDemo/222.txt");
		//创建基于文件的Writer
		try (FileWriter fr = new FileWriter(f)){
			String data = "asdkdjglkd24123123";
			char[] cs = data.toCharArray();
			fr.write(cs);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
