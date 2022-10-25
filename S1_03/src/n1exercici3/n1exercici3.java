package n1exercici3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class n1exercici3 {
	static Map capitales= new HashMap();
	
	public static void main(String[] args) {
		 
		leerFichero();
		preguntas();
		 
	    
        
	}
	
	public static void leerFichero() {		
		String linea;
		String[] string;
		
		try {
			 FileInputStream fis = new FileInputStream("C:\\Users\\Miguel Angel\\Documents\\Countries.txt");
			 InputStreamReader is = new InputStreamReader(fis, "ISO-8859-1");
			 BufferedReader bf = new BufferedReader(is);
			 linea=bf.readLine();
			 
			 while (!linea.equals("")) {		
				 string = linea.split(" ");				 
				 capitales.put(string[0], string[1]);
				 linea = bf.readLine();
			 }
			 fis.close();
			 System.out.println("Countries.txt importado correctamente");
		 } catch (FileNotFoundException e) {
			 System.out.println("Fichero no encontrado");
			 e.printStackTrace();
		 } catch (IOException e) {
			 System.out.println("Error de E/S");
			 e.printStackTrace();
		 }		 
	}
	
	public static void preguntas() {
		Scanner sc=new Scanner(System.in);		
		String nombre, respuesta;
		Object[] capitalesKeys;
		Object capitalPregunta, paisPregunta;
		int puntuacion=0;
		 
		System.out.println("Introduzca su nombre: ");
		nombre=sc.nextLine();
		capitalesKeys = capitales.keySet().toArray();
		 
		for(int i =0; i<10;i++) {
			paisPregunta = capitalesKeys[new Random().nextInt(capitalesKeys.length)];
			capitalPregunta = capitales.get(paisPregunta);
			System.out.println("¿Cual es la capital de "+paisPregunta+" ?");
			respuesta=sc.nextLine();
			System.out.println("Chivato: "+paisPregunta+" - "+(String)capitalPregunta);
			if(respuesta.equalsIgnoreCase((String)capitalPregunta)) {
				puntuacion++;
			}
		}
		sc.close();
		
		guardarDatos(nombre, puntuacion);
	}
	
	public static void guardarDatos(String nombre, int puntuacion) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
        	File f = new File("C:\\Users\\Miguel Angel\\Documents\\classificacio.txt");
        	if(!f.exists())
        		fichero = new FileWriter("C:\\Users\\Miguel Angel\\Documents\\classificacio.txt");
        	else fichero = new FileWriter("C:\\Users\\Miguel Angel\\Documents\\classificacio.txt",true);
            
        	pw = new PrintWriter(fichero);
            pw.println(nombre+" "+puntuacion);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {           
	           if (null != fichero)
	              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        } 
	}
}
