
import java.util.Scanner;

public class MeetingRoom {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int size    = scanner.nextInt();
        int start ;
        int end   ;

        int[][] array = new int[size][2];

        for( int i = 0 ; i < size ; i++){

            start   = scanner.nextInt();
            end     = scanner.nextInt();

                array[i][0] = start;
                array[i][1] = end;
        }




        System.out.println("어레이는="+array[1][1] );




    }
}
