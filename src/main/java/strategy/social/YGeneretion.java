package strategy.social;

public class YGeneretion extends User {
    public YGeneretion(String name) {
        super(name);
        this.setSocialPublisher(new SnapchatPublisher());
    }
}
