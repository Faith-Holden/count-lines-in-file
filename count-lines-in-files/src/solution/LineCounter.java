package solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

    public static long countLines(String fileName){
        try{
            BufferedReader lineReader = new BufferedReader(new FileReader(fileName));
            long lines = lineReader.lines().count();
            lineReader.close();
            return lines;
        }catch (IOException e){
            System.out.println(fileName + " is not a valid filename, or the file path has not been correctly specified.");
            return -1;
        }
    }

    public static void countFromAll(String[]args, String resourceFileName){
        for(String arg: args){
            long lineNum = LineCounter.countLines(resourceFileName + arg);
            if(lineNum>-1){
                System.out.println("The number of lines in the file \"" + arg + "\" was " + lineNum + ".");
            }
        }
    }
}
