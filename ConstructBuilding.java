
/*
Program Name: ConstructBuilding.java
	  Author: Amandeep Sandhu
        Date: Jan 9, 20184:12:40 PM
 Description:
 */
public class ConstructBuilding
{

	public static void main(String[] args)
	{
		
		
	Warehouse	w1 = new Warehouse(130.3, 67.2, 3,76.5,5);		
	IndustrialPlaza	in1 = new IndustrialPlaza(125.7, 50.2, 2,82.5,4,16,"manufacturing ");
	RowHouse	ro1 = new RowHouse(28.2,21.0,3,7,3,2);
	Apartment	apt1 = new Apartment(29.5,22.0,1,14,2,1,19);
		
	w1.getBuildingDetails();
	in1.getBuildingDetails();
	ro1.getBuildingDetails();
	apt1.getBuildingDetails();
		
	/*  System.out.println("\t\t ****************** \n");
	  

		RowHouse rowTest = new RowHouse(28.2,21.0,3,7,3,2);
		rowTest.getBuildingDetails();
		System.out.println("length "+rowTest.getLength());
		System.out.println("Width "+rowTest.getWidth());
		System.out.println("Floor "+rowTest.getNumFloors());
		System.out.println("Floor "+rowTest.getArea());
		
		
	  System.out.println("\t\t ****************** \n");*/
	  

		
		Building ware,ro,in,apt; /* defining building class object to allocate memory to 4 sub buildings */
			
		/* allocating memory to sub classes*/
		ware = new Warehouse(130.3, 67.2, 3,76.5,5);		
		in = new IndustrialPlaza(125.7, 50.2, 2,82.5,4,16,"manufacturing ");
		ro = new RowHouse(28.2,21.0,3,7,3,2);
		apt = new Apartment(29.5,22.0,1,14,2,1,19);
		
		
		Building [] buildingArray = new Building[4];  /* declare Base class array which hold 4 elements*/
		buildingArray[0] = ware;		
		buildingArray[1] = in;
		buildingArray[2] = ro;
	  buildingArray[3] = apt;
	  
	  System.out.println("\t\t My Building Empire \n");
	  System.out.println("\t\t ****************** \n");
	  
	  /* Loop to get details of 4 buildings*/
	  
	  for(int index = 0; index < buildingArray.length; index++)
	  {
	  	buildingArray[index].getBuildingDetails();
	  }
	  
	  System.out.println("\t\t\n Mutating the Apartment object: \n");
	  
		Apartment app = (Apartment)buildingArray[3]; /*  Object of apartment class*/
		
		/* To change value of apartment details*/
		app.setLength(29.5);
		app.setWidth(22.0);
		app.setNumUnits(18);
		app.setNumFloors(2);
		app.setNumLevels(25);
		app.setNumBeds(1);
		app.setNumBaths(1);
		
		/* print apartment building details*/
		app.getBuildingDetails();
	
		System.out.println("\t\t\n Analyzing each element of each building. \n");
		
		System.out.println("Type of building "+ware.getType());
		System.out.println("Unit length "+ware.getLength());
		System.out.println("Unit width "+ware.getWidth());
		System.out.println("Number of floors "+ware.getNumFloors());
		System.out.println("Area of this unit "+ware.getArea());
		System.out.println("Number of rooms in this unit "+((Warehouse) ware).getRooms());
		System.out.println("Storage space in this unit "+((Warehouse) ware).getPercentStorage());
		
		System.out.println("\n");
	
		System.out.println("Type of building "+in.getType());
		System.out.println("Unit length "+in.getLength());
		System.out.println("Unit width "+in.getWidth());
		System.out.println("Number of floors "+in.getNumFloors());
		System.out.println("Area of this unit "+in.getArea());
		System.out.println("Number of rooms in each unit "+((Warehouse) in).getRooms());
		System.out.println("Storage space in this unit "+((Warehouse) in).getPercentStorage());
		System.out.println("Number of units in this industrial plaza: "+((Warehouse) in).getRooms());
		System.out.println("This industrial plaza is designated for"+ ((IndustrialPlaza) in).getUsage() +"usage.");
		
		System.out.println("\n");
		
		System.out.println("Type of building "+ro.getType());
		System.out.println("Unit length "+ro.getLength());
		System.out.println("Unit width "+ro.getWidth());
		System.out.println("Number of floors in each unit: "+ro.getNumFloors());
		System.out.println("Area of each unit: "+ro.getArea());
		System.out.println("Number of bathrooms in each unit: "+((RowHouse) ro).getNumBaths());
		System.out.println("Number of bedrooms in each unit: "+((RowHouse) ro).getNumBeds());
		System.out.println("Number of units: "+((RowHouse) ro).getNumUnits());
		
		System.out.println("\n");
		
		
		System.out.println("Type of building "+apt.getType());
		System.out.println("Unit length "+apt.getLength());
		System.out.println("Unit width "+apt.getWidth());
		System.out.println("Number of floors in each unit: "+apt.getNumFloors());
		System.out.println("Area each unit: "+apt.getArea());
		System.out.println("Number of bathrooms in each unit: "+apt.getArea());
		System.out.println("Number of units on each level: "+((RowHouse) apt).getNumUnits());
		System.out.println("Number of levels in this apartment building: "+((Apartment) apt).getNumLevels());
		System.out.println("Number of parking spaces available: "+((Apartment) apt).getParkingSpaces()); 
		
		
	}

}
