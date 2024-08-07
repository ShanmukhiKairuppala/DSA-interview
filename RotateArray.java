import java.util.*;

public class RotateArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int k = input.nextInt();
        solve(arr,n,k);
    }

    public static void solve(int a[],int N, int K){
        int d = K%N;
        // int[] temp = new int[d];
        // for(int i=0;i<d;i++){
        //     temp[i]=a[i];
        // }
        // for(int i=d;i<N;i++){
        //     a[i-d]= a[i];
        // }

        // for(int i=N-d;i<N;i++){
        //     a[i]= temp[i-(N-d)];
        // }
       a= reverse(a,N,d);
       a=   reverse(a,d,N-1);
       a =   reverse(a,0,N-1);
       System.out.println(Arrays.toString(a));
    }
    public static int[] reverse(int arr[], int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}