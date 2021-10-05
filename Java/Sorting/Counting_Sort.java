publi class CountingSort {
    public static void sort(char arr[]){
        int n = arr.length;
 
        char output[] = new char[n];
 
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
 
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
 
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
 
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
 
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
 
    public static void main(String args[])
    {
        CountingSort obj = new CountingSort();
        char arr[] = { 'm', 'a', 'd', 'h', 'a', 'v', 'a',
                       'r', 'o', 'r', 'a'};
 
        obj.sort(arr);
 
        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i]);
    }
  
//  TC: O(n+k) where n is the number of elements in input array and k is the range of input. 
// Auxiliary Space: O(n+k)
}