package exceptions;

import java.io.File;

public class TryCatch {
    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Sorry, an error has occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
