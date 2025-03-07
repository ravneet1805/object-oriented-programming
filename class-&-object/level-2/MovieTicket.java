
// 4. Create a MovieTicket class with attributes movieName, seatNumber, and price.
// Add methods to:
//   - Book a ticket (assign seat and update price).
//   - Display ticket details.

import java.util.Scanner;

public class MovieTicket {
    String movieName;
    int seatNumber; // -1 indicates no seat booked yet.
    double price;
    
    // Constructor to initialize movie ticket details (initially, no booking)
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1;
        this.price = 0.0;
    }
    
    // Method to book a ticket (assign seat number and update price)
    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }
    
    // Method to display ticket details
    public void displayTicket() {
        System.out.println("Movie Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        if(seatNumber != -1) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movie = in.next();
        MovieTicket ticket = new MovieTicket(movie);
        ticket.displayTicket();
        System.out.print("Enter seat number to book: ");
        int seat = in.nextInt();
        System.out.print("Enter ticket price: ");
        double price = in.nextDouble();
        ticket.bookTicket(seat, price);
        ticket.displayTicket();
    }
}
