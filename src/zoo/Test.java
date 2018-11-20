package zoo;

public class Test {


	    public static void main(String[] args) {

	        Zoo zoo = new Zoo(); 
	        Animal pop = new Volatile("Panachou", "Héron", Animal.ALIMENT_OMNIVORE);
	        zoo.addAnimalToZone(new Mammifere("Daktari", "Lion", Animal.ALIMENT_CARNIVORE));
	        zoo.addAnimalToZone(new Mammifere("Clodette", "Lion", Animal.ALIMENT_CARNIVORE));
	        zoo.addAnimalToZone(new Mammifere("Fifille", "Antilope", Animal.ALIMENT_HERBIVORE));
	        zoo.addAnimalToZone(new Mammifere("Zebrin", "Zèbre", Animal.ALIMENT_HERBIVORE));
	        zoo.addAnimalToZone(new Poisson("Mangetout", "Requin", Animal.ALIMENT_CARNIVORE));
	        zoo.addAnimalToZone(new Poisson("Marinette", "Morue", Animal.ALIMENT_CARNIVORE));
	        zoo.addAnimalToZone(new Reptiles("Rapacien", "Anaconda", Animal.ALIMENT_CARNIVORE));
	        zoo.addAnimalToZone(new Reptiles("Boate", "Boa", Animal.ALIMENT_CARNIVORE));
	        zoo.addAnimalToZone(new Volatile("Picorette", "Colibri", Animal.ALIMENT_OMNIVORE));
	        zoo.addAnimalToZone(pop);


	        
	        System.out.println(zoo.toString());
	    }
		
}


