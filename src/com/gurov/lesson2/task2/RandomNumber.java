package com.gurov.lesson2.task2;
import java.util.Arrays;
import java.util.Scanner;

/*
    The law of distribution of random numbers is given.
    The program outputs a random number in the amount
    that indicates the weight of this number.
 */
public class RandomNumber {

    public static void main(String[] args) {

        RandomNumber app = new RandomNumber();
        app.Menu();//application start in method Menu
    }

    public static void Menu(){

        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of elements (from 1 to 10)");
            int kolElements = in.nextInt();
            if (kolElements < 1 || kolElements > 10){
                throw new Exception("Wrong! The number of elements must be from 1 to 10.");
            }
            int maxElementMas = 100;
            int[] masNumber = GenerateMas(kolElements,maxElementMas);
            maxElementMas = 10;
            int[] masWeight = GenerateMas(kolElements,maxElementMas);
            System.out.printf("Numbers massive: %s\n", Arrays.toString(masNumber));
            System.out.printf("Weights massive: %s\n", Arrays.toString(masWeight));
            OutputElement element = new OutputElement(masNumber,masWeight);
            Display(element);
            Display(element);
            Display(element);
            Display(element);
            Display(element);
            Display(element);
            Display(element);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    static int[] GenerateMas(int kolElements,int maxElementMas){//filling in the array

        int[] mas = new int[kolElements];
        for (int i=0;i<kolElements;i++){
            mas[i] = (int)(Math.random()*maxElementMas);
        }
        return mas;
    }

    static void Display(OutputElement element){

        System.out.printf("Random element: %d\n", element.DisplayElement());
    }
}
