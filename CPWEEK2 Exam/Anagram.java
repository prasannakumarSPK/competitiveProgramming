import java.util.*;
public class Anagram{

	public char [] RemoveDuplicates(String str){
		char [] arr = new char[256];
		// System.out.println("*******"+arr[0]);
		for(int i=0;i<str.length();i++){
			char a = str.charAt(i);
			int ascii = (int)a;
			arr[ascii] = a;	
		}
		return arr;
		
		// System.out.println(Arrays.toString(arr));

	}

	public String ReturnString(String input){
			String arr[] = input.split(" ");
			String res="";
			for(int i=0;i<arr.length;i++){
				res+=arr[i];
			}
			return res;
	}
	public static void main(String[] args) {
		Anagram ana = new Anagram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1 = sc.nextLine().trim();
		s1 = s1.toLowerCase();
		System.out.println("Enter Second String");
		String s2 = sc.nextLine().trim();
		s2 = s2.toLowerCase();

		s1=ana.ReturnString(s1);
		s2=ana.ReturnString(s2);
		

		char arr1[] =ana.RemoveDuplicates(s1);
		char arr2[] =ana.RemoveDuplicates(s2);
		for(int i=0;i<256;i++){
			if(arr2[i]==arr1[i])
				continue;
			else{
				System.out.println("false");
				return;
			}

		}
		System.out.println("true");
		
		
		
		// System.out.println(s1);
		// System.out.println(s2);
	}
}