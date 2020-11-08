package com.company;

public class ArrProd implements IFoldable{
    @Override
    public int fold(int[] arr) {
        int returnValue = 1;
        for (int i : arr)
            returnValue *= i;
        return returnValue;
    }
}
