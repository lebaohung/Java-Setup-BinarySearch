public class SearchAlgorithms {


    public SearchAlgorithms() {
    }

    public int binarySearchRecursive(int[] arr, int high, int low, int searchItem) {
        while (high >= low) {
            int mid = (int) (high + low) / 2;
            if (arr[mid] == searchItem) return mid;
            else if (arr[mid] > searchItem) {
                high = mid - 1;
                binarySearchRecursive(arr, high, low, searchItem);
            } else {
                low = mid + 1;
                binarySearchRecursive(arr, high, low, searchItem);
            }
        };
        return -1;
    }

    public int binarySearchLoop(int[] arr, int searchItem) {
        int high = arr.length - 1;
        int low = 0;
        while (high >= low) {
            int mid = (int) (high + low)/2;
            if (arr[mid] == searchItem) return mid;
            else if (arr[mid] > searchItem) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchAlgorithms test = new SearchAlgorithms();
        int [] arr = {1, 4, 6, 7, 9};
        int searchNumber = 9;

//        System.out.println(test.binarySearchRecursive(arr, arr.length -1, 0, searchNumber ));
        System.out.println(test.binarySearchLoop(arr, searchNumber));
    }

}
