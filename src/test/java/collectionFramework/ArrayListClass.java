package collectionFramework;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList();
		cities.add("Guntur");
		cities.add("Prakasam");
		cities.add("bapatla");
		cities.add("Nellore");
		cities.add("chirala");
		cities.add("Ongole");
		cities.add("Narasaraopet");
		cities.add(2,"vijayawada");
		System.out.println(cities);
		ArrayList<String> topCities=new ArrayList();
		topCities.add("Hyderabad");
		topCities.addAll(0,cities);
		System.out.println(topCities);
		
		
	}
}
