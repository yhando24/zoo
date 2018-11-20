package zoo;

import java.util.Arrays;

public class Zone extends Zoo{
	private String nom = null;
	private Animal [] animaux = null;



	public Zone(String nom) {

		this.nom = nom;
	}


	public Zone(String nomZoo, Zone [] zones, String nom) {
		super(nomZoo, zones);
		this.nom = nom;

	}

	
	
	

	public void addAnimal(Animal animal) {	
			if( animaux != null ) {
				Animal [] animauxTemp = new Animal [animaux.length+1];
				
				for(int i = 0 ; i<animaux.length; i++) {
					animauxTemp[i]=animaux[i];
				}
				animauxTemp[animauxTemp.length-1] = animal;
				
				animaux = animauxTemp;
				
			} else {
				Animal [] animaux = new Animal [1];
				animaux[0] = animal;
			}
	}
	
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}



	public Animal[] getAnimaux() {
		return animaux;
	}


	public void setAnimaux(Animal[] animaux) {
		this.animaux = animaux;
	}

	@Override
	public String toString() {
		
		return "Zone " + nom + ", " + Arrays.toString(animaux) + "\n\r";
	}





	

}
