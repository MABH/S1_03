package n2exercici2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Restaurant {	
	private String nom;
	private int puntuacio;
	
	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant restaurant = (Restaurant) o;
        return (nom.equals(restaurant.nom) && puntuacio==restaurant.puntuacio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
    
}