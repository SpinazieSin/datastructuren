package datastructuren;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Datastruct {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("wordlist.txt"));
			ArrayList<String> arrL= new ArrayList<String>();
			String word = "wordcheck";
			System.out.println("First 10 words, for checking:");
			for(int i=0 ; word != null; i++) {
				word = in.readLine();
				if(i<10){
					System.out.println(word);
				}
				arrL.add(word);
			}
			in.close();
			String[] array = new String[arrL.size()];
			array = arrL.toArray(array);
	        System.out.println("Done with initialising.");
		} catch(IOException e) {
			 e.printStackTrace(System.out);
		}
	}

	public static String readFile(String args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(args)));
        return content;
    }
}