package algorithms;

public class HW1_8 {

  public static void main(String[] args) {
    int[] arr = new int[1000];
    for (int i = 1; i < 1000; i++) {
      arr[i] = i;
    }

    System.out.println(ternarySearch(arr, 14, 0, 999));
    System.out.println(threeSearch(arr, 14));
  }

  public static int threeSearch(int arr[], int key) {
    int low = 0;
    int high = arr.length - 1;
    int mid1 = low + (high - low) / 3;
    int mid2 = high - (high - low) / 3;

    while (low<high) {
      if (arr[mid1] == key) {
        return mid1;
      }

      if( arr[mid2] == key){
        return mid2;
      }

      if (key < arr[mid1]) {
        high = mid1 - 1;
        mid1 = low + (high - low) / 3;
        mid2 = high - (high - low) / 3;

      } else if (key > arr[mid2]) {
        low = mid2 + 1;
        mid1 = low + (high - low) / 3;
        mid2 = high - (high - low) / 3;
      } else {
        low = mid1 + 1;
        high = mid2 - 1;
        mid1 = low + (high - low) / 3;
        mid2 = high - (high - low) / 3;
      }
    }
    return -1;
  }

  public static int ternarySearch(int arr[], int key, int low, int high) {
    int mid1, mid2;
    if (low > high) {
      return -1;
    } else {
      mid1 = low + (high - low) / 3;
      mid2 = high - (high - low) / 3;
      if (arr[mid1] == key) {
        return mid1;
      } else if (arr[mid2] == key) {
        return mid2;
      }
      if (key < arr[mid1]) {
        return ternarySearch(arr, key, low, mid1 - 1);
      } else if (key > arr[mid2]) {
        return ternarySearch(arr, key, mid2 + 1, high);
      } else {
        return ternarySearch(arr, key, mid1 + 1, mid2 - 1);
      }
    }
  }
}