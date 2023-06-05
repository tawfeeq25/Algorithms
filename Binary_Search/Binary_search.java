import java.util.Scanner;//importing scanner package from java.util
public class Binary_search{
	//binary search algorithm
	static void search(int arr[],int k,int n)
	{
		int l=0;
		int r=n-1;
		int flag=0;
		while(l<=r){
				int m=(l+r)/2;
			if(arr[m]==k){
				flag=1;
				System.out.println(k+" element found at "+m);
				break;
			}
			else if(arr[m]<k){
				l=m+1;
			}
			else if(arr[m]>k){
				r=m-1;
			}
		}
		if(flag==0){
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("No.of.Element:");
		int n=inp.nextInt();//number of element
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=inp.nextInt();//storing element in array and the element should be in sorted manner
		}
		System.out.println("Element to be searched:");
		int k=inp.nextInt();//element to be searched
		search(arr,k,n);//calling search algorithm method
	}
}