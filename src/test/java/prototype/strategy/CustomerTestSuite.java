package prototype.strategy;


import org.junit.Assert;
import org.junit.Test;
import strategy.*;

public class CustomerTestSuite {

    @Test
    public void testDefaultInvestingStrategies() {
        //given
        Customer steve = new IndividualCustomer("Steve Jobs");
        Customer john = new IndividualYoungCustomer("John Travolta");
        Customer anna = new CorporateCustomer("Anna Maria Wesołowska");
        //when
        String steveShouldBuy = steve.predict();
        System.out.println("Steve should: " + steveShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String annaShouldBuy = anna.predict();
        System.out.println("Anna should: " + annaShouldBuy);
        //then
        Assert.assertEquals("[Conservative predictor] Buy debentures of XYZ", steveShouldBuy);
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        Assert.assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", annaShouldBuy);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //given
        Customer walter = new IndividualCustomer("Walter White");
        //when
        String walterShouldBuy = walter.predict();
        System.out.println("Walter should: " + walterShouldBuy);
        walter.setBuyPredictor(new AggressivePredictor());
        walterShouldBuy = walter.predict();
        System.out.println("Walter should now: " + walterShouldBuy);
        //then
        Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", walterShouldBuy);

    }
}