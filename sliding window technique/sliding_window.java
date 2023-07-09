import java.util.*;
//the sliding window technique is used to reduce the nested loop
//the algorithm works like window technique 
//it just move toward the array from first to last
//by reducing the previous first element and adding the current last element to the sum
public class sliding_window {
    static void window(int[] arr,int n,int k){
        int max=0;
        int window=0;
        if(n<k){
            System.out.println(-1);
        }
        else{
            for(int i=0;i<k;i++){
                max+=arr[i];
            }
            window=max;
            for(int i=k;i<n;i++){
                window+=arr[i]-arr[i-k];
                if(window>max){
                    max=window;
                }
            }
            System.out.println(max);
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
        int k=inp.nextInt();
        window(arr, n, k);
    }
}
