import java.util.ArrayList;

public interface User {
    String userid = null;
    String password = null;
    String gmail = null;

    void register();
    void signin();
}


public class GuestUser implements User {

    @Override
    public void register() {
        // Guest users do not register.
        System.out.println("Guest users cannot register.");
    }

    @Override
    public void signin() {
        // Guest users do not sign in.
        System.out.println("Guest users cannot sign in.");
    }

    public void searchFlight() {
        System.out.println("Searching flight...");
    }

    public void viewFlight() {
        System.out.println("Viewing flight details...");
    }

    public void getCurrencyConversion() {
        System.out.println("Fetching currency conversion rate...");
    }

    public void viewChatbot() {
        System.out.println("Accessing chatbot...");
    }

    public void chatWithChatbot() {
        System.out.println("Chatting with chatbot...");
    }
}


public class RegisteredUser implements User {
    String userid;
    String password;
    String gmail;

    @Override
    public void register() {
        System.out.println("Registering a new user...");
    }

    @Override
    public void signin() {
        System.out.println("Signing in as a registered user...");
    }

    public void readFlight() {
        System.out.println("Reading flight information...");
    }

    public void bookFlight() {
        System.out.println("Booking a flight...");
    }

    public void viewFlight() {
        System.out.println("Viewing flight details...");
    }

    public void getCurrencyConversion() {
        System.out.println("Getting currency conversion rate...");
    }

    public void manageBookings() {
        System.out.println("Managing bookings...");
    }

    public void answerResponse() {
        System.out.println("Responding to queries...");
    }
}


public class Admin {
    private String adminpass;
    private String adminid;

    public void addFlight() {
        System.out.println("Adding a new flight...");
    }

    public void removeFlight() {
        System.out.println("Removing a flight...");
    }

    public void updateFlight() {
        System.out.println("Updating flight details...");
    }

    public void getCurrencyConversionRate() {
        System.out.println("Fetching currency conversion rate...");
    }

    public void viewAll() {
        System.out.println("Viewing all data...");
    }

    public void handling() {
        System.out.println("Handling operations...");
    }
}


public class CurrencyConverter {
    public double convert(double amount, double rate) {
        return amount * rate;
    }
}


public class Chatbot {
    private String tool;

    public void answer(String question) {
        System.out.println("Answering: " + question);
    }

    public void question(String query) {
        System.out.println("Question: " + query);
    }
}


public class FlightTracker {
    private String trackerId;

    public void displayStatus(String flightId) {
        System.out.println("Displaying status for flight: " + flightId);
    }

    public void updateTime() {
        System.out.println("Updating flight time...");
    }
}
