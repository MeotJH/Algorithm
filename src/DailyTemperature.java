import java.util.Scanner;

public class DailyTemperature {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("배열수를 입력해주세요");
        int temperatureLength = scanner.nextInt();

        int[] Arr = new int[temperatureLength];

        for(int i = 0 ; i < temperatureLength ; i++){

            Arr[i] = scanner.nextInt();
        }

        int[] day = new int[temperatureLength];

        for(int i = 0 ; i< temperatureLength ; i++){

            for(int j = 0 ; j< temperatureLength ; j++){

                if(i<j){

                    if( Arr[i] < Arr[j] ) {

                        day[i] = j - i;
                        break;

                    }else{
                        day[i] = 0;
                    }
                }

            }

        }

        for(int i = 0 ; i < temperatureLength ; i++) {

            System.out.print("|인덱스["+i+"]:"+day[i]);
        }

    }
}
/*Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait
until a warmer temperature. if there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures
T = [73, 74, 75, 71, 69, 72, 76 73]
your output should be[1, 1, 4, 2, 1, 1, 0, 0]

Note: the length of temperatures will be in the range[1,30000].
Each temperature will be an integer in the range [30, 100]
 */
