import java.util.Random;
import java.util.Scanner;

public class moneta {
    public static void losowanie(){
        System.out.println("Co wybierasz? Orzel czy reszka?");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Random liczba = new Random();
        int los = liczba.nextInt(2);
        //System.out.println(los);
        if (los == 0 && text == "reszka"){
            System.out.println("Wygrales!");
        }else if (los == 1 && text == "orzel"){
            System.out.println("Wygrales!");
        }else System.out.println("Przegrales!");

    }
}
