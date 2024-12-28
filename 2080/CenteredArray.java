public class CenteredArray {

    public static int isCentered(int[] arr) 
    {
        if(arr.length % 2 == 0) return 0;

        int middleIndex = arr.length / 2;
        int middleValue = arr[middleIndex];

        for(int i =0; i<arr.length; i++)
        {
            if(i != middleIndex && arr[i] <= middleValue)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] arr = {9,5,2,1,10};
        System.out.println(isCentered(arr));
    }
    
}
