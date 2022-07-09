import java.io.*;
import java.util.*;

public class MergeSort2{
	public static void main(String[] args){
		int[] arr={9,8,7,6,5,4,3,2,1};
		Sort(arr,0,arr.length);
		System.out.print(Arrays.toString(arr));
	}
	public static void Sort(int[] arr,int start,int end){
		if((end-start)==1) return;

		int mid=(start+end)/2;
		Sort(arr,start,mid);
		Sort(arr,mid,end);
		Merge(arr,start,mid,end);

	}
	public static void Merge(int[] arr,int s,int m,int e){
		int[] mix=new int[e-s];
		int i=s;
		int j=m;
		int k=0;
		while(i<m && j<e){
			if(arr[i]<arr[j]){
				mix[k]=arr[i];
				i++;
			}
			else{
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<m){
			mix[k]=arr[i];
			i++;
			k++;
		}
		while(j<e){
			mix[k]=arr[j];
			j++;
			k++;
		}
		k=0;
		while(k<mix.length){
			arr[s+k]=mix[k];
			k++;
		}
	}
}