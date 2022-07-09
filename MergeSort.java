import java.io.*;
import java.util.*;
public class MergeSort{
	public static void main(String[] args){
		int[] arr= {8,3,5,2,7,9};
		System.out.println(Arrays.toString(Sort(arr)));
	}
	public static int[] Sort(int[] arr){
		if(arr.length==1) return arr;
		int mid=arr.length/2;

		int[] left = Sort(Arrays.copyOfRange(arr,0,mid));
		int[] right = Sort(Arrays.copyOfRange(arr,mid,arr.length));

		return Merge(left,right);
	}
	public static int[] Merge(int[] first,int[] second){
		int i=0,j=0,k=0;
		int[] ans= new int[first.length+second.length];

		while(i<first.length && j<second.length){
			if(first[i]<second[j]){
				ans[k]=first[i];
				i++;
			}
			else{
				ans[k]=second[j];
				j++;
			}
			k++;
		}
		while(i<first.length){
			ans[k]=first[i];
			k++;
			i++;
		}
		while(j<second.length){
			ans[k]=second[j];
			k++;
			j++;
		}
		return ans;
	}
}