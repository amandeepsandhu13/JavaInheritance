
/*
Program Name: Building.java
	  Author: Amandeep Sandhu
        Date: Jan 9, 20183:03:12 PM
 Description:
 */
public abstract class Building
{
		private String type; 
		private double length;
		private double width;
		private int numFloors;
		
		public Building(String type, double length,double width, int numFloors){
			
				this.type = type;
				this. length = length;
				this.width = width;
				this.numFloors = numFloors;
			
		}
		
		public String getType() {
			
			return this.type;
			
		}
	  
		public double getLength() {
			
			return this.length;		
			
		}
		
		public double getWidth() {
					
					return this.width;		
					
		}
		public int getNumFloors() {
			
			return this.numFloors;		
			
		}
		
		public void setLength(double length) {
			
			this.length = length;
		}
		
		public void setWidth(double width) {
			
			
			this.width = width;
								
		}
		public void setNumFloors(int numFloors) {
			
			this.numFloors = numFloors;
			
		}
		public double getArea() {
			
			System.out.println("length "+length +", width " +width +",Floors" +numFloors);
			return Math.round(((width * length) * numFloors)*10.0)/10.0;
									
		}
		public abstract void getBuildingDetails();
		
		
		
		

}
