
/*
Program Name: Warehouse.java
	  Author: Aman Sandhu
        Date: Jan 9, 20183:21:43 PM
 Description:
 */
public class Warehouse extends Building
{

	private double percentStorage;
	private int numRooms;
	// to instantiate new warehouse 
	public Warehouse(double length,double width, int numFloors,double pStorage, int rooms) {
		
		super("Warehouse", length, width, numFloors);
		this.percentStorage = pStorage;
		this.numRooms = rooms;
				
	}
	
	// used in sub class
	public Warehouse(String type, double length, double width, int numFloors,double pStorage, int rooms)
	{
		super("Industrial Plaza", length, width, numFloors);
		this.percentStorage = pStorage;
		this.numRooms = rooms;
		
	}

	public double getPercentStorage() {
		return this.percentStorage;
		
	}
	
	public int getRooms() {
		
		return this.numRooms;
		
	}
	
	public void setPercentStorage(double pStorage) {
		
		this.percentStorage = pStorage;
		
	}
	
	public void setNumRooms(int rooms) {
		
		this.numRooms = rooms;
		
	}
	
	// to describe this building
	public void getBuildingDetails() {
		
	  System.out.println(" Building Type: "+ getType());	
	  System.out.println("Unit Area :"+ (double)Math.round((getArea()*100.0)/100.0)+ " square feet on 3 floor(s).");
		System.out.println("Number of rooms : " +getRooms()+ " rooms with storage accounting for "+getPercentStorage() + " percent of the space.\n");
		
	}
}
