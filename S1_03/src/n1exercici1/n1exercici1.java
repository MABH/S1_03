package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class n1exercici1 {

	public static void main(String[] args) {
		Month mes;
		ArrayList<Month> meses = new ArrayList<Month>();
		mes=new Month("Enero");
		meses.add(mes);
		mes=new Month("Febrero");
		meses.add(mes);
		mes=new Month("Marzo");
		meses.add(mes);
		mes=new Month("Abril");
		meses.add(mes);
		mes=new Month("Mayo");
		meses.add(mes);
		mes=new Month("Junio");
		meses.add(mes);
		mes=new Month("Julio");
		meses.add(mes);
		mes=new Month("Septiembre");
		meses.add(mes);
		mes=new Month("Octubre");
		meses.add(mes);
		mes=new Month("Noviembre");
		meses.add(mes);
		mes=new Month("Diciembre");
		meses.add(mes);
		
		System.out.println("Lista sin el mes de Agosto");
		for(Month auxMes : meses) {
			System.out.println(auxMes.getName());
		}

		System.out.println("\nLista con el mes de Agosto");
		mes=new Month("Agosto");
		meses.add(7,mes);
		for(Month auxMes : meses) {
			System.out.println(auxMes.getName());
		}
		
		
		HashSet<Month> set = new HashSet<Month>(meses);
		
		mes=new Month("Agosto");
		set.add(mes);
		mes=new Month("Enero");
		set.add(mes);
		set.add(meses.get(3));
		System.out.println("\nSe añaden objetos nuevos con meses repetidos.\nSe añade el objeto repetido con indice 3 en la ArrayList 'meses': "+meses.get(3));
        
        System.out.println("\nLista convertida en HashSet sin objetos duplicados");
        for(Month auxMes : set) {
        	System.out.println(auxMes);
        }
        
        System.out.println("\nAunque se han insertado meses repetidos hay que tener en cuenta que para ello se han creado objetos de tipo 'Month' nuevos.");
	    for(Month auxMes : set) {
        	System.out.println(auxMes.getName());
        }
	    
	    System.out.println("\nLista recorrida con un Iterator:");
	    Iterator<Month> it = set.iterator();
	     while(it.hasNext()){
	        System.out.println(it.next().getName());
	     }
	}

}
