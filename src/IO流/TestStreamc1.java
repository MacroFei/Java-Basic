package IO流;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestStreamc1 {

	public static void main(String[] args) {

		File f = new File("/Users/Xuan/Macro/testDemo/222.txt");

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
