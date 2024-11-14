package logic;

public class CardDirect {
	
	String north, east, south, west, northEast, northWest, southEast, southWest;
	
	public CardDirect() {
		super();
	}
	
	public CardDirect(String north, String northEast, String east, String southEast, String south, String southWest,  String west,  String northWest) {
		this.north = north;
		this.northEast = northEast;
		this.east = east;
		this.southEast = southEast;
		this.south = south;
		this.southWest = southWest;
		this.west = west;
		this.northWest = northWest;
	}

	public String getNorth() {
		return north;
	}

	public void setNorth(String north) {
		this.north = north;
	}

	public String getEast() {
		return east;
	}

	public void setEast(String east) {
		this.east = east;
	}

	public String getSouth() {
		return south;
	}

	public void setSouth(String south) {
		this.south = south;
	}

	public String getWest() {
		return west;
	}

	public void setWest(String west) {
		this.west = west;
	}

	public String getNorthEast() {
		return northEast;
	}

	public void setNorthEast(String northEast) {
		this.northEast = northEast;
	}

	public String getNorthWest() {
		return northWest;
	}

	public void setNorthWest(String northWest) {
		this.northWest = northWest;
	}

	public String getSouthEast() {
		return southEast;
	}

	public void setSouthEast(String southEast) {
		this.southEast = southEast;
	}

	public String getSouthWest() {
		return southWest;
	}

	public void setSouthWest(String southWest) {
		this.southWest = southWest;
	}
	
	
	
}
