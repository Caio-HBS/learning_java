public class UserSubscriber implements Observer {

    private String sports;
    private String politics;
    private String world;
    private Subject newsGrabber;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public UserSubscriber(Subject newsGrabber, String name) {
        this.newsGrabber = newsGrabber;
        setName(name);
        newsGrabber.register(this);
        System.out.println("New Observer registered: " + name + ".");
    }

    @Override
    public void update(String sports, String politics, String world) {
        this.sports = sports;
        this.politics = politics;
        this.world = world;

        printCurrentNews();
    }

    public void printCurrentNews() {
        System.out.println("\n---News for " + name.toUpperCase() + "---");

        if (sports != null) {
            System.out.println("Latest sports news: " + sports);
        }

        if (politics != null) {
            System.out.println("Latest politics news: " + politics);
        }

        if (world != null) {
            System.out.println("Latest world news: " + world);
        }
    }
}
