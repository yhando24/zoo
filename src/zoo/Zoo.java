package zoo;

import java.util.Arrays;

public class Zoo {
	private String nom = "la paella";

	public Zone [] zones = new Zone [5];
	
	public static final int ZONE_CARNIVORE = 0;
	public static final int ZONE_AFRICAINE = 1;
	public static final int ZONE_REPTILE = 2;
	public static final int ZONE_AQUARIUM = 3;
	public static final int ZONE_PIzonne = 4;
	
	public Zoo() {
		zones[ZONE_CARNIVORE] = new Zone(nom, zones, "Zone Carnivore");
		zones[ZONE_AFRICAINE] = new Zone(nom, zones, "Zone Africaine");
		zones[ZONE_REPTILE] = new Zone(nom, zones, "Zone Reptile");
		zones[ZONE_AQUARIUM] = new Zone(nom, zones, "Zone Aquarium");
		zones[ZONE_PIzonne] = new Zone(nom, zones, "Zone PiGeon");
	}

	
	public Zoo(String nom, Zone [] zones) {
		this.nom = nom;
		this.zones = zones;
	}

	public void addAnimalToZone(Animal animal) {
		

	if( animal instanceof Mammifere) {
		if(animal.getRegimeAlimentaire().equals(animal.ALIMENT_CARNIVORE)){
			zones[ZONE_CARNIVORE].addAnimal(animal);
		}
		else if(animal.getRegimeAlimentaire().equals(animal.ALIMENT_HERBIVORE)){
			zones[ZONE_AFRICAINE].addAnimal(animal);
		}		
	}
	else if(animal instanceof Reptiles) {
		zones[ZONE_REPTILE].addAnimal(animal);
	}
	else if(animal instanceof Poisson) {
		zones[ZONE_AQUARIUM].addAnimal(animal);
	}
		
}
		
		
		

	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public Zone[] getZones() {
		return zones;
	}

	public void setZones(Zone[] zone) {
		this.zones = zone;
	}

	@Override
	public String toString() {
		return "le Zoo =>" + nom + ", zones=" + Arrays.toString(zones) ;
	}


	

}
