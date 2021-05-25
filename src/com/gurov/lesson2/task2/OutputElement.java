package com.gurov.lesson2.task2;

import java.util.Arrays;

public class OutputElement {

    private int[] masNumber;
    private int[] masWeight;

    public OutputElement(int[] masNumber, int[] masWeight){

        this.masNumber = masNumber;
        this.masWeight = masWeight;
    }

    private int CreateElement(){

        int sumWeight = 0;
        int[] masLeftRange = new int[masNumber.length];
        for (int i=0;i < masNumber.length;i++){
            masLeftRange[i] = sumWeight;
            sumWeight += masWeight[i];
        }
        int randomNumber = (int)(Math.random()*(sumWeight-1));
        int indexElement = Arrays.binarySearch(masLeftRange,randomNumber);
        return masNumber[indexElement >= 0 ? indexElement : -indexElement - 2];
    }

    public int DisplayElement(){

        return CreateElement();
    }
}
