import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String[] arr1 = {".", "..", "...", "....", "...", ".....", "...", "......"};
    double[] arr2 = {8.43, 9.44, 0.84, 1.22, 4.55, 4.445, 654.435, 7.454};
    int[] arr3 = {1, 2, 3, 4, 5, 6};
    int[] arr4 = {4, 4, 3, 2, 1};

    System.out.println(countLength(arr1, 3));
    System.out.println(indexOf(arr2, 4.55));
    System.out.println(hasDuplicates(arr3));
    System.out.println(hasDuplicates(arr4));
    System.out.println(findMode(arr1));
  }

  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (String i : arr) {
      if (i.length() == targetLength) {
        count++;
      }
    }
    return count;
  }

  public static int indexOf(double[] arr, double target)
  {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++) {
      int current = arr[i];
      for (int k = 0; k < arr.length; k++) {
        if (arr[k] == current && k != i) {
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    int mode = 0;
    String modeString = "";
    for (String i : arr) {
      String current = i;
      int currentMode = 0;
      for (String k : arr) {  
        if (current.equals(k)) {
          currentMode++;
        }
      } 
      if (currentMode > mode) {
        mode = currentMode;
        modeString = i;
      }
    }
    return modeString;
  }
}
