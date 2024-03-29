import java.text.DecimalFormat;
import java.util.Objects;

public class GetTheStock implements Runnable {

    private String stock;
    private double price;

    // Will hold reference to the StockGrabber object.
    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice) {
        // Store the reference to the stockGrabber object, so I can make calls to its methods.
        this.stockGrabber = stockGrabber;

        // startTime = newStartTime;  Not used to have variable sleep time.
        stock = newStock;
        price = newPrice;
    }

    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                // Sleep for 2 seconds.
                Thread.sleep(2000);

                // Use Thread.sleep(startTime * 1000); to make sleep time variable.
            } catch (InterruptedException e) {
            }

            // Generates a random number between -0.03 and 0.03.
            double randNum = (Math.random() * (.06)) - .03;

            // Formats decimals to 2 places.
            DecimalFormat df = new DecimalFormat("#.##");

            // Change the price and then convert it back into a double.
            price = Double.parseDouble(df.format((price + randNum)));

            if (Objects.equals(stock, "IBM")) ((StockGrabber) stockGrabber).setIBMPrice(price);
            if (Objects.equals(stock, "AAPL")) ((StockGrabber) stockGrabber).setAAPLPrice(price);
            if (Objects.equals(stock, "GOOG")) ((StockGrabber) stockGrabber).setGOOGPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println();
        }
    }
}