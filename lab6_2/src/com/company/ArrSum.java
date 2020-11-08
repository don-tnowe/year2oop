package com.company;

public class ArrSum implements IFoldable{
    @Override
    public int fold(int[] arr) {
        int returnValue = 0;
        for (int i : arr)
            returnValue += i;
        return returnValue;
    }
}
