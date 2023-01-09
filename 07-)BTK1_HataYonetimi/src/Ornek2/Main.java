package Ornek2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args){
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("D:\\[JAVA_KAMP]\\[BTK]\\7-)BTK1_HataYonetimi\\src\\Ornek2\\sayilar.txt"));
			boolean line = null != null;
			while(line = reader.readLine()!=null) {
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception exception) {
				
			}
		}
		
	}

}
