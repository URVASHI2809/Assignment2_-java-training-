package com.rakuten;

public class RowMagic {
    public static boolean isRowmagic(int[][] A)
    {
        int i=0;int[] temp=new int[10];
        for( i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=0;j<A[i].length;j++)
            {
                sum=sum+A[i][j];
            }
            temp[i]=sum;
        }
        if(temp[i-A.length]==temp[i-(A.length-1)]){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args)
    {
        int[][] A= {{1,2,3},{1,2,3}};
        boolean ans= isRowmagic(A);
        System.out.println(ans);
    }
}

