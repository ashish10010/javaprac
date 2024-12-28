// A non-empty array A of length n is called on array of all possibilities 
// if it contains all numbers between 0 and A.length-1 inclusive. 
// Write a method named isAllPossibilities that accepts an integer array and 
// returns 1 if the array is an array of all possiblities, otherwise it returns 0. 

public class Allpossibilities {
    public static int isAllPossibilities(int [] a) {
        if(a.length == 0) return 0;

        for(int i=0; i<a.length; i++) 
        {
            boolean found = false;
            for(int num : a) 
            {
                found = true;
                break;
            }
        }

        if(!found) 
        {
            return 0;
        }
        return 1; 
    }
  public static void main(String[] args)
  {
    int [] array1 = {0,1,2,3};
    int [] array2 = {0,2,1,4};
    int [] array3 = {1,0};

    System.out.println(isAllPossibilities(array1));
    System.out.println(isAllPossibilities(array2));
    System.out.println(isAllPossibilities(array3));
  }
    
}
