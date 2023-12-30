package src;

import java.io.File;

public class ReadingTextFileUsingScanner {
    public static void main(String[] args) {
        /*
        Both declaration is correct either use / or \\ instead of \
        String path = "C:\\Users\\pravi\\IdeaProjects\\java_learning_1\\src";
        String path = "C:/Users/pravi/IdeaProjects/java_learning_1/src";
         */

        String fileName = "C:/Users/pravi/IdeaProjects/java_learning_1/src";
        File textFile = new File(fileName);

    }
}
