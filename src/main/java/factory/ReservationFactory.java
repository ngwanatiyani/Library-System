/* ReservationFactory.java
   Reservation factory class
   
*/
//Abulele Ntwanambi 218276400
package factory;


import domain.Reservation;
import java.time.LocalDate;

public class ReservationFactory
{
    public static Reservation createReservation(String reservationID, LocalDate date, String status) {

        if (reservationID == null || date == null || status == null) {
            return null;
        }
        return new Reservation.Builder()
                .setReservationID(reservationID)
                .setDate(date)
                .setStatus(status)
                .build();

    }
}


