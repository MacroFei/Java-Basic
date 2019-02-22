package IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestStream1 {

	public static void main(String[] args) {

		File f = new File ("/Users/Xuan/Macro/testDemo/222.txt");
		//创建基于文件的输入流
		try {
			FileInputStream fis = new FileInputStream(f);
			//通过这个输入流，可以把数据从硬盘，读取到java的虚拟机中，也就是读取到内存中
			FileOutputStream fos = new FileOutputStream(f);
			//通过这个输出流，可以把数据从内存，输出到硬盘中
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
