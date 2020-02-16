package com.company;

/*

0728 in descending order

Task: Write a program that enters 20 numbers from the keyboard and displays them in descending order.

Requirements:
1. The program should read 20 integers from the keyboard.
2. The program should output 20 numbers.
3. The main method should call the sort method.
4. The sort method should sort the passed array in descending order.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     int[] array = new int[20];
     for(int i=0; i<20; i++) {
         array[i] = Integer.parseInt(reader.readLine());
     }
     sort(array);
     for(int x : array) {
         System.out.println(x);
     }
    }
    public static void sort(int[] array) {
        for (int i=0; i < array.length; i++) {
            for (int j=0; j <array.length-1-i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}








