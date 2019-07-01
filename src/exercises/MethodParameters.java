package exercises;

class Robot{
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void animals (String herbivore, String canivore) {
		System.out.println(herbivore + " and " + canivore + " are herbovores and canivores respectively.");
	}
}

public class MethodParameters {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hello, It is me.");
		
		sam.animals("Goat", "lion");
		
		String greetings = "Good morning";
		sam.speak(greetings);
	}
}
