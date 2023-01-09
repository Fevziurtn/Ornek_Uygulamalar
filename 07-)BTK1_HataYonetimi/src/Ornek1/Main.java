package Ornek1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("D:\\[JAVA_KAMP]\\[BTK]\\7-)BTK1_HataYonetimi\\src\\Ornek1\\sayilar.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			reader.close();
		}
		
	}

}
