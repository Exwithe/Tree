package main;

public class Main {
  public static void main(String[] args) {
    int height = 20;
    for (int lineCount = 1; lineCount < height * 2; lineCount++) {
      int lineLength = height - Math.abs(lineCount - height);
      for (int charCount = 1; charCount <= lineLength; charCount++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
