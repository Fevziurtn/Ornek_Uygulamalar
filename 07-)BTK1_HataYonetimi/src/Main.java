
public class Main {

	public static void main(String[] args) {
		try {
			int[] sayilar = new int[] {1,2,3};
		System.out.println(sayilar[0]);
		} catch (Exception exception) {
			System.out.println("Hata olustu");
		}finally {
			System.out.println("Ben her turlu calisirim.");
		}
		
		

	}

}
