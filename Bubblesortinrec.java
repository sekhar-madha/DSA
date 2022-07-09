import java.io.*;
import java.util.*;

public class Bubblesortinrec {
	public static void main(String[] args){
		int[] arr = {4,2,3,5,6,4,8,9,6,10,22,5,3,7,1};
		System.out.println(Arrays.toString(Sort(arr,arr.length,0)));
	}
	public static int[] Sort(int[] arr,int len,int ind){
		if(len==0) return arr;
		if(ind < (len-1)){
			if(arr[ind]>arr[ind+1]){
				int tmp=arr[ind];
				arr[ind]=arr[ind+1];
				arr[ind+1]=tmp;
			}
			return Sort(arr,len,ind+1);
		}
		else{
			return Sort(arr,len-1,0);
		}
	}
}