package com.gradescope.arrays;
//package arrays;
//import java.util.Arrays;
import java.util.Random;

public class MyArray2{
    
      // print the elements of an array
      public static void forstring(int arrayinput[]){
        for( int i=0;i<arrayinput.length;i++) {
              System.out.print(" "+ arrayinput[i] + ",") ;
        }
    }
     
    //Functions

    public static int[] copy(int arrayinput[]){
        int array[]= new int [arrayinput.length];
        for( int i=0;i<arrayinput.length;i++) {
              array[i]=arrayinput[i]  ;
        }
        return array;
    }

    public static int addAll(int [] array ){
        int sum=0;
           for(int item : array){
              sum = sum+item;
           }
        return(sum);
    }

    public static int[]  addArrays(int arrayinput1[], int arrayinput2[]){
        
        int sumArray[]= new int [arrayinput1.length];
        for(int i=0;i<arrayinput1.length;i++) {
            sumArray[i]= arrayinput1[i]+arrayinput2[i];         
        }
        return sumArray;
    } 

    public static int multiplyAll(int [] array ){
        int product=1;
           for(int item : array){
              product = product*item;
           }
        return product;
    }

    public static int findAverage(int [] array ){
         int average= addAll(array)/array.length;
        return average;  
    }

    public static int[] swap(int [] array, int i , int j) {
         int a=array[i];
         int b=array[j];
         array[i]=b;
         array[j]=a;
        return array;
    }

    public static boolean isElement(int [] array, int b) {
        for(int i=0;i<array.length;i++){
            if( b == array[i]){
             return true;
            }
        }
        return false;
    }

    public static int indexOf(int [] array, int b){
        for(int i=0;i<array.length;i++){
            if( b == array[i]){
             return i;
            }
        }
      return -1;
    }

    public static int  findMin(int [] array){
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if( min > array[i]){
             min=array[i];
            }
        }
      return min;
    }

    public static int findMinIndex(int [] array){
       int indexmin=0;
        for(int i=0;i<array.length;i++){
            if( findMin(array) == array[i]){
                indexmin=i;
            }
        }
      return indexmin;  
    }

    public static int  findMax(int [] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if( max < array[i]){
             max=array[i];
            }
        }
      return max;
    }

    public static int findMaxIndex(int [] array){
      int indexmax=0;
        for(int i=0;i<array.length;i++){
           if( findMax(array) == array[i]){
             indexmax=i;
            }
        }
      return indexmax;  
    }

    public static void reverse(int [] array){
        int[]array1=new int [array.length] ;
        /*create a reversed array version of the input array */
        for (int i=0;i<array.length;i++){
            array1[array.length-1-i]=array[i];
        }
        /*assign the term of our reversed array to our original array */
        for (int i=0;i<array.length;i++){
            array[i]=array1[i];  
        }
       
    }

    public static int [] returnReverse(int [] array){
        int[]array1=new int [array.length] ;
        /*create a reversed array version of the input array */
        for (int i=0;i<array.length;i++){
            array1[array.length-1-i]=array[i];
        }
        return array1;
    }

    public static int [] intersection(int [] array1,int [] array2){
        int[] interarray= new int[array1.length+array2.length];
        int h=0;
        int counter=0;
        for(int i=0;i<array1.length;i++){
            if((isElement(array2, array1[i]))==true && ((isElement(interarray, array1[i]))==false)){
              interarray[h++]=array1[i];
              counter=counter+1;       
            }  
        }
        //create a new array resized with just the intersection element
        int array[]= new int [counter];
        for( int j=0;j<counter;j++) {
            array[j]=interarray[j]  ;
        }
        return array;
         
    }

    public static int [] union(int [] array1,int [] array2){
        int[] interarray= new int[array1.length+array2.length];
        int h=0;
        int counter=0;
        //copy all the element of the first array with no duplicate
        for(int i=0;i<array1.length;i++){
            if((isElement(interarray, array1[i]))==false){
              interarray[h++]=array1[i];
              counter=counter+1;       
            }  
        }
        
        //copy all the element of the second array with no duplicate in the new array
        int countget=counter;
        for(int j=0;j<array2.length;j++){
            if((isElement(interarray, array2[j])==false)){
              interarray[countget++]=array2[j];
              counter=counter+1;       
            }  
        }
        //create a new array resized with just the union of element
          int array[]= new int [counter];
        for( int k=0;k<counter;k++) {
            array[k]=interarray[k]  ;
        }
        return array;
         
    }

    //Testers

    public  static void test_copy(int arrayinput[]){
        System.out.println("==========Testing copy ==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.print("Answer : ");
        forstring(copy(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing copy ==========");
        
    }

    public  static void test_addAll(int arrayinput[]){
        System.out.println("==========Testing addAll ==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("Answer : "+addAll(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing addAll ==========");
        
    }

    public  static void test_addArrays(int arrayinput1[],int arrayinput2[]){
        
        System.out.println("==========Testing addArrays ==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput1);
        System.out.print(" and ");
        forstring(arrayinput2);
        System.out.println("\n");
        System.out.print("Answer : ");
        forstring(addArrays(arrayinput1, arrayinput2));
        System.out.println("\n");
        System.out.println("==========Done testing addArrays ==========");
        
    }

    public  static void test_multiplyAll(int arrayinput[]){
        System.out.println("==========Testing multiplyAll ==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("Answer : "+multiplyAll(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing multiplyAll ==========");
        
    }

    public  static void test_findAverage(int arrayinput[]){
        System.out.println("==========Testing findAverage==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("Answer : "+findAverage(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing findAverage ==========");
        
    }

    public  static void test_swap(int arrayinput[], int i, int j){
        System.out.println("==========Testing swap ==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("you swapped values at index "+ i +" and "+j);
        System.out.println("\n");
        System.out.print("Answer : ");
        forstring(swap(arrayinput, i, j));
        System.out.println("\n");
        System.out.println("==========Done testing swap ==========");
        
    }

    public  static void test_isElement(int arrayinput[], int i){
        System.out.println("==========Testing isElement==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("The element to test is: "+ i);
        System.out.println("\n");
        System.out.println("Answer : "+ isElement(arrayinput, i));
        System.out.println("\n");
        System.out.println("==========Done testing isElement ==========");
        
    }

    public  static void test_indexOf(int arrayinput[], int i){
        System.out.println("==========Testing indexOf==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("The element to test is: "+ i);
        System.out.println("\n");
        System.out.println("Answer : "+ indexOf(arrayinput, i));
        System.out.println("\n");
        System.out.println("==========Done testing indexOf ==========");
        
    }

    public  static void test_findMin(int arrayinput[]){
        System.out.println("==========Testing findMin==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("Answer : "+ findMin(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing findMin ==========");
        
    }

    public  static void test_findMinIndex(int arrayinput[]){
        System.out.println("==========Testing findMinIndex==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("Answer : "+ findMinIndex(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing findMinIndex ==========");
        
    }

    public  static void test_findMax(int arrayinput[]){
        System.out.println("==========Testing findMax==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("Answer : "+ findMax(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing findMax==========");
        
    }

    public  static void test_findMaxIndex(int arrayinput[]){
        System.out.println("==========Testing findMaxIndex==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("Answer : "+ findMaxIndex(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing findMaxIndex ==========");
        
    }

    public  static void test_reverse(int arrayinput[]){
        System.out.println("==========Testing reverse==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        reverse(arrayinput);
        System.out.print("Answer: Your array was reversed. Its new value is : " );
        forstring(arrayinput);
        System.out.println("\n");
        System.out.println("==========Done testing reverse ==========");
        
    }

    public  static void test_intersection(int arrayinput[],int arrayinput2[]){
        System.out.println("==========Testing intersection==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.print(" and ");
        forstring(arrayinput2);
        System.out.println("\n");
        System.out.print("Answer : ");
        forstring(intersection(arrayinput, arrayinput2));
        System.out.println("\n");
        System.out.println("==========Done testing intersection ==========");
        
    }

    public  static void test_union(int arrayinput[],int arrayinput2[]){
        System.out.println("==========Testing union==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.print(" and ");
        forstring(arrayinput2);
        System.out.println("\n");
        System.out.print("Answer : ");
        forstring(union(arrayinput, arrayinput2));
        System.out.println("\n");
        System.out.println("==========Done testing union==========");
        
    }

    public  static void test_returnReverse(int arrayinput[]){
        System.out.println("==========Testing returnReverse==========");
        System.out.println("\n");
        System.out.print("Your input array is : ");
        forstring(arrayinput);
        System.out.println("\n");
        System.out.print("Your original array is : " );
        forstring(returnReverse(arrayinput));
        System.out.println("\n");
        System.out.println("==========Done testing returnReverse ==========");
        
    }

    //create a random array
    public  static int[]  create_random_array(int max){
     Random randomarray= new Random();
        int [] buildarray = new int[max];{
            for( int i=0;i<max;i++) {
             buildarray[i]=randomarray.nextInt(9); 
            }
        }
      return buildarray;
    }
    
    public static void main(String[] args) {
        
      int[] array= create_random_array(5);
      int[] array2= create_random_array(5);
      System.out.println("*==========++BEGINNING++==========*\n");
         System.out.println("\n");
         test_copy(array);
         System.out.println("\n");
         test_addAll(array);
         System.out.println("\n");
         test_addArrays(array2, array);
         System.out.println("\n");
         test_multiplyAll(array);
         System.out.println("\n");
         test_findAverage(array);
         System.out.println("\n");
         test_swap(array, 2, 3);
         System.out.println("\n");
         test_isElement(array, 4);
         System.out.println("\n");
         test_indexOf(array, 3);
         System.out.println("\n");
         test_findMin(array);
         System.out.println("\n");
         test_findMinIndex(array);
         System.out.println("\n");
         test_findMax(array);
         System.out.println("\n");
         test_findMaxIndex(array);
         System.out.println("\n");
         test_intersection(array2, array);
         System.out.println("\n");
         test_union(array2, array);
         System.out.println("\n");
         test_returnReverse(array);
         System.out.println("\n");
         test_reverse(array);
         System.out.println("\n");
         System.out.println("\n");
      System.out.println("*==========+++END+++==========*");
    }
}