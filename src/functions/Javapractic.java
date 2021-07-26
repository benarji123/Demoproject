package functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Javapractic {
public static void main(String []args) {
Pattern p = Pattern.compile("/s",Pattern.CASE_INSENSITIVE);
Matcher m = p.matcher("nrd enrji");
boolean b = m.find();
if(b) {
	System.out.println(m.group());
}else {
	System.out.println("not found");
}//this is sample
//this latest information

}
}

