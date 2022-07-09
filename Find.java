import java.io.*;
import java.util.*;

public class Find {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= {1,2,3,4,4,5};
		int tar=4;
		System.out.println(Findtar(arr,tar,0));
	}
	public static ArrayList<Integer> Findtar(int[] arr,int tar,int ind){
		ArrayList<Integer> list=new ArrayList<>();
		if(ind==arr.length) return list;
		else if(arr[ind]==tar){
			list.add(ind);
		}

		ArrayList<Integer> frombelow= Findtar(arr,tar,ind+1);

		list.addAll(frombelow);
		return list;
	}
}