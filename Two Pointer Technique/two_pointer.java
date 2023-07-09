import java.util.*;
//this technique is used to find pair in a array if the array is sorted
//in this problem the task is to find their exists a pair of element such that 
//their sum is equal to x
public class two_pointer {
    static void two_pointer_technique(int[] arr,int n,int x){
        int i=0;
        int j=n-1;
        int flag=-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                flag=0;
                break;
            }
            else if(arr[i]+arr[j]>x){
                j--;
            }
            else{
                i++;
            }
        }
        if(flag==0){
            System.out.println("the two pair element are"+i+" "+j);
        }
        else{
            System.out.println("there is no pair exists");
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
      System.out.println("Enter the sum");
      int x=inp.nextInt();
      two_pointer_technique(arr, n, x);
  }  
}
