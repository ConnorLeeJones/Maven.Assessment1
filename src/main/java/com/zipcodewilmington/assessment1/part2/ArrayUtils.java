package com.zipcodewilmington.assessment1.part2;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer count = 0;

        for (Object element: objectArray){
            if (element.equals(objectToCount)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> listArr = new ArrayList<>(Arrays.asList(objectArray));

        while (listArr.contains(objectToRemove)) {
            listArr.remove(objectToRemove);
        }
        Integer[] newArr = new Integer[listArr.size()];
        newArr = listArr.toArray(newArr);

        return newArr;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = objectArray[0];
        Integer most = 0;

        for (Object element : objectArray){
            if (ArrayUtils.getNumberOfOccurrences(objectArray, element) > most){
                most = ArrayUtils.getNumberOfOccurrences(objectArray, element);
                mostCommon = element;
            }
        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = objectArray[0];
        Integer least = (ArrayUtils.getNumberOfOccurrences(objectArray, objectArray[0]));

        for (Object element : objectArray){
            if (ArrayUtils.getNumberOfOccurrences(objectArray, element) < least){
                least = ArrayUtils.getNumberOfOccurrences(objectArray, element);
                leastCommon = element;
            }
        }
        return leastCommon;
    }


    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] newArr = new Object[objectArray.length + objectArrayToAdd.length];

        for (int i = 0; i < objectArray.length; i++){
            newArr[i] = objectArray[i];
        }

        for (int j = objectArray.length; j < newArr.length; j++){
            newArr[j] = objectArrayToAdd[j-objectArrayToAdd.length];
        }


        Integer[] intArray = Arrays.copyOf(newArr, newArr.length, Integer[].class);
        return intArray;
    }
}
