package com.rakuten;

public class AdditionOfElements {
        public static void main(String[] args) {
            double[] dinputArray1= new double[10];
            dinputArray1[0]=10.0;
            dinputArray1[1]=20.0;
            dinputArray1[2]=30.0;

            double[] dinputArray2= new double[10];
            dinputArray2[0]=20.0;
            dinputArray2[1]=50.0;
            dinputArray2[2]=30.0;
            dinputArray2[3]=70.0;
            dinputArray2[4]=80.0;
            int[] iSumArray= new int[10];

            for(int i=0;i<iSumArray.length; i++)
            {
                iSumArray[i]=(int) (dinputArray1[i]+dinputArray2[i]);
                if(iSumArray[i]!=0) {
                    System.out.println(iSumArray[i]);
                }
            }
        }
}
