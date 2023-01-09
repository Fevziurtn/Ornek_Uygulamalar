
public class DatabaseLogger extends BaseLogger {
	@Override//baseloggerdan farklı bir şekilde...
	public void log(String message) {
		System.out.println("Logged to database: " + message);
	}
}
