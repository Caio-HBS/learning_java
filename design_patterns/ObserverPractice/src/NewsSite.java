import java.util.ArrayList;

public class NewsSite implements Subject {

    ArrayList<Observer> observers;
    private String sports;
    private String politics;
    private String world;

    public NewsSite() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        if (!observers.contains(newObserver)) {
            observers.add(newObserver);
        } else {
            System.out.println("DENIED: Observer is already in list.");
        }
    }

    @Override
    public void unregister(Observer deleteObserver) {
        if (observers.contains(deleteObserver)) {
            System.out.println("OK: User has been unregistered");
            observers.remove(deleteObserver);
        } else {
            System.out.println("DENIED: Observer is not in list.");
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer singleObserver : observers) {
            singleObserver.update(sports, politics, world);
        }
    }

    public void setSportsNews(String sportsNews) {
        this.sports = sportsNews;
        notifyObserver();
    }
    public void setPoliticsNews(String politicsNews) {
        this.politics = politicsNews;
        notifyObserver();
    }
    public void setWorldNews(String worldNews) {
        this.world = worldNews;
        notifyObserver();
    }
}
