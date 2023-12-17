import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define a format for displaying the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

             Restaurants.Biryani a=new Restaurants.Biryani(2,true);

                a.menu();
        Restaurants.Pizza b=new Restaurants.Pizza(2,false);
            b.addToppings();
            b.addExtraCheese();
            b.menu();

        Restaurants.CholeBhature c=new Restaurants.CholeBhature (2,false);
            c.raita();
            c.menu();
            bill as=new bill( );
            as.bill(formattedDateTime);


            bill get =new bill();

            get.bill(formattedDateTime);

    }
}