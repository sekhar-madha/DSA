import java.io.*;
import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
			Boolean sorted=true;
			for(int j=1;j<n-i;j++){
				if(arr[j]<arr[j-1]){
					int tmp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
		System.out.println(Arrays.toString(arr));
	}
}