import java.util.*;
import java.io.*;

public class WordTracker{
        public static void printWordsInOrder(String command, File file)throws IOException, TreeException{
            
            /* -> read in supplied text file DONE
             -> print all words in alphabetical order 	DONE
             -> print words in alphabetical order and the lines on which they occur "start 1" DONE
             -> print words in alphabetical order and the lines on which they occur and frequency start occurs twice->"start 1, 2"*/

            BSTree tree = new BSTree<String>();
            String element = "";

            Scanner scan = new Scanner(file);
            //LineNumberReader lineReader = new LineNumberReader(new FileReader(file));

            int lineNo=0;
            

            while (scan.hasNextLine()){
                lineNo++;
                String line = scan.nextLine();
                Object[] lineArray = line.split(" ");
                for (int i = 0; i < lineArray.length; i++){
                    lineArray[i] = String.valueOf(lineArray[i]).replaceAll("\\p{Punct}", "") + "," + String.valueOf(lineNo);
                    System.out.println(lineArray[i]);
                    tree.add(lineArray[i]);

                    //find the frequency of repetition on that line
                }
            }
            try{
            System.out.println(tree.search("tres")[0]);
            }catch(Exception e){System.out.println("null");}
            if(command.equals("-po") || command.equals("-pl")){
                //do pl
                // String[] yep = String.valueOf(tree.search("trees")).split(",");
                // System.out.println(yep[1]);
               
                //String result = tree.search("trees,8").element;

                
                if(command.equals("-po")){
                    //do po
                }
            }

            scan.close();
        }

    public static void main(String[] args) throws IOException, TreeException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter command: ");
        String command = input.nextLine();

        if(!(command.equals("-pf") || command.equals("-pl") || command.equals("-po"))){
            System.out.println("Invalid command, please enter one of: -pf, -pl, -po");
            input.close();
            return;
        }

        System.out.print("Enter file path: ");
        String path = "text/textfile.txt";//input.nextLine();
        
        File file = new File(path);

        printWordsInOrder(command, file);

        input.close();
    }
}