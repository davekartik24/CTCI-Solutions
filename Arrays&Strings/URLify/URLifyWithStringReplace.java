

public class URLifyWithStringReplace{

	public String replace(String input) {

		return input.trim().replace(" ", "%20");
	}

	public static void main(String[] args) {

		URLifyWithStringReplace testInstance = new URLifyWithStringReplace();

		System.out.println(testInstance.replace("Mr John Smith    "));


	}
}