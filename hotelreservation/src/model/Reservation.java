package model;

import java.util.Date;

public class Reservation {
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    @Override
    public String toString(){
        return "Customer:" + " Room:" + "\n Check-In-Date:" + checkInDate
                + " Check-Out-Date:" + checkOutDate;
    }
}
