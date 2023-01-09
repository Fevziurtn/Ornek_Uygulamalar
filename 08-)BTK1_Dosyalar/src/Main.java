import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//getFileInfo();
		readFile();
		writeFile();
		readFile();
	}

	public static void createFile() {
		File file = new File("D:\\[JAVA_KAMP]\\[BTK]\\files\\students.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("Dosya olusturuldu");
			} else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void getFileInfo() {
		File file = new File("D:\\[JAVA_KAMP]\\[BTK]\\files\\students.txt");
		if(file.exists()) {
			System.out.println("Dosya adi: " + file.getName());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
			System.out.println("Dosya yazilabilir mi: " + file.canWrite());
			System.out.println("Dosya okunabilir mi: " + file.canRead());
			System.out.println("Dosya boyutu: " + file.length());
		}
	}
	
	public static void readFile() {
		File file = new File("D:\\[JAVA_KAMP]\\[BTK]\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\[JAVA_KAMP]\\[BTK]\\files\\students.txt",true));
			writer.newLine();
			writer.write("Ahmet");
			System.out.println("Dosya yazildi");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
