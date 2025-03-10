// HotelBooking.java
// Problem: Create a HotelBooking class with attributes guestName, roomType, and nights.
// Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    
    // Default constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }
    
    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    
    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    
    // Method to display booking details
    public void displayBooking() {
        System.out.println("Hotel Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
    }
    
    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking paramBooking = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(paramBooking);
        defaultBooking.displayBooking();
        System.out.println();
        paramBooking.displayBooking();
        System.out.println();
        copyBooking.displayBooking();
    }
}
