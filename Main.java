class MovieTicket {
String movieName;
double pricePerTicket;

    MovieTicket(String m, double p){
        movieName = m;
        pricePerTicket = p;
    }

double calculateTotalCost(int numberOfTickets){
    return pricePerTicket * numberOfTickets;
    }
}
public class Main {
    public static void main(String[] args) {
MovieTicket m1 = new MovieTicket("Ironlung", 8.50);
double result = m1.calculateTotalCost(2);
System.out.println("Total cost: $" + result);
    }
}