import java.util.Scanner;//importing scanner package from java.util
public class linear_search{
	//linear search algorithm
	static void search(int arr[],int k,int n)
	{
		//setting flag variable to check element is exist are not
		int flag=0;
		//checking each element in array
		for(int i=0;i<n;i++){
			if(arr[i]==k){
				//if the element is found the flag is set 1 and break the loop
				System.out.println(k+" is found at "+i);
				flag=1;
				break;
			}
		}
		//if element not found
		if(flag==0){
			System.out.println("Element not Found");
		}
	}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("No.of.Element:");
		int n=inp.nextInt();//number of element
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=inp.nextInt();//storing element in array
		}
		System.out.println("Element to be searched:");
		int k=inp.nextInt();//element to be searched
		search(arr,k,n);//calling search algorithm method
	}
}