package singleton;

public class Logger {
    private static Logger loggerInstance;
    private String lastLog = "";
    private Logger() {
    }

    public String getLastLog() {
        return lastLog;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]" );
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

}
