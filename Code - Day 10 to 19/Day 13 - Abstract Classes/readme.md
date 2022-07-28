# Topic:
Topics covered in this question is `Abstract Classes`
# Link:
 https://www.hackerrank.com/challenges/30-abstract-classes/problem?isFullScreen=true
# Code:
```
import java.io.*;
import java.util.*;

abstract class Book {
    String title;
    String author;
    int price;
    int[] scores;
    abstract void display();
}

class Solution extends Book{
    Solution(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Solution s = new Solution(title, author, price);
        s.display();
    }
}

```
