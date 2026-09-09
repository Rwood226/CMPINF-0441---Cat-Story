public class Cat {

	static String catName = "Winter";

	public static void meow (String sound) {
		System.out.println (catName + " says " + sound);
	}

	public static String describeCat (String name, int age) {
		String describeCat = name + " is " + age + " years old";
		return describeCat;
	}

	public static String createFunnyStory (String name, String story) {
		String catStory = name + " has a story... " + story;
		return catStory;
	}

	public static void main (String[] args) {
		System.out.println (catName + " is awake.\n");

		meow ("meow");
		meow ("purrr");

		describeCat (catName, 3);
		describeCat ("Winter", 5);

		createFunnyStory ("Winter", "Winter likes to hunt outside and frequently brings us animals as gifts.");
	}
}