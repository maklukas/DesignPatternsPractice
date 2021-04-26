package singleton;

import org.junit.*;

public class SettingsFileEngineTest {



    @BeforeClass
    public static void openSettingsFile() {
        SettingsFileEngine.getInstance().open("xd");
    }

    @AfterClass
    public static void closeSettingsFile() {
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //given
        //when
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("opened: " + fileName);
        //then
        Assert.assertEquals("xd", fileName);
    }

    @Test
    public void testLoadSettigns() {
        //given

        //when
        boolean result = SettingsFileEngine.getInstance().loadSettings();
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //given

        //when
        boolean result = SettingsFileEngine.getInstance().saveSettings();
        //then
        Assert.assertTrue(result);

    }
}