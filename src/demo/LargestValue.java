package demo;
 
public class LargestValue {
 
 public static void main(String[] args){
 
 int[] arr={17, 9, 8, 6, 10, 9, 5, 11, 10, 15};
 
 int val=arr[0];
 
 for(int i=0; i<arr.length; i++){
 if(arr[i] > val){
 val=arr[i];
 }
 }
 System.out.println("Largest value in the Given Array is "+ val);
 }
}