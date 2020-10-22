import java.util.Scanner;
public class MergeSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Before Sorting........");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        mergeSort(a,0,n-1);
        System.out.println("After Sorting.........");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    public static void mergeSort(int[] a,int lb,int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid+1, ub);
            merge(a,lb,mid,ub);
        }
    }
    public static void merge(int[] a,int lb,int mid,int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int[] b = new int[a.length];
        while(i<=mid && j<=ub){
            if(a[i] >= a[j]){
                b[k]= a[j];
                j++;k++;
            }
            else{
                b[k] = a[i];
                j++;i++;
            }
        }
        while(j<=ub){
            b[k] = a[j];
            k++;j++;
        }
        while(i<=mid){
            b[k] = a[i];
            i++;k++; 
        }
        for(int l=lb;l<=ub;l++){
            a[l] = b[l];
        }
    }
}