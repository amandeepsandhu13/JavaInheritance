
/*
Program Name: Apartment.java
	  Author: Amandeep Sandhu
        Date: Jan 9, 20184:02:01 PM
 Description:
 */
public class Apartment extends RowHouse
{

	private int numLevels;
	private int parkingSpaces;
	
	public Apartment(double length, double width, int floors, int unit, int beds,
			int baths, int levels)
	{
		
		super("Apartment",length, width, floors, unit, beds, baths);
		
		this.numLevels = levels;	
	}

  public int getNumLevels() {
		
  	return this.numLevels;
  	
  }
	
  public int getParkingSpaces() { //parking space calculation one extra space for every 4 units
		
  	return (this.getNumLevels() * this.getNumUnits()) + ((this.getNumLevels() * this.getNumUnits())/4) ;
  	
  }
  
  public void setNumLevels(int levels) {
  	
  	this.numLevels = levels;
  }
  
  public void setNumParkingSpaces(int spaces) {
  	this.parkingSpaces = spaces;
  }
  
  public void getBuildingDetails() {
  	
  	System.out.println("Building Type: Apartment which has "+ getNumUnits() +" living units on one level.\r\n" + 
  			"Unit Area: "+ getArea() +" square feet on "+ getNumFloors() +" floor(s).\r\n" + 
  			"Total area of all units on one floor is "+ getArea() * getNumLevels()  +" square feet.\r\n" + 
  			"Number of bedrooms: " +getNumBeds() + " . Number of bathrooms " +getNumBaths() +"\r\n" + 
  			"This Apartment building has "+ getNumLevels() +" levels for a total number of "+ getNumLevels() * getNumUnits() + " units.\r\n" + 
  			"This complex has "+ getParkingSpaces() +" parking spaces available.\r\n");
  	
  }
	


}
