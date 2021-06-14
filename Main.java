package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array= {54,43,42,78,21,32,11,10};

        bucketsort(array);
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }

	// write your code here
    }

    public static void bucketsort(int[] input){
        List<Integer>[] buckets=new List[10];
        for(int i=0;i<buckets.length;i++){
            buckets[i]= new ArrayList<>();
        }

        for(int i=0;i<input.length;i++){
            buckets[hash(input[i])].add(input[i]);
        }

        for( List bucket: buckets){
            Collections.sort(bucket);

        }

        int j=0;
        for(int i=0;i<buckets.length;i++)
            for(int value: buckets[i])
                input[j++]=value;

    }

    public  static int hash(int value){
        return value/(int)10;
    }
}
