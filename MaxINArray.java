public class MaxINArray {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 3, 9};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print("Максимальный элемент: " + max);

    }
}
