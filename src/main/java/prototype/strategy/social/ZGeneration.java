package prototype.strategy.social;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.setSocialPublisher(new TwitterPublisher());
    }
}
