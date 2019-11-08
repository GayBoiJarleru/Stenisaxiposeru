
import javax.swing.*;
import java.util.Random;
public class Stenisaxiposeru {

    public static void main(String[] args) {
        int a = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "1 eller 2"));

        int b = 1;
        int saxi = 0;
        int steni = 1;
        int poseru = 2;
        int val1 = 0;
        int rounds = 0;
        int apa = 3;


        if (a == b) {
            while (rounds <= apa) {
                Random rand = new Random();


                int rand_int1 = rand.nextInt(3);

                val1 = Integer.parseInt(JOptionPane.showInputDialog(null, "0 för saxi, 1 för steni, 2 för poseru"));

                System.out.println("Random Integers: " + rand_int1);
                rounds++;
            }
        }
    }
}
























