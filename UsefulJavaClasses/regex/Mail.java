package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
	private static Pattern MAIL_PATTERN = Pattern.compile("([a-z]{2,20})\\.([a-z]{2,20})(\\d{1,2})?@(student\\.)?(tuke|upjs)\\.(sk)");
	private String value;
	
	public Mail(String value) {
		this.setValue(value);
		
		Matcher matcher = MAIL_PATTERN.matcher(value);
		if(matcher.matches()) {
			String name = matcher.group(1);
			String surname = matcher.group(2);
			String poradie = matcher.group(3);
			String student = matcher.group(4);
			String uni = matcher.group(5);
			
			System.out.print(name + " " + surname);
			
			if(poradie == null) {
				System.out.print(" nema menovca");
			} else {
				System.out.print(" ma menovca s poctom " + (Integer.parseInt(poradie) - 1));
			}
			
			if(student == null) {
				System.out.print(" a je zamestnancom");
			} else {
				System.out.print(" a je studentom");
			}
			if(uni.equals("tuke")) {
				System.out.println(" TUKE");
			} else {
				System.out.println(" UPJS");
			}
		}
		else {
			System.out.println("address does not match the pattern");
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
