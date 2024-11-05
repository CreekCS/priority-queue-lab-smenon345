// import java.util.Scanner;
import java.io.*;
import java.util.*;
// import statements

public class PriorityQueueLab {
    public static void main(String args[]) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        Scanner scan;
        try {
            File file = new File("RandIntegers.txt");
            scan = new Scanner(file);
            while(scan.hasNextLine()) {
                int value = Integer.parseInt(scan.nextLine());
                pQ.add(value);
                // String intVals = scan.nextLine();
                // System.out.println(intVals);
            }
            while(!pQ.isEmpty()) {
                System.out.println(pQ.poll());
            }
            System.out.println(pQ);
        }catch(FileNotFoundException e) {
            System.out.println("There isn't a file being inputted idiot");
        }
    }
}

