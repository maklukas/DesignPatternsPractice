package singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTest {

    @Test
    public void testGetLastLog() {
        //given
        //when
        String result = "Last Dance";
        Logger.getInstance().log(result);
        //then
        Assert.assertEquals(result, Logger.getInstance().getLastLog());
    }


}