import java.io.*;
import java.util.*;

public class SelectionSortinrec {
	public static void main(String[] args){
		int[] arr = {9,5,7,1,3,2,5,1};
		System.out.println(Arrays.toString(Sort(arr,0,0,arr.length-1)));
	}
	public static int[] Sort(int[] arr,int mxind,int ind,int lind){
		if(lind==0) return arr;
		if(ind<=lind){
			if(arr[mxind]<arr[ind]) return Sort(arr,ind,ind+1,lind);
			else return Sort(arr,mxind,ind+1,lind);
		}
		else{
			int tmp=arr[mxind];
			arr[mxind]=arr[lind];
			arr[lind]=tmp;
			return Sort(arr,0,0,lind-1);
		}
	}
}