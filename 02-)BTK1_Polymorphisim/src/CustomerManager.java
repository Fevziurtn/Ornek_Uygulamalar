public class CustomerManager {
	private BaseLogger baseLogger;
	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}
	public void add() {
		System.out.println("Müsteri eklendi");
		this.baseLogger.log("log mesaji");
	}
}
