package prototype.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Shared by Facebook";
    }
}
