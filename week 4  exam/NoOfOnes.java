import java.util.*;

public class NoOfOnes{

	static ArrayList<Integer>result = new ArrayList<>();

	public static void ToBinary(int num){

		if(num==0){
			result.add(0);
			return;
		}
		else if(num==1){
			result.add(1);
			return;
		}
		else{
			int count=0;
			while(num!=1){
			int a = num%2;
			num = num/2;
			if(a==1)
				count++;
			if(num==1)
				count++;
		}
		result.add(count);
		}


	}
	public static void main(String[] args) {
		int num = 0;
		

		
		for(int i=0;i<=num;i++){
			ToBinary(i);
		}
		
		
		System.out.println(Arrays.toString(result.toArray()));
	}
}