package prototype.strategy.social;

import org.junit.Assert;
import org.junit.Test;
import strategy.social.*;

public class UserTestSuite {

    @Test
    public void testDefaultSharePostMethode() {
        //given
        User jessie = new Millenials("Jessie Pinkman");
        User john = new YGeneretion("John Week");
        User soul = new ZGeneration("Soul Goodman");
        //when
        String jessieShareMethode = jessie.sharePost();
        System.out.println("Jessie " + jessieShareMethode);
        String johnShareMethode = john.sharePost();
        System.out.println("John " + johnShareMethode);
        String soulShareMethode = soul.sharePost();
        System.out.println("Soul " + soulShareMethode);
        //then
        Assert.assertEquals("Shared by Facebook", jessieShareMethode);
        Assert.assertEquals("Shared by Snapchat", johnShareMethode);
        Assert.assertEquals("Shared by Twitter", soulShareMethode);
    }


    @Test
    public void testIndividualSharingMethode() {
        //given
        User jessie = new Millenials("Jessie Pinkman");
        //when
        String jessieShareMethode = jessie.sharePost();
        System.out.println("Jessie " + jessieShareMethode);
        jessie.setSocialPublisher(new SnapchatPublisher());
        jessieShareMethode = jessie.sharePost();
        System.out.println("Now Jessie " + jessieShareMethode);
        //then
        Assert.assertEquals("Shared by Snapchat", jessieShareMethode);
    }
}