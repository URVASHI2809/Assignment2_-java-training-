package com.rakuten;

public class MagicSquare {
    public static boolean isMagic(int [][] a){
        int sumd1=0, sumd2=0;
        for(int j=0;j<a.length;j++)
        {
            sumd1+=a[j][j];
            sumd2+=a[j][a.length-j-1];
        }
        for(int y=0;y<a.length;y++)
        {
            int rowsum=0,colsum=0;
            for(int h=0;h<a[y].length;h++)
            {
                rowsum+=a[y][h];
                colsum+=a[h][y];
            }
            if(rowsum!=colsum || colsum!=sumd1 ||sumd1!=sumd2)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat= {{2,7,6},{9,5,1},{4,3,8}};
        boolean ans=isMagic(mat);
        System.out.println(ans);
    }
}
