package n2exercici1;

import java.util.HashSet;
import java.util.Scanner;

public class n2exercici1 {

	public static void main(String[] args) {
		Restaurant restaurant;
		HashSet<Restaurant> hset = new HashSet<Restaurant>();
		char opcio=' ';
		String nom="",auxPuntuacio;
		int puntuacio;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Introdueixi el nom del restaurant: ");
			nom=sc.nextLine();
			do {
				System.out.println("Introdueixi la puntuació del restaurant: ");
				auxPuntuacio=sc.nextLine();
				if (!auxPuntuacio.matches("[0-9]*")) 
					System.out.println("\nIntrodueixi nombres enters");
			}while(!auxPuntuacio.matches("[0-9]*"));
			puntuacio=Integer.parseInt(auxPuntuacio);
			
			restaurant = new Restaurant(nom, puntuacio);
			hset.add(restaurant);
			
			System.out.println("Vol afegir un altre restaurant?");
			opcio=sc.nextLine().charAt(0);
			
		}while (opcio!='n' && opcio !='N');
		
		/*****afegeixo un duplicat de prova*****/
		restaurant = new Restaurant("restaurant", 5);
		hset.add(restaurant);
		restaurant = new Restaurant("restaurant", 5);
		hset.add(restaurant);
		restaurant = new Restaurant("restaurant", 7);
		hset.add(restaurant);
		/*************************************/
		
		System.out.println("\nLlista de restaurants:");
		
		for(Restaurant resta : hset) {
			System.out.println("Restaurant: "+resta.getNom()+" - Puntuació: "+resta.getPuntuacio());			
		}
	}	
	
}
