package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	private String nom;
	private String typeTerrain;
	public  List <Animal> animaux = new  ArrayList <Animal>();
	
	
	public Zone(String nom, String typeTerrain, List<Animal> animaux) {
		this.nom = nom;
		this.typeTerrain = typeTerrain;
		this.animaux = animaux;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getTypeTerrain() {
		return typeTerrain;
	}


	public void setTypeTerrain(String typeTerrain) {
		this.typeTerrain = typeTerrain;
	}


	public List<Animal> getAnimaux() {
		return animaux;
	}


	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	public void addAnimal(Animal animal) {
		this.animaux.add(animal);
	}
}
