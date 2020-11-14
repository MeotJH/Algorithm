
import java.util.ArrayList;
import java.util.Arrays;
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

        Arrays.sort(array, ((o1, o2) -> {
            if (o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            }else{
                return Integer.compare(o1[0], o2[0]);
            }
        }));

        int x = 0;
        while(true){

            if(x >= size ){
                System.out.println("true");
                break;
            }

            if(array[0][1] >array[x][0]){
                System.out.println("false");
                break;
            }

            x++;

        }
        //System.out.println(array[0][0]);

    }
}
