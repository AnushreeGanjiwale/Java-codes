import java.util.Scanner;
public class Solution {
    public static void swap(int a[],int l,int r){
        int temp = a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void reverseArrayBetween(int a[],int l,int r){
        r--;
        int length=(r-l)/2;
        for(int m=0;m<=length;m++){
            swap(a,l,r);
            l++;
            r--;
        }
    }
public static void rotateRight(int a[],int x,int n){
    reverseArrayBetween(a,0,n);
    reverseArrayBetween(a,0,x);
    reverseArrayBetween(a,x,n);
}
    public static void rotateLeft(int a[],int x,int n){
        reverseArrayBetween(a,0,n);
        reverseArrayBetween(a,0,n-x);
        reverseArrayBetween(a,n-x,n);
    }
    public static int[] rotateArray(int []a, int x, String dir) {
        int n = a.length;
        x=x%n;
        if(x>0 && dir.equals("LEFT")){
            rotateLeft(a,x,n);
        }else if(x>0 && dir.equals("RIGHT")){
            rotateRight(a,x,n);
        }
        return a;
     
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int arr[]=new int[n];
            int x = sc.nextInt();
            String Dir = sc.next();
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
           int arr1[]= rotateArray(arr,x,Dir);
           for(int g=0;g<n;g++){
               System.out.print(arr[g]);
           }
      

        }
    }
}
