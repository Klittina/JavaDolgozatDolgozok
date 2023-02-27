package dolgozok;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Dolgozok {

    FileReader fileReader = new FileReader("../txt/emberek.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String line;
    while ((line = bufferedReader.readLine()) != null) {
    
    }

    
//    public static void main(String[] args) {
//        try {
//      File myObj = new File("txt/emberek.txt");
//      Scanner myReader = new Scanner(myObj);
//      while (myReader.hasNextLine()) {
//        String data = myReader.nextLine();
//        System.out.println(data);
//      }
//      myReader.close();
//    } catch (FileNotFoundException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//  }

    
}
