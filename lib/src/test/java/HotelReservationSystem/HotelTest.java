package HotelReservationSystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelTest {
	public Hotel lakewood, bridgewood, ridgewood;

    public void hotel() {
        lakewood = new Hotel("Lakewood", 110, 90);
        bridgewood = new Hotel("Bridgewood", 160, 60);
        ridgewood = new Hotel("Ridgewood", 220, 150);
    }
}