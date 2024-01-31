package rvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgramm.smallest(numbers));
        System.out.println("Index of smallest number: " + MainProgramm.indexOfSmallest(numbers));
//smallest of:
        System.out.println(MainProgramm.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgramm.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgramm.indexOfSmallestFrom(numbers, 2));
//swap:
        
    }
}
