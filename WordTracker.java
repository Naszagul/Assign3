import java.util.*;
import java.io.*;

public class WordTracker{
        public static void printWordsInOrder(String command, File file)throws IOException, TreeException{
            
            /* -> read in supplied text file DONE
             -> print all words in alphabetical order 	DONE
             -> print words in alphabetical order and the lines on which they occur "start 1" DONE
             -> print words in alphabetical order and the lines on which they occur and frequency start occurs twice->"start 1, 2"*/

            BSTree tree = new BSTree<String>();

            Scanner scan = new Scanner(file);

            int lineNo=0;

            while (scan.hasNextLine()){
                lineNo++;
                String line = scan.nextLine();
                Object[] lineArray = line.split(" ");
                for (int i = 0; i < lineArray.length; i++){
                    lineArray[i] = String.valueOf(lineArray[i]).replaceAll("\\p{Punct}", "") + ", Line number: " + String.valueOf(lineNo);
                    tree.add(lineArray[i]);
                }
            }

            if(command.equals("-pf")){
                tree.inorderIterator_pf(tree.getRoot());
            }
            if(command.equals("-pl")){
                tree.inorderIterator_pl(tree.getRoot());
            }

            scan.close();
        }

    public static void main(String[] args) throws IOException, TreeException {
        Scanner input = new Scanner(System.in);
        System.out.print("Commands: -pf -pl");
        System.out.print("Enter command: ");
        String command = input.nextLine();

        if(!(command.equals("-pf") || command.equals("-pl"))){
            System.out.println("Invalid command, please enter one of: -pf, or -pl");
            input.close();
            return;
        }

        System.out.print("Enter path of text file: ");
        String path = input.nextLine();
        
        File file = new File(path);

        printWordsInOrder(command, file);

        input.close();
    }
}