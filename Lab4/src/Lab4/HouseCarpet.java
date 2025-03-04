package Lab4;

public class HouseCarpet {
	
	// double check how an Array object can be initialized
	private RoomDimension [] rooms;
	private double cost;
	
	// general class constructor
	public HouseCarpet(int c, double cost) {
		// validating argument passed to c parameter, should not be a negative value, default to 0 rooms
		this.rooms = (c >= 0) ? new RoomDimension[c] : new RoomDimension[0];
		// validating argument passed to cost parameter, should not be a negative value, default to cost of 0
		this.cost = (cost >= 0) ? cost : 0;
	}
	
	// accessor methods
	public RoomDimension [] getRooms() {
		return this.rooms;
	}
	
	public double getCost( ) {
		return this.cost;
	}
	
	// mutator methods
	public void setCost(double cost) {
		this.cost = (cost >= 0) ? cost : 0;
	}
	
	public void setRooms(RoomDimension rooms) {
		
	}
	
	// computes the cost of carpeting for each individual room, and stores these costs in an array
	public double [] getRoomCosts() {
		// initializing new Array object in which to store costs, length is equivalent to number of rooms in RoomDimension object
		double [] roomCosts = new double[this.rooms.length];
		// iterating through all RoomDimension objects to retrieve their area
		for (int i = 0; i < this.rooms.length; i++) {
			// retrieving area from each individual RoomDimension object, and multiplying it by cost of carpet
			roomCosts[i] = this.rooms[i].getArea() * this.cost;
		}
		return roomCosts;
	}
	
	// computes the total cost of carpeting for all of the RoomDimension objects combined
	public double getCarpetCost() {
		// retrieving carpeting cost for each individual room
		double [] roomCosts = this.getRoomCosts();
		// initializing variable to store total cost
		double totalCost = 0.0;
		// iterating through Array object containing carpeting costs for each individual RoomDimension object
		for (int j = 0; j < roomCosts.length; j++) {
			totalCost += roomCosts[j];
		}
		return totalCost;
	}
}
