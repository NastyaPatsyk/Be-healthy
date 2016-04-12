import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void printNames(ArrayList<SeriousDisease> a) {
        for (int i=0 ; i<a.size() ; i++) {
            System.out.println(a.get(i).getName()) ;
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine() ;
            if(input.contains(" ")) throw new IOException();
            printNames(new App(input).getSeriousDisease());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
