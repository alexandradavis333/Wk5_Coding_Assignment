package log_Message;

public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new asteriskLogger();
		System.out.println(asteriskLogger.Log("Hello"));
		System.out.println();
		System.out.println(asteriskLogger.Error("Hello"));
		
		
		Logger spacedLogger = new spacedLogger();
		System.out.println(spacedLogger.Log("Hello"));
		System.out.println();
		System.out.println(spacedLogger.Error("Hello"));
	}

}
