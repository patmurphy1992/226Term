import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * WordSeparator takes a cryptoquip/cryptogram from a file and
 * makes each word from the puzzle a Word object. 
 */
public class WordSeparator {
	
		Scanner scan;
		
		public WordSeparator(String file) {
			
			//read in file
			try {
				scan = new Scanner(new BufferedReader(new FileReader(file)));
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			//make each word from the file a Word
			ArrayList<Word> words = new ArrayList<Word>();
			String w;
			while (scan.hasNext()) {
				w = scan.next();
				words.add(new Word(w));
			}
		
		
		}	
}
