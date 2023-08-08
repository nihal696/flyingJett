package com.flightreservation.model;

public class Reservation extends AbstractModel  {
	private Flight f;
	private long flightId;
	private int noOfBags;
	private boolean checkedIn;
	
	
	@Override
	public String toString() {
		return "Reservation [f=" + f + ", flightId=" + flightId + ", noOfBags=" + noOfBags + ", checkedIn=" + checkedIn
				+ "]";
	}
	
	
	public Flight getF() {
		return f;
	}
	public void setF(Flight f) {
		this.f = f;
	}
	public long getFlightId() {
		return flightId;
	}
	public void setFlightId(long flightId) {
		this.flightId = flightId;
	}
	public int getNoOfBags() {
		return noOfBags;
	}
	public void setNoOfBags(int noOfBags) {
		this.noOfBags = noOfBags;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}


	public void setPasssenger(Passenger p) {
		
		
	}
	
	
	
	

}
