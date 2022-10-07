import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int b = in.nextInt();
        int a =1;
    while (b != x){
     a++;
        if (b >x ){
            System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            b = in.nextInt();
        }
        else{
            System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            b = in.nextInt();
        }

    }
        System.out.println("Загаданное число = " + x + "\nЧисло попыток = " + a);

    }
}