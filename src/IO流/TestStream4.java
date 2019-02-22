package IO流;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class TestStream4 {
 
    public static void main(String[] args) {
        try {
            // 准备文件lol2.txt其中的内容是空的
        	File f = new File("/Users/Xuan/Macro/testDemo/222.txt");
        	// 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
        	byte data[] = {90,89};
        	
            // 创建基于文件的输出流
        	FileOutputStream fos = new FileOutputStream(f);
        	// 把数据写入到输出流
        	fos.write(data);

        	// 关闭输出流
        	fos.close();

        	
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}