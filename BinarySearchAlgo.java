import java.util.Scanner;

// Binary Search in Java

class Main {
  int binarySearch(int array[], int element, int low, int high) {

    // Repeat until the pointers low and high meet each other
    while (low <= high) {

      // get index of mid element
      int mid = low + (high - low) / 2;

      
      // if element to be searched is the mid element
      if (array[mid] == element)
        return mid;

      // if element is greater than mid element
      // search only the right side of mid
      if (element > array[mid])
        low = mid + 1;

      // if element is less than mid element
      // search only the left side of mid
      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {

    // create an object of Main class
    Main obj = new Main();

    // create a sorted array
    int[] array = { 3, 4, 5, 6, 7, 8, 9 };
    int n = array.length;

    // get input from user for element to be searched
    Scanner input = new Scanner(System.in);

    System.out.println("Enter element to be searched:");

    // element to be searched
    int element = input.nextInt();
    input.close();

    // call the binary search method
    // pass arguments: array, element, index of first and last element
    int result = obj.binarySearch(array, element, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}
