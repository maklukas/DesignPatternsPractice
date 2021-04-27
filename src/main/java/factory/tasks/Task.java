package factory.tasks;

public interface Task {
    String executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
