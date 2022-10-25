package n2exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class n2exercici3 {
	static ArrayList<Persona> personas;
	
	public static void main(String[] args) {
		personas = new ArrayList<Persona>();
		
		try {
			leerCSV();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		Collections.sort(personas);
		imprimir(personas);
	}

	public static void leerCSV() throws IOException {
		 BufferedReader br = null;
	     String Separator = ";";
	      try {
	         
	         br =new BufferedReader(new FileReader("C:\\Users\\Miguel Angel\\Documents\\Libro1.csv"));
	         String line = br.readLine();
	         while (null!=line) {
	            String [] fields = line.split(Separator);	           
	            personas.add(new Persona(fields[0], fields[1], fields[2]));
	            line = br.readLine();
	         }
	      } catch (Exception e) {
	         System.err.println(e);
	      } finally {
	         if (null!=br) {
	            br.close();
	         }
	      }
	}
	

	public static void imprimir(ArrayList<Persona> personas) 
	{
		System.out.println("___Nom___ "+"____Cognoms___"+"\t"+"__NIF__ ");
		for(Persona p : personas) {
			System.out.print(p.getNombre()+"\t"+p.getApellido());
			System.out.println("   "+p.getDni());
		}
	}
		
	Comparator<Persona> compareById = new Comparator<Persona>() {
		@Override
		public int compare(Persona p1, Persona p2) {
			return p1.getApellido().compareTo(p2.getApellido());
		}
	};
		
}
