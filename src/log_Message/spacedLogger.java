package log_Message;

public class spacedLogger implements Logger {

	@Override
	public String Log(String msg) {
		
		String result = "";
		for(char letter : msg.toCharArray()) {
			result += letter + " ";
		}
			
		return result.trim();
	}

	@Override
	public String Error(String msg) {
		String result = "";
		for(char letter : msg.toCharArray()) {
			result += letter + " ";
		}
		return "ERROR: " + result.trim();
	}

}
