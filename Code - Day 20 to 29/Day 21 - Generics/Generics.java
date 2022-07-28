// QS Link: https://www.hackerrank.com/challenges/30-generics/problem?isFullScreen=true

import java.util.*;

class Printer <T> {
       public <E> void printArray(E[] generic) {
           for(E element: generic) {
               System.out.println(element);
            }
       }
}
class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        scanner.close();
        Printer<Integer> intPrinter = new Printer<Integer>();
        intPrinter.printArray(intArray);
        Printer<String> stringPrinter = new Printer<String>();
        stringPrinter.printArray(stringArray);
    } 
}