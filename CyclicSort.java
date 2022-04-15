import java.io.*;
import java.util.*;

public class CyclicSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=0;i<n;i++){
			while(arr[i]!=i+1){
				int tmp=arr[i];
				arr[i]=arr[tmp-1];
				arr[tmp-1]=tmp;
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
		}
		System.out.println(Arrays.toString(arr));
	}
}