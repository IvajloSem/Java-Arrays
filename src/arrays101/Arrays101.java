package arrays101;

/**
 *
 * @author semka
 */
public class Arrays101 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr; // reference
        arr = new int[100]; // creates array
        int nElements; // number of elements
        int j; // loop counter;
        int searchKey;
        
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nElements = 10;
        
//        for(j=0; j<nElements; j++)
//            System.out.println(arr[j] + "");
        
//        searchKey = 11; // hardcoded as fuck
//        for(j=0; j<nElements;j++) // loop that goes through all objects in arr
//            if(arr[j] == searchKey) // if the object is found,
//                break;              // exit the loop
//            if (j == nElements) // if its different
//                System.err.println("Object " + searchKey + " in arr does not exists ");
//            else
//                System.out.println("Object " + searchKey + " in arr exists ");   

          searchKey = 22; // deletes item with key 22
          for ( j=0; j<nElements; j++) // looks for it
              if(arr[j] == searchKey)
                  break;
          for (int k=j; k<nElements; k++) // moves the higher ones
              arr[k] = arr[k+1];
          nElements--; // decrements size
          for(j=0; j<nElements; j++)
          System.out.println(arr[j] + "");
    }
    
}
