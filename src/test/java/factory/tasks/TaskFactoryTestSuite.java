package factory.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        //then
        assertEquals("Shop", shopping.getTaskName());
    }

    @Test
    public void testPaintingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        //then
        assertEquals("Paint", painting.getTaskName());
    }

    @Test
    public void testDrivingTask() {
        //given
        TaskFactory factory = new TaskFactory();
        //when
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        //then
        assertEquals("Drive", driving.getTaskName());
    }
}