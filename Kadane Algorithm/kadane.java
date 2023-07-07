import java.util.*;
//the algorithm is used to find the maximum sum of subarray in the array
public class kadane{
    static int max_sub_arr(int[] arr,int n){
        int max=arr[0];
        int sum=0;
        int neg=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                neg=0;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(neg==0){
                sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            }
            else {
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            
        }
        return max;
    }
     public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
		System.out.println("No.of.Element:");
		int n=inp.nextInt();//number of element
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=inp.nextInt();//storing element in array
		}
        System.out.println(max_sub_arr(arr,n));
     }
}