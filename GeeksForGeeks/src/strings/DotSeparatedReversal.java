package strings;
import java.util.*;

public class DotSeparatedReversal {

	String ReverseWords(String s)
	{
		String result="";
	   	List store = new ArrayList();
	   	String[] tokens = s.split(".");
	   	
	   	store.add(tokens);
	   	
	   	for(int i=tokens.length-1;i>=0;i--)
	   	{
	   		
	   		result = result + tokens[i] + ".";

	   	}
	   	
	   	return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DotSeparatedReversal dsr = new DotSeparatedReversal();
		System.out.println(dsr.ReverseWords("pqr.mno"));
	}

}
