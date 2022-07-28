# Topic:
Topics covered in this question is `Inheritance`
# Link:
 https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=true
# Code:
```
import java.util.*;

class Person {
    String firstName;
    String lastName;
    int idNumber;
    int[] scores;
}

class Student extends Person {
    Student(String firstName, String lastName, String idNumber, int[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = Integer.parseInt(idNumber);
        this.scores = scores;
    }
    
    char calculate() {
        int average = 0;
        for(int i = 0; i < scores.length; i++) {
            average += scores[i];
        }
        average = average / scores.length;
        if( average >= 90 ) {
            return 'O';
        } else if( average >= 80 ) {
            return 'E';
        } else if( average >= 70 ) {
            return 'A';
        } else if( average >= 55 ) {
            return 'P';
        } else if( average >= 40 ) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] newStr = str.split("\\s+");
        int num = sc.nextInt();
        int[] scores = new int[num];
        for(int i=0; i<num; i++)
            scores[i] = sc.nextInt();
        sc.close();
        Student s = new Student(newStr[0], newStr[1], newStr[2], scores);
        char result = s.calculate();
        System.out.println("Name: " + s.lastName + ", " + s.firstName);
        System.out.printf("ID: %d\n", s.idNumber);
        System.out.println("Grade: " + result);
    }
}

```
