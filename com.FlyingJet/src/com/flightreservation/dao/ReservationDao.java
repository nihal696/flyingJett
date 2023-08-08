package com.flightreservation.dao;

import com.flightreservation.model.Reservation;

public interface ReservationDao {
	Reservation bookFlight(Reservation reserv);
	
	Reservation checkIn(long reservationId,int noOfBags);


}
