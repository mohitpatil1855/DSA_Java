//Merge 2 sorted array

import java.util.Scanner;
class ArrayX {

    private int Arr[], Brr[], Crr[];
    private int iSize1, iSize2;

    public ArrayX(int iNo1, int iNo2) {
        iSize1 = iNo1;
        iSize2 = iNo2;
        Arr = new int[iSize1];
        Brr = new int[iSize2];
        Crr = new int[iSize1 + iSize2];
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter elements of First Array : ");
        for (iCnt = 0; iCnt < iSize1; iCnt++) {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter elements of Second Array : ");
        for (iCnt = 0; iCnt < iSize2; iCnt++) {
            Brr[iCnt] = sobj.nextInt();
        }
    }

    public void Merge2SortedArray() {

        int iCntCrr = 0;
        int iCntArr = 0, iCntBrr = 0;

        for (iCntCrr = 0; iCntCrr < (iSize1 + iSize2); iCntCrr++) {

            if (iCntArr < iSize1 && iCntBrr < iSize2) {         // Compare both arrays

                if (Arr[iCntArr] < Brr[iCntBrr]) {
                    Crr[iCntCrr] = Arr[iCntArr];
                    iCntArr++;
                } else {
                    Crr[iCntCrr] = Brr[iCntBrr];
                    iCntBrr++;
                }
            } else if (iCntArr < iSize1) // Only Arr has elements left
            {
                Crr[iCntCrr] = Arr[iCntArr];
                iCntArr++;
            } else { //                  //Only Brr has element left
                Crr[iCntCrr] = Brr[iCntBrr];
                iCntBrr++;
            }
        }

        // Display
        System.out.println("Merged Sorted Array:");
        for (int iCnt = 0; iCnt < Crr.length; iCnt++) {
            System.out.print(Crr[iCnt] + " ");
        }
    }

}

class Ques_2 {

    public static void main(String[] args) {

        ArrayX aobj = new ArrayX(5, 4);

        aobj.Accept();
        aobj.Merge2SortedArray();

    }
}