public class Main {

	public static void main(String[] args) {
		int height = 20;
		int lineLength = 1;
		for (int lineCount = 0; lineCount < height * 2; lineCount++) {
			for (int charCount = 0; charCount < lineLength; charCount++) {
				System.out.print("*");
			}
			System.out.println();
			if (lineCount + 1 < height) {
				lineLength++;
			} else {
				lineLength--;
			}
		}
	}
}
