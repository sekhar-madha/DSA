import java.util.*;
public class InsertionSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				if(arr[i]<arr[j]){
					int tmp=arr[j];
					arr[j]=arr[i];
					arr[i]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}