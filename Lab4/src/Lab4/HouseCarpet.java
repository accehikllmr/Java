package Lab4;

public class HouseCarpet {
	
	// ADD MORE TEST CASES
	
	// double check how an Array object can be initialized
	private RoomDimension [] rooms;
	private double cost;
	
	// general class constructor
	public HouseCarpet(int c, double cost) {
		// validating argument passed to c parameter, should not be a negative value, default to 0 rooms
		this.rooms = (c >= 0) ? new RoomDimension [c] : new RoomDimension [0];
		// given that Array object has been instantiated, need to populate it with RoomDimension object (why not done by default?)
		for (int r = 0; r < this.rooms.length; r++) {
			// assigning new default RoomDimension object (see constructor), to Array object
			this.rooms[r] = new RoomDimension();
		}
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
	
	// initially forgot [], so argument passed was a single RoomDimension object instead of an Array object containing RoomDimension objects
	public void setRooms(RoomDimension [] rooms) {
		// for Array objects of equal length (no possible IndexErrors), simply overwrite current RoomDimension objects with new ones
		if (this.rooms.length == rooms.length) {
			for (int x = 0; x < rooms.length; x++) {
				this.rooms[x] = rooms[x];
			}
		} else {
			
			// IF ALIASING THIS ARRAY OBJECT TO ARGUMENT ARRAY OBJECT, IS THERE ISSUE IF LENGTHS DIFFER
			
			// might suffice for this method, need more test cases
			this.rooms = rooms;
		}
	}
	
	// class method which computes the cost of carpeting for each individual room, and stores these costs in an array
	public double [] getRoomCosts() {
		// initializing new Array object in which to store costs, length is equivalent to number of rooms in RoomDimension object
		double [] roomCosts = new double[this.rooms.length];
		// iterating through all RoomDimension objects to retrieve their area
		for (int i = 0; i < this.rooms.length; i++) {
			// retrieving area from each individual RoomDimension object, and multiplying it by cost of carpet
			roomCosts[i] = (this.rooms[i].getArea()) * this.cost;
		}
		return roomCosts;
	}
	
	// class method which computes the total cost of carpeting for all of the RoomDimension objects combined
	public double getCarpetCost() {
		// retrieving carpeting cost for each individual room, using above method
		double [] roomCosts = this.getRoomCosts();
		// initializing variable to store total cost
		double totalCost = 0.0;
		// iterating through Array object containing carpeting costs for each individual RoomDimension object
		for (int j = 0; j < roomCosts.length; j++) {
			totalCost += roomCosts[j];
		}
		return totalCost;
	}
	
	// class method which computes the total area of all rooms in the HouseCarpet class (could replace getRoomCosts method in $ computation)
	public double getTotalArea() {
		// initializing Double object to store sum of areas, does not work without initialization
		double totalArea = 0;
		// looping through each RoomDimension object to compute its area and compute total sum
		for (int a = 0; a < this.rooms.length; a++) {
			totalArea += this.rooms[a].getArea();
		}
		return totalArea;
	}

	// class method which determines for how many RoomDimension objects the Fan object is suitable
	public int isFanSuitable(Fan fan) {
		// initializing Integer object to store total number of rooms for which given Fan object is suitable
		int suitableCount = 0;
		// looping through rooms Array with RoomDimension objects to determine how many are suitable for given Fan object
		for (int s = 0; s < this.rooms.length; s++) {
			if (this.rooms[s].isFanSuitable(fan)) {
				suitableCount++;
			}
		}
		return suitableCount;
	}
	
	// class method which returns string representation of HouseCarpet class, including number of rooms, total area of rooms and carpeting cost
	public String toString() {
		return String.format("Total Rooms: %d, Total Area: %.1f, Total Carpet Cost: %.1f", this.rooms.length, this.getTotalArea(), this.getCarpetCost());
	}
}
