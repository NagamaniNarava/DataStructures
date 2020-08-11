package com.crackingcodinginterview;

public class CodingameProblem1 {

	public static void main(String[] args) {
		int [] i = {7,5,9,1,4};
		System.out.println(computeClosestToZero(i));

	}
	
	public static int computeClosestToZero(int[] ts) {
        if(ts.length == 0) return 0;
        int NegMax = Integer.MIN_VALUE + 1;
        int posMin = Integer.MAX_VALUE;
        for(int i :ts){
            if(i<0){
                if(i>NegMax){
                    NegMax = i;
                }
            }
            else{
                if(i<posMin){
                   posMin = i; 
                }
            }
        }
        if(Math.abs(NegMax)< posMin)
        return NegMax;
        else
        return posMin;
    }

}
