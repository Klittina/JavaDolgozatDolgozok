package dolgozok;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dolgozok {
    
    
    public static void main(String[] args) {
//       try {
//        Scanner scanner = new Scanner(new File("emberek.txt"));
//        while (scanner.hasNextLine()) {
//        String line = scanner.nextLine();
//        System.out.println(line);
//    }
//    scanner.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
	BufferedReader reader;
                
                ArrayList<String> lineses = new ArrayList<>();
		try {
			reader = new BufferedReader(new FileReader("emberek.txt"));
			String line = reader.readLine();
                        int beolvasas = 0;
			while (line != null) {
                            //System.out.println(beolvasas);
                                if(beolvasas == 0){
				//System.out.println(line);
				// read next line
				line = reader.readLine();
                                }else{
				//System.out.println(line);
                                lineses.add(line);
				// read next line
				line = reader.readLine();
                                }
                                beolvasas++;
                                    
			}

			reader.close();
		} catch (IOException e) {
		}
                
                String[][][][] dolgozok = new String[lineses.size()][4][1][1];
                for (int i = 0; i < lineses.size(); i++) {
                String[] parts = lineses.get(i).split(";");
                for (int j = 0; j < 4; j++) {
                    dolgozok[i][j][0][0] = parts[j];
                }
        }
                
                for (int i = 0; i < lineses.size(); i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(dolgozok[i][j][0][0] + " ");
            }
            System.out.println();
        }
    }

  }

