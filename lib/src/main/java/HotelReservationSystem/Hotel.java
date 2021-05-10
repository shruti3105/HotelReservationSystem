package HotelReservationSystem;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private double regularWeekdayRates;
    private double regularWeekendRates;

    public Hotel(String name, double regularWeekdayRates, double regularWeekendRates) {
        this.name = name;
        this.regularWeekdayRates = regularWeekdayRates;
        this.regularWeekendRates = regularWeekendRates;
    }

    public double getRegularWeekendRates() {
        return regularWeekendRates;
    }

    public void setRegularWeekendRates(double regularWeekendRates) {
        this.regularWeekendRates = regularWeekendRates;
    }

    public String getName() {
        return name;
    }

    public double getRegularWeekdayRates() {
        return regularWeekdayRates;
    }

    public void setRegularWeekdayRates(double regularWeekdayRates) {
        this.regularWeekdayRates = regularWeekdayRates;
    }
    private static List<Hotel> hotelList = new ArrayList<>();
    public static boolean addHotel(Hotel hotel) {
        if (hotel == null)
            return false;
        if (hotelList.contains(hotel))
            return false;
        hotelList.add(hotel);
        return true;
    }
    
    public static void main(String[] args) {
        addHotel(new Hotel("Lakewood", 110, 90));
        addHotel(new Hotel("Bridgewood", 160, 60));
        addHotel(new Hotel("Ridgewood", 220, 150));
}
    }