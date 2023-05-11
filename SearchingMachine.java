//SearchingMachine.java

/**
 * The searching machine fills an array with random numbers and
 * searches through the array for a value using both
 * linear search and binary search
 *
 * @author (Jake Tawney) 
 * @version (1.0)
 */

import java.util.Random;
import java.util.Arrays;

public class SearchingMachine
{
    static Random randomGenerator = new Random();

    public static void fillArray(int[] data){
        for(int i=0; i<data.length; i++){
            data[i] = randomGenerator.nextInt();
        }
    }

    public static boolean linearSearch(int[] data, int value){
        for (int x : data){
            if (x == value){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] data, int value){
        int high = data.length-1;
        int low = 0;
        while (high > low){
            int mid = (high+low)/2;
            if (data[mid] == value){
                return true;
            }
            else if (data[mid] > value){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
    //Okay, let's use these methods
    public static void main(String[] args){

        int size = 1000000000;           //Size of random array made.
        int[] A = new int[size];
        fillArray(A);
        Arrays.sort(A);         //uses a built in sorting algorithm to quickly sort.
        //Search for a value that is likely not in the array
        double avgTime1 = 0;
        double avgTime2 = 0;
        double avgTime3 = 0;
        int numSearch = 100;    //number of times to run your search to get an average.
        for (int i = 0; i < numSearch; i++){
            int searchValue = randomGenerator.nextInt();
            Stopwatch s1 = new Stopwatch(); 
            boolean isThere = binarySearch(A, searchValue);
            avgTime1 += s1.elapsedTime();
            //System.out.println(searchValue + ": " + isThere);
            //Search for a value that is definitely in the array

            int index = randomGenerator.nextInt(size);
            Stopwatch s2 = new Stopwatch();
            isThere = binarySearch(A, A[index]);
            avgTime2 += s2.elapsedTime();
            //System.out.println(A[index] + ": " + isThere);

            Stopwatch s3 = new Stopwatch();
            isThere = binarySearch(A, A[0]);
            //avgTime3 += s3.elapsedTime();
        }

        System.out.println("Average time to find value probably not in array is "+avgTime1/100.0+" microseconds");
        System.out.println("Average time to find value definitely in array at random place is "+avgTime2/100.0+" microseconds");
        System.out.println("Average time to find value definitely in array at start is "+avgTime3/100.0+" microseconds");

    }
}