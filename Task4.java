//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner Scaner = new Scanner(System.in, "cp866");
        String s = Scaner.nextLine();
        if (s.length() == 0)
            throw new RuntimeException("Пустые строки вводить нельзя!");
        Scaner.close();
    }
}
