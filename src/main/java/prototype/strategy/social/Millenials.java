package prototype.strategy.social;

public class Millenials extends User {
    public Millenials(String name) {
        super(name);
        this.setSocialPublisher(new FacebookPublisher());
    }
}
