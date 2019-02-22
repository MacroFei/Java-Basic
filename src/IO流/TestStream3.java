package IO流;
  
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
  
public class TestStream3 {
  
    public static void main(String[] args) {
        try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f = new File ("/Users/Xuan/Macro/testDemo/222.txt");
        	//创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all = new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
             fis.read(all);
             for (byte b : all) {
				System.out.println(b);
			}
            //每次使用完流，都应该进行关闭
             fis.close();
              
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
          
    }
}