import java.util.*;

public class Morse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char alphabets[] = new char[26];
		for(int i=0;i<26;i++){
			int val = i+97;
			alphabets[i]=(char)val;
		}
		String inputs[] = {".-","-...","-.-.","-..",".","..-.","--.",
"....",
"..",
".---",
"-.-",
".-..",
"--",	
"-.",
"---",
".--.",
"--.-",
".-.",
"...",
"-",
"..-",
"...-",
".--",
"-..-",
"-.--",
"--.."};
		String values[] = new String[26];
		// values[0] = ".-";values[1] = "-...";values[2] = ".-";values[3] = ".-";values[4] = ".-";values[5] = ".-";values[6] = ".-";values[7] = ".-";values[8] = ".-";values[9] = ".-";values[10] = ".-";values[11] = ".-";values[12] = ".-";values[13] = ".-";
		// values[14] = ".-";values[15] = ".-";values[16] = ".-";values[17] = ".-";values[18] = ".-";values[19] = ".-";values[20] = ".-";values[21] = ".-";values[22] = ".-";values[23] = ".-";values[24] = ".-";values[25] = ".-";
		for(int i=0;i<26;i++){
			values[i] = inputs[i];
		}
		// System.out.println(Arrays.toString(alphabets));
		// System.out.println(Arrays.toString(values));


  // String arr[] = {"gin", "zen", "gig", "msg"};
  // String arr[] = {"a", "z", "g", "m"};
  // String arr[] = {"bhi", "vsv", "sgh", "vbi"};
  String arr[] = {"a", "b", "c", "d"};
  // String arr[] = {"hig", "sip", "pot"};
	System.out.println("enter String array size:");
	
  int len = arr.length;
    String result1[] = new String[len];
    int k=0;

    for(int i=0;i<arr.length;i++){
     String elem = arr[i];
     String combinedString = "";
     for(int j=0;j<elem.length();j++){
       char chr = elem.charAt(j);
       combinedString+=values[(int)chr-97];

     }
     result1[k++] = combinedString;
    }


 
	Set<String> set = new HashSet<>(Arrays.asList(result1));

	System.out.println(Arrays.toString(result1));
	System.out.println(set);
	System.out.println(set.size());

	}

}