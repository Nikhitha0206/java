import java.io.*;
import java.util.*;
class MergerSort
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        n=sc.nextInt();
        System.out.print("Enter the elments : ");
        int a[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Merge.SplitAndMerge(a,0,n-1,n);
        System.out.print("Sorted array: \n");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
class MergeSortDemo{
    public static void MergeSorting(int a[],int low,int mid,int high,int n){
        int i,j,k;
        int b[]=new int[n];
        i=low;
        j=mid+1;
        k=low;
        while(i<=mid&&j<=high){
            if(a[i]<=a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i<=mid){
            while(i<=mid){
                b[k]=a[i];
                i++;
                k++;
            }
        }
        else{
            while(j<=high){
                b[k]=a[j];
                j++;
                k++;
            }
        }
        for(k=low;k<=high;k++)
        a[k]=b[k];
    }
}
class Merge{
    public static void SplitAndMerge(int a[],int low,int high,int n){
        int mid;
        if(low<high){
            mid=low+(high-low)/2;
            Merge.SplitAndMerge(a,low,mid,n);
            Merge.SplitAndMerge(a,mid+1,high,n);
            MergeSortDemo.MergeSorting(a,low,mid,high,n);
        }
    }
}