package ua.com;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Hello! Choose your figure! From 1-9 and 0 for exit");
        String chose = scanner.next();


    }

    private void showArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
