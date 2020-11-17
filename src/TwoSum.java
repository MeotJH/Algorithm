import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Array 크기를 입력하세요");
        int x = scanner.nextInt();
        System.out.println("목표 값을 입력하세요");
        int target = scanner.nextInt();

        System.out.println("Array의 값을 입력하세요");
        int[] arr = new int[x];

        for(int i = 0 ; i < x ; i++){
            int an = scanner.nextInt();
            arr[i] = an;
        }

        int t = 0;
        int s = 0;
        int y = 0 ;

        while(s == 0){

            for( int i = 0 ; i< x ; i ++){

                if ( (arr[y] + arr[i]) == target) {

                    t = y;
                    s = i;
                    //System.out.println("내first:"+t+",내second:"+s);
                    break;
                }
            }
            y++;
        }
        System.out.println("first:"+t+",second:"+s);
    }
}
/* problem : Given an array of integers, return indieces of the two numberssuch that they add up to a specific target
             you may assume that each input would have exactly one solution, and you may not use the same element twice.

   Example : Given nums =[2,7,11, 15], target = 9,

   Because num[0] + num[1] = 2 + 7 = 9
   return [0,1]
 */