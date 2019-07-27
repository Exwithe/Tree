package main;

import java.io.PrintStream;

public class TreeWriter {
  private PrintStream printStream;

  public TreeWriter(PrintStream printStream) {
    this.printStream = printStream;
  }

  public TreeWriter() {
    this(System.out);
  }

  public void printTree(int height) {
    for (int lineCount = 1; lineCount < height * 2; lineCount++) {
      int lineLength = height - Math.abs(lineCount - height);
      for (int charCount = 1; charCount <= lineLength; charCount++) {
        printStream.print("*");
      }
      printStream.println();
    }
  }
}
