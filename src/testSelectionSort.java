/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp1 = new SelectionSort();
        int[] sa1 = temp1.basicSelectionSort(arr);
        assertArrayEquals("Test positive failed", Sortedarr, sa1);
        System.out.println("Positive sorted array: " + Arrays.toString(sa1));
        
    }
    
    public void testNegative(){
        
    	int[] arrneg = new int[5];
        arrneg[0] = -8;
        arrneg[1] = -9;
        arrneg[2] = -7;
        arrneg[3] = -10;
        arrneg[4] = -2;
        
        int[] Sortedarrneg = new int[5];
        Sortedarrneg[0] = -10;
        Sortedarrneg[1] = -9;
        Sortedarrneg[2] = -8;
        Sortedarrneg[3] = -7;
        Sortedarrneg[4] = -2;
        
        SelectionSort temp2 = new SelectionSort();
        int[] sa2 = temp2.basicSelectionSort(arrneg);
        assertArrayEquals("Test Negative failed", Sortedarrneg, sa2);
        System.out.println("Negative sorted array: " + Arrays.toString(sa2));
    }
    
    public void testMixed(){
    	
    	int[] arrmixed = new int[5];
        arrmixed[0] = -8;
        arrmixed[1] = 9;
        arrmixed[2] = -7;
        arrmixed[3] = 10;
        arrmixed[4] = -2;
        
        int[] Sortedarrmixed = new int[5];
        Sortedarrmixed[0] = -8;
        Sortedarrmixed[1] = -7;
        Sortedarrmixed[2] = -2;
        Sortedarrmixed[3] = 9;
        Sortedarrmixed[4] = 10;
        
        SelectionSort temp3 = new SelectionSort();
        int[] sa3 = temp3.basicSelectionSort(arrmixed);
        assertArrayEquals("Test Negative #1 failed", Sortedarrmixed, sa3);
        System.out.println("Mixed sorted array: " + Arrays.toString(sa3));
    }
    
    public void testDuplicates(){
        
        int[] dupes = new int[5];
        dupes[0] = 1;
        dupes[1] = 1;
        dupes[2] = 1;
        dupes[3] = 1;
        dupes[4] = 1;
        
        SelectionSort temp4 = new SelectionSort();
        int[] sa4 = temp4.basicSelectionSort(dupes);
        assertArrayEquals("Test duplicates failed", dupes, sa4);
        System.out.println("Duplicate sorted array #1 : " + Arrays.toString(sa4));
    }


}