
/*
Program Name: IndustrialPlaza.java
	  Author: Amandeep Sandhu
        Date: Jan 9, 20183:40:57 PM
 Description:
 */
public class IndustrialPlaza extends Warehouse
{
	
	private int numUnits;
	private String usage;
	
	public IndustrialPlaza(double length, double width, int numFloors,
			double pStorage, int rooms, int units, String usage)
	{
		super("type",length, width, numFloors, pStorage, rooms);
		this.numUnits = units;
		this.usage = usage;
	}
	
	public int getNumUnits() {
		return numUnits;
		
	}
	
	public String getUsage() {
		return this.usage;
		
	}
	
	public void setNumUnits(int units) {
		
		this.numUnits = units;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	// total area
	public void getBuildingDetails() {
	
		 System.out.println("Building type: "+getType()+"\n Unit area: " +getArea() +" Square feet on "+ getNumFloors() +" floor(s)");	
		 System.out.println("Number of rooms : " +getRooms()+ " rooms with storage accounting for "+getPercentStorage() + "percent of the space.");
		 System.out.println("We have "+ getNumUnits() +" with a combined total area of "+ getArea()*getNumUnits() +" square feet.\r\n"
		 		+ "This Industrial Plaza is designated for manufacturing only.\r\n");
		 
	}


	
}
