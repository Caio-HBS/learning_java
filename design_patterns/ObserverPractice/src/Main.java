public class Main {
    public static void main(String[] args) {
        NewsSite nyt = new NewsSite();

        new UserSubscriber(nyt, "Caio");
        new UserSubscriber(nyt, "John");

        nyt.setSportsNews("Thrilling match sets new records as both teams showcase remarkable skill.");
        nyt.setPoliticsNews("Key developments unfold as leaders engage in intense deliberations to address the future.");
        nyt.setWorldNews("Global concerns escalate as international leaders collaborate to tackle urgent challenges.");

        nyt.setSportsNews("This should change the previous text in this space.");

        System.out.println("\n\n-----------------------------------------TESTS-----------------------------------------\n\n");

        NewsSite nbc = new NewsSite();

        System.out.println("The following line should register two new users (Karen and Erik):");
        UserSubscriber karen = new UserSubscriber(nyt, "Karen");
        UserSubscriber erik = new UserSubscriber(nbc, "Erik");

        System.out.println("\nThe following line should be an error (user already in list):");
        nbc.register(erik);

        System.out.println("\nThe following line should be accepted (user unregistered):");
        nbc.unregister(erik);

        System.out.println("\nThe following line should be an error (user not on list):");
        nbc.unregister(karen);
    }
}