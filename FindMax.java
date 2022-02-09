public class FindMax {
    public static void main(String[] args) {
        int[] array = {1,2,3,9,4,5,6,11,7,10};
        int[] arrayMax = findMax(array);
        System.out.printf("Maximun of Array is %d at index %d",arrayMax[0],arrayMax[1]);
    }
    public static int[] findMax(int arr[]){
        int[] arrTemp = new int[2];
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length ; i++) {
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        arrTemp[0]=max;
        arrTemp[1]=index;
        return arrTemp;
    }
}
