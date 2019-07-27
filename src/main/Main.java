package main;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    int height = 10;
    TreeWriter consoleTreeWriter = new TreeWriter();
    consoleTreeWriter.printTree(height);
    consoleTreeWriter.printTree(height + 1);

    TreeWriter fileTreeWriter = new TreeWriter(new PrintStream("./text.txt"));
    fileTreeWriter.printTree(height);
  }
}
