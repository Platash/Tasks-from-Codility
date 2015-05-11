/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumber;

import java.util.Arrays;

/**
 *
 * @author siobhan
 */
public class MissingNumber {
    private static int[] testArray = {1, 3, 5, 7, 11, 13, 15, 17, 19}; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        findMissingEl(testArray);
    }
    
    public static int findMissingEl(int[] ar) {
        int diff;
        if(ar[0]>= 0) {
            diff = Math.min(ar[1] - ar[0], ar[2] - ar[1]);
        } else {
            diff = Math.max(ar[1] - ar[0], ar[2] - ar[1]);
        }
       
            int actual = ar[ar.length / 2 - 1];
            int expected = ar[0] + (ar.length/2 - 1) * diff;
            if(actual == expected) {
                return getMissing(Arrays.copyOfRange(ar, ar.length / 2, ar.length - 1), diff);
            } else {
                return getMissing(Arrays.copyOfRange(ar, 0, ar.length / 2 - 1), diff);
            }
    }
    
    private static int getMissing(int[] ar, int diff) {
        if(ar.length > 4) {
            int actual = ar[ar.length / 2 - 1];
            int expected = ar[0] + (ar.length/2 - 1) * diff;
            if(actual == expected) {
                return getMissing(Arrays.copyOfRange(ar, ar.length / 2, ar.length - 1), diff);
            } else {
                return getMissing(Arrays.copyOfRange(ar, 0, ar.length / 2 - 1), diff);
            }
        }else {
            if(diff < 0) {
                return ar[0] - diff;
            } else {
                return ar[1] - diff;
            }
        } 
         
    }
    
}
