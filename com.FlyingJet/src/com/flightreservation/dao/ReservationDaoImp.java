package com.flightreservation.dao;

import java.util.HashMap;

import com.flightreservation.model.Flight;
import com.flightreservation.model.Reservation;

public class ReservationDaoImp implements ReservationDao {
	
	HashMap<Long,Flight> f1;
	HashMap<Long,Reservation> reservationss;
	long reservationId;

	public ReservationDaoImp() {
		reservationss=new HashMap<>();
		f1=new HashMap<>();
		Flight f=new Flight();
		f.setId(1l);
		f.setFlightNumber("786");
		f.setOperatingAirlines("kingFisher");
		f.setDepatureCity("mumbai");
		f.setArrivalCity("lucknow");
		f.setDateAndTime("9/11/2022");
		
	    f1.put(f.getId(),f);
	    
	    Flight fi=new Flight();
		fi.setId(1l);
		fi.setFlightNumber("786");
		fi.setOperatingAirlines("kingFisher");
		fi.setDepatureCity("mumbai");
		fi.setArrivalCity("lucknow");
		fi.setDateAndTime("9/11/2022");
	    f1.put(fi.getId(),fi);

	}

	@Override
	public Reservation bookFlight(Reservation reserv) {
		Flight f=f1.get(reserv.getClass());
		reserv.setF(f);
		reservationId=reservationId +1;
		reserv.setId(reservationId);
		reservationss.put(reservationId, reserv);

		return reserv;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
		Reservation reserv=reservationss.get(reservationId);
		reserv.setNoOfBags(noOfBags);
		reserv.setCheckedIn(true);
		
		return reserv;
	}

}
