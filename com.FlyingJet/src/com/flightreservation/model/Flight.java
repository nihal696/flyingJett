package com.flightreservation.model;

public class Flight extends AbstractModel {
	private String flightNumber;
	private String operatingAirlines;
	private String depatureCity;
	private String arrivalCity;
	private String dateAndTime;
	
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirlines=" + operatingAirlines + ", depatureCity="
				+ depatureCity + ", arrivalCity=" + arrivalCity + ", dateAndTime=" + dateAndTime + "]";
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepatureCity() {
		return depatureCity;
	}

	public void setDepatureCity(String depatureCity) {
		this.depatureCity = depatureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	
	
	
	

}
