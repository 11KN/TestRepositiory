import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OTT {

    public static boolean isOneTwoThree(int a, int b, int c){
        if(a < b && b < c){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("in.txt"));
            FileWriter fileWriter = new FileWriter("out.txt");

            int couter = 3;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            while (!isOneTwoThree(a, b, c)){
                a = b;
                b = c;
                c = scanner.nextInt();
                couter++;
            }
            fileWriter.write(couter + "");
            fileWriter.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
