package IO流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestStreamc {

	public static void main(String[] args) {

		File f = new File("/Users/Xuan/Macro/testDemo/222.txt");

		try (FileWriter fr = new FileWriter(f); PrintWriter pw = new PrintWriter(fr);)
		{
			pw.println("ashdiasd");
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
