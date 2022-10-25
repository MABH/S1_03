package n2exercici2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import n2exercici1.Restaurant;

public class n2exercici2 {

	public static void main(String[] args) {
		
		List<Restaurant> restaurants = new ArrayList<Restaurant>();		
		
		restaurants.add(new Restaurant("Brestaurant", 5));
		restaurants.add(new Restaurant("restaurant", 5));
		restaurants.add(new Restaurant("restaurant", 4));
		restaurants.add(new Restaurant("restaurant", 7));
		restaurants.add(new Restaurant("Arestaurant", 6));
		
		System.out.println("\nLlista de restaurants en ordre ascendent:");
		
		order (restaurants);
		
		for(Restaurant resta : restaurants) {
			System.out.println("Restaurant: "+resta.getNom()+" - Puntuació: "+resta.getPuntuacio());			
		}
	}	
	private static void order(List<Restaurant> restaurantes) {

	    Collections.sort(restaurantes, new Comparator() {

	        public int compare(Object o1, Object o2) {

	            String nom1 = ((Restaurant) o1).getNom();
	            String nom2 = ((Restaurant) o2).getNom();
	            int sComp = nom1.compareTo(nom2);

	            if (sComp != 0) {
	               return sComp;
	            } 

	            Integer punt1 = ((Restaurant) o1).getPuntuacio();
	            Integer punt2 = ((Restaurant) o2).getPuntuacio();
	            return punt1.compareTo(punt2);
	    }});
	}
}
