package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("C:/Users/vitor/Desktop/poem.txt");
            writer.write("Roses are red \n violets are blue\n booty booty booty");
            writer.append("\n Poema by vitor xD");
            System.out.println("Complete");
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
