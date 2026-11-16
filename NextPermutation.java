import java.util.*;
public class NextPermutation {
    public void NP( int[] A){
        int ind=-1;
        int n=A.length;
        for(int i=n-2;i>=0;i--){
            if(A[i]<A[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(A,0,n-1);
            return;
        }
        for(int i=n-1;i>ind;i--){
            if(A[i]>A[ind]){
                swap(A,i,ind);
                break;
            }
        }
        reverse(A,ind+1,n-1);
    }
    private void swap(int[] A,int i,int j){
          int temp=A[i];
          A[i]=A[j];
          A[j]=temp;
    }
    private void reverse(int[] A, int start,int end){
        while(start<end){
            swap(A,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] A = {2, 1, 5, 4, 3, 0, 0};
        NextPermutation obj = new NextPermutation();
        obj.NP(A);
        System.out.println(Arrays.toString(A));      

    }
}
