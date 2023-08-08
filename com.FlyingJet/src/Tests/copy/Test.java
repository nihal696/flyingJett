package Tests.copy;

import com.flightreservation.dao.ReservationDao;
import com.flightreservation.dao.ReservationDaoImp;
import com.flightreservation.model.Passenger;
import com.flightreservation.model.Reservation;

public class Test {

	public static void main(String[] args) {
		ReservationDao dao=new ReservationDaoImp ();
		Reservation reserv=new Reservation();
		Passenger p=new Passenger();
		p.setId(7860l);
		p.setFirstName("Baig");
		p.setMiddleName("nihal");
		p.setLastName("ahmed");
		p.setEmail("n@gmail.com");
		p.setPhone("9431984787");
		reserv.setPasssenger(p);
		reserv.setFlightId(1l);
		
		Reservation savedReserv=dao.bookFlight(reserv);
		System.out.println(dao.bookFlight(reserv));
		
		Reservation checkedInReserv=dao.checkIn(savedReserv.getId(),2);
		System.out.println(checkedInReserv);

	}

}
