public class Cat {
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

	public static String destroyFurniture (int energy) {
		String furnitureIsDestroyed = ("Total pieces of furniture destroyed: " + energy);
		return furnitureIsDestroyed;
	}

	public static String introduceCat (String name, String sound, int age, String story, int energy) {
		String catIsAwake = (name + " is awake.\n");

		String fullIntroduction = (catIsAwake + meow (name, sound) + "\n" + describeCat (name, age) + "\n" + createFunnyStory (name, story) + "\n" + destroyFurniture (energy) + "\n\n");
		return fullIntroduction;
	}

	public static String classifyAge (int age) {
		if (0 <= age && age <= 1) {
			return "Kitten";
		}
		else if (2 <= age && age <= 10) {
			return "Adult";
		}
		else {
			return "Senior";
		}
	}

	public static String recommendActivity (int age, int energy) {
		if (1 <= energy && energy <= 3) {
			return "Low-energy activity (e.g., napping, bird watching)";
		}
		else if (4 <= energy && energy <= 6) {
			return "Moderate-energy activity (e.g., chasing a toy)";
		}
		else if (age > 10) {
			return "Moderate-energy activity (e.g., chasing a toy)";
		}
		else {
			return "High-energy activity (e.g., running, climbing)";
		}
	}
}