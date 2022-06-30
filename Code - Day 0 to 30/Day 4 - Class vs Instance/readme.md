# Topic:
Topics covered in this question are `classes`, `objects`, `instances` and `'this' keyword`
# Link:
https://www.hackerrank.com/challenges/30-class-vs-instance/problem?isFullScreen=true
# Code:
```
import java.io.*;
import java.util.*;

class Person {
    // Instance data:
    public int age;
    
    // Constructor:
    Person(int initialAge) {
        if( initialAge >= 0 )
            this.age = initialAge;
        else {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }
    
    // Year passes method to increase year:
    public void yearPasses(int year) {
        this.age = this.age + year;
    }
    
    // Am I Old method to check how older you are:
    public void amIOld() {
        if( this.age < 13 )
            System.out.println("You are young.");
        else if( this.age < 18 )
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
    }
}

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int initialAge;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1;i<=T;i++) {
            initialAge = sc.nextInt();
            Person p= new Person(initialAge);
            p.amIOld();
            p.yearPasses(3);
            p.amIOld();
            System.out.println();
        }
    }
}


```
