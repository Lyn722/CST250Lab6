
package cstlab6;

public class CSTLab6 {
    
    // looking for the key number starting in the middle 
public static void binarySearch(int arr[], int first, int last, int key){
   int mid = (first + last)/2;
   while( first <= last ){
      if ( arr[mid] < key ){  // start search in the middle
        first = mid + 1;   // then if the number in the middle id not it, we will start to look for number starting from the left side
      }else if ( arr[mid] == key ){   //and if
        System.out.println("Element is found at index: " + mid); // output will print out key which is index in this example
        break;
        
      }else{                                         // or
         last = mid - 1; 
      }
      mid = (first + last)/2;       //add first and last numbers and divide by 2
   }
   if ( first > last ){
      System.out.println("Element is not found!");  /// if the number is not found then the output will explain
   }
 }
 public static void main(String args[]){ // string for array
		int arr[] = {10,20,30,40,50};  // numbers
		int key = 30;  // we are looking for this number
        int last=arr.length-1;  
		binarySearch(arr,0,last,key);	//impying binary search
 }
}

        
        
        
        
        
        
        
        
        
        
        
