public class Cat {
	static int destroyedFurniture = 0;

	public static String meow (String name, String sound) {
		String catMeow = (name + " says " + sound);
		return catMeow;
	}

	public static String describeCat (String name, int age) {
		String describeCat = name + " is " + age + " years old";
		return describeCat;
	}

	public static String createFunnyStory (String name, String story) {
		String catStory = name + " has a story... " + story;
		return catStory;
	}

	public static String destroyFurniture () {
		destroyedFurniture++;
		String furnitureIsDestroyed = ("Total pieces of furniture destroyed: " + destroyedFurniture);
		return furnitureIsDestroyed;
	}

	public static String introduceCat (String name, int age, String story, int destroyedFurniture) {
		String catIsAwake = (name + " is awake.\n");

		String fullIntroduction = (catIsAwake + meow (name, "meow") + "\n" + meow (name, "purrr") + "\n" + describeCat (name, age) + "\n" + createFunnyStory (name, story) + "\n" + destroyFurniture () + "\n\n");
		return fullIntroduction;
	}

	public static void main (String[] args) {
		String winterStory = "Winter likes to hunt outside and frequently brings us animals as gifts.";
		String biscottiStory = "Biscotti is a cat!";

		//introduceCat("insertCatName", catAgeAsInt, catStoryAsString);
		System.out.println (introduceCat ("Winter", 5, winterStory, 4));
		System.out.println (introduceCat ("Biscotti", 3, biscottiStory, 1));
	}
}