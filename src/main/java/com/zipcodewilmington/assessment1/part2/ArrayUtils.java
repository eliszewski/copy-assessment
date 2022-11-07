package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        int counter = 0;
        for (Object obj: objectArray
             ) {
            if(obj.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Object[] objectArray, Object objectToRemove) { // had to change expected return to Interger[] was getting casting error
        //Object[] nArr = new Object[objectArray.length - getNumberOfOccurrences(objectArray, objectToRemove)];
        List<Object> ao = new ArrayList<>();
        List<Object> ob = Arrays.asList(objectArray);
        for(int i = 0; i <ob.size(); i++){
            if(ob.get(i) != (objectToRemove)){
               ao.add(objectArray[i]);
            }
        }
        Integer[] n = ao.toArray(ao.toArray(new Integer[0]));
        return n;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        int highestOcc = 0;
        Object highestOb = objectArray[0];
        for(int i = 1; i < objectArray.length; i++){
            if(getNumberOfOccurrences(objectArray,objectArray[i]) > highestOcc){
                highestOb = objectArray[i];
                highestOcc = getNumberOfOccurrences(objectArray,objectArray[i]);
            }
        }
        return highestOb;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        int lowestOcc = getNumberOfOccurrences(objectArray, objectArray[0]);
        Object lowestOb = objectArray[0];
        for(int i = 1; i < objectArray.length; i++){
            if(getNumberOfOccurrences(objectArray,objectArray[i]) < lowestOcc){
                lowestOb = objectArray[i];
                lowestOcc = getNumberOfOccurrences(objectArray, objectArray[i]);
            }
        }
        return lowestOb;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) { //changed return type to Integer array to avoid casting errors.
       ArrayList<Integer> combo = new ArrayList<>();
        for(int i = 0;i < objectArray.length; i++){
            combo.add(objectArray[i]);
        }
        for(int i = 0;i < objectArrayToAdd.length; i++){
            combo.add(objectArrayToAdd[i]);
        }
        Integer[] combos = combo.toArray(new Integer[0]);
        return combos;
    }
}
