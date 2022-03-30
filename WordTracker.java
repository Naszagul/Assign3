import java.util.*;
import java.io.*;

public class WordTracker{
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String file = ("textfile.txt");
        File textFile = new File(file);
        Scanner scanner_one = new Scanner(textFile);
        Scanner scanner_two = new Scanner(textFile);
        LineNumberReader lineReader = new LineNumberReader(new FileReader(textFile));
        int count = 0;
        // int arraySize = Integer.valueOf(scanFile.next());

        // finding size of array
        while (scanner_one.hasNext()){
            count++;
            scanner_one.next();
        }
        
        int arraySize = 0;
        String [] words = new String [count];

        while (scanner_two.hasNext()){
            words[arraySize] = scanner_two.next().toLowerCase();
            arraySize++;
        }

        int lineCount = 0;
        while (lineReader.readLine() != null){
            lineCount++;
        }
        scanner_one.close();
        scanner_two.close();
        lineReader.close();
        Arrays.sort(words);
       // System.out.println(lineCount);
        for (int k = 0; k<words.length; k++){
            System.out.print(words[k] + " ");
        }

    }
}