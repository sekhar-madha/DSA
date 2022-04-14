import java.io.*;
import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
			int maxi=0;
			for(int j=0;j<n-i;j++){
				if(arr[maxi]<arr[j])maxi=j;
			}
			int tmp=arr[n-i-1];
			arr[n-i-1]=arr[maxi];
			arr[maxi]=tmp;
		}
		System.out.println(Arrays.toString(arr));
	}
}