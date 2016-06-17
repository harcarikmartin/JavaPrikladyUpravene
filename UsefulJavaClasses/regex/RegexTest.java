package regex;

import java.util.regex.Pattern;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RegexTest {
    
    public static void main(String[] args){
//        Console console = System.console();
    	Scanner console = new Scanner(System.in);
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        Formatter f = new Formatter();
        while (true) {       
        	System.out.println("Enter your regex: ");
        	Pattern pattern =
                    Pattern.compile(console.nextLine());
            
            System.out.println("Enter input string to search: ");
            Matcher matcher =
                    pattern.matcher(console.nextLine());
            
            boolean found = false;
            while (matcher.find()) {
            	f.format("I found the text \"%s\" starting at index %d and ending at index %d.%n",
                        matcher.group(), matcher.start(), matcher.end());
            	System.out.println(f.toString());
//                console.format("I found the text \"%s\" starting at " +
//                        "index %d and ending at index %d.%n",
//                        matcher.group(), matcher.start(), matcher.end());
                found = true;
            }
            if(!found){
               f.format("No match found.%n");
               System.out.println(f.toString());
            }
//            f.close();
//            console.close();
        }
    }
}
