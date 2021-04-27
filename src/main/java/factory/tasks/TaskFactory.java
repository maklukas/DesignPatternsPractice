package factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shop", "Something", 5);
            case PAINTING:
                return new PaintingTask("Paint", "Blue", "Table");
            case DRIVING:
                return new DrivingTask("Drive", "Somewhere", "Volvo");
            default:
                return null;
        }
    }
}
