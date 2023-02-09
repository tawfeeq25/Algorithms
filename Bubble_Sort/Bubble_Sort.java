import java.util.*;
public class Bubble_Sort{
	static void Sort(int[] arr,int n){
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr[j+1]<arr[j]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("No.of.Element:");
		int n=inp.nextInt();//number of element
		int arr[]=new int[n];
		System.out.println("Enter the Elements to be sorted:");
		for(int i=0;i<n;i++){
			arr[i]=inp.nextInt();//element to be sorted
		}
		Sort(arr,n);
	}
}