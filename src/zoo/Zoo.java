package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private String nom;
	private int price;
	public  List <Zone> zones = new  ArrayList <Zone>();
	
	public Zoo(String nom, int price, List<Zone> zones) {
		this.nom = nom;
		this.price = price;
		this.zones = zones;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}
	
	public void addZone(Zone zone) {
		this.zones.add(zone);
	}
	
	
}
