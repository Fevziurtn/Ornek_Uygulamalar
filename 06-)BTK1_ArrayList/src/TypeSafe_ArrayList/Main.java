package TypeSafe_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("Istanbul");
		sehirler.add("Izmir");
		sehirler.add("Adana");
		
		//sehirler.remove("Istanbul");
		//sehirler.remove(1);
		
		Collections.sort(sehirler);
		for(String sehir : sehirler) {
			System.out.println(sehir);
		}
	}

}
