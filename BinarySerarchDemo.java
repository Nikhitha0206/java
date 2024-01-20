import java.io.*;
import java.util.*;
class BinarySearch{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,low,high,mid,key,pos=-1;
        System.out.println("Enter n: ");
        n=sc.nextInt();
        System.out.print("Enter elements: ");
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        low=0;
        high=n-1;
        System.out.print("Enter key: ");
        key=sc.nextInt();
        pos=BinarySearchDemo.Bs(a,n,low,high,key);
        if(pos==-1){
            System.out.println("Element "+key+" not found in the list");
        }
        else{
            System.out.println("Element "+key+" found at index"+pos);
        }
    }
}
class BinarySearchDemo{
    public static int Bs(int a[],int n,int low,int high,int key){
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]<key){
                low=mid+1;
            }
            if(a[mid]>key){
                high=mid-1;
            }
            if(a[mid]==key){
                return mid;
            }
        }
        return -1;
    }
}