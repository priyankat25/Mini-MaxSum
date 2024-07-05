package com.kodnest.minimaxsum;

import java.util.Scanner;

public class MiniMaxSum {
	 public static void main(String args[] )  
	    {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int[] a = new int[size];

	        for(int i=0; i<a.length; i++){
	            a[i] = sc.nextInt();
	        }
	        sc.close();
	        
	        findMiniMaxSum(a);
	    }

	    public static void findMiniMaxSum(int[] a){
	        int max = 0;
	        int mini = 0;
	        for(int i=0; i<a.length-1; i++){
	            mini = a[i] + mini;
	        }
	        
	        for(int i=1; i<a.length; i++){
	            max = max + a[i];
	        }

	        System.out.println(mini + " " + max);
	    }
}