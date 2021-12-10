package ua.com.controller;

import ua.com.math.MathExc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);
    private final MathExc mathExc = new MathExc();

    public void run(){
        try {
            System.out.println("Hello in math application! Choose your option:");
            boolean startProgram = true;
            while (startProgram) {
                System.out.println("1 - first exc\n" +
                        "2 - second exc\n"+
                        "3 - third exc\n" +
                        "4 - fourth exc\n" +
                        "0 - exit");
                String choose = scanner.next();

                switch (choose){
                    case "1":
                        System.out.println("Enter starting speed: ");
                        double speed = scanner.nextDouble();
                        System.out.println("Enter angle: ");
                        double angle = scanner.nextDouble();
                        System.out.println("Answer in units or radians?\n" +
                                "Units - 1\n" +
                                "Radians - 2");
                            int ans = scanner.nextInt();
                            switch(ans){
                                case 1: System.out.println("Your answer: " + mathExc.getFlightDistanceDegree(speed,angle));
                                case 2: System.out.println("Your answer: " + mathExc.getFlightDistanceRad(speed,angle));
                                default:
                                    System.out.println("Incorrect input");
                            }
                      break;
                    case "2":
                        System.out.println("Enter first speed: ");
                       double speedOne = scanner.nextDouble();
                        System.out.println("Second speed: ");
                       double sppedTwo = scanner.nextDouble();
                        System.out.println("Second speed: ");
                        double initialDistance = scanner.nextDouble();
                        System.out.println("Enter distance: ");
                        double time = scanner.nextDouble();
                        System.out.println("Your answer: " + mathExc.getDistanceBtwCars(speedOne,sppedTwo, initialDistance, time));
                        break;
                        case "3":
                        System.out.println("Enter coordinate x: ");
                        double x = scanner.nextDouble();
                        System.out.println("Enter coordinate y: ");
                        double y = scanner.nextDouble();
                        System.out.println("Your answer: " + mathExc.findOutIfPointInFigure(x,y));
                        break;
                    case "4":
                        System.out.println("Enter your x: ");
                        double difX = scanner.nextDouble();
                        System.out.println("Your answer: " + mathExc.getValueOfExpressionTaskFour(difX));
                        break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Incorrect input!");
        }
    }


}
