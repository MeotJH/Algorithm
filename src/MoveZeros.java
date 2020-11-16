import java.util.Scanner;

public class MoveZeros {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] moveZero =new int[x];
        int[] moveZero2 =new int[x];

        for(int i = 0 ; i<x ; i++){

            int y = sc.nextInt();
            moveZero[i] = y;

        }
        int y = 0;
        int z = x-1;
        for( int i = 0; i< x ; i ++){

            if(moveZero[i] != 0){
                moveZero2[y] = moveZero[i];
                y++;
            }else{
                moveZero2[z] = moveZero[i];
                z--;
            }
        }
        for(int i = 0 ; i < x ; i++){
            System.out.println("제로1="+moveZero[i]);
        }
        for(int i = 0 ; i < x ; i++){
            System.out.println("제로2="+moveZero2[i]);
        }


    }
}
// problem :Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements
// Example : input= {0,1,0,3,12} output {1,3,12,0,0}
// you must do this in-place without making a copy of array. Minimize the total number of operations
