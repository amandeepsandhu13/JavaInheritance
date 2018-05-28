
/*
Program Name: RowHouse.java
	  Author: Amandeep Sandhu
        Date: Jan 9, 20183:47:46 PM
 Description:
 */
public class RowHouse extends Building
{
	
	private int numUnits;
	private int numBeds;
	private int numBaths;
	
	// to create RowHouse obj
	public RowHouse(double length, double width, int floors, int unit, int beds, int baths)
	{
		super("RowHouse", length, width, floors);
		this.numUnits = unit;
	  this.numBeds = beds;
	  this.numBaths = baths;
	}
	
	// used by RowHouse direct subclass
	public RowHouse(String type,double length, double width, int floors, int unit, int beds, int baths)
	{
		
		super("Apartment", length, width, floors);
		this.numUnits = unit;
	  this.numBeds = beds;
	  this.numBaths = baths;
		
	}
	
	public int getNumUnits() {
		return this.numUnits;
		
	}
	
	public int getNumBeds() {
		return this.numBeds;
		
	}
	
	public int getNumBaths() {
		return this.numBaths;
		
	}
	
	public void setNumUnits(int units) {
		this.numUnits = units;
	}
	
	public void setNumBeds(int beds) {
		this.numBeds = beds;
	}
	
	public void setNumBaths(int baths) {
		this.numBaths = baths;
	}
	
	/*Over-ride the getBuildingDetails( )
	for this class so that it will return all of the
	details about the RowHouse. */
	public void getBuildingDetails() {
		
		System.out.println("RowHouse which has "+ getNumUnits()  +" living units on one level.");
		System.out.println("Unit area: " + getArea() +" square feet on "+ getNumFloors() +" floor(s)");
		System.out.println("Total area of all units on one floor is " +getNumUnits()*getArea() +" square feet.");
		System.out.println("Number of bedrooms: " +getNumBeds() + " . Number of bathrooms " +getNumBaths() +"\n");
		
	}

	
	
	
	
	
	
}
