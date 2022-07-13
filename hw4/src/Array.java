package hw4.src;



import java.sql.Time;
import java.util.Arrays;


public class Array {

    public static void basicArray()
    {
        //initialize new array type and give a range
        int[] nums = new int[50];
        for (int i = 0; i < 50; i++)
        {
            nums[i] = i + 1;//result add 1 to void array begin from 0
        }
        for (int i = 0; i < 50; i++)
        {
            nums[i] += 10;
        }
        System.out.println(Arrays.toString(nums));
    }


    //create time and print string method
    public static void timeToString(Time[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    //crate method
    public static void printElements(String[] str)
    {
        for (int i = 0; i < str.length; i++)
        {
            System.out.print(str[i]+"  ");
        }
    }

    //crate  method
    private static void printElements(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int x = 0; x < arr[0].length; x++)
                System.out.printf("%5d", arr[i][x]);
            System.out.println();
        }
    }
    //
    //

    public static void main(String[] args){

        String str[]={"first","second","third","fourth","fifth","sixth"
        ,"seventh","eighth","ninth","tenth"};
        printElements(str);

        Time arr[]={new Time(1745), new Time(345453), new Time(987879345)};
        timeToString(arr);

        // initialize new array type and give a range
        int[][] values = new int[10][20];

        System.out.println("number of rows: "+ values.length);
        System.out.println("number of cols: "+ values[0].length);
        printElements(values);






    }
}