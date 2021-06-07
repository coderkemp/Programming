package strings;

public class SmallestWindowString {

	//Rethink the logic, look for inputs online to solve
	    public int smallestWindow(String s, String p)
	    {
	 
	        String result="";
	        int lowIndex=-1,prevLowIndex=-1;
	        
	        for(int i=0; i<p.length();i++){
	        	for(int j=0; j<s.length();j++) {
	                if(p.substring(i,i+1).equals(s.substring(j,j+1))) {
	                	lowIndex=j;
	                }
	                if(lowIndex > prevLowIndex) {
	                	prevLowIndex = lowIndex;
	                }
	        	}	
	        }
	        	        
	        return prevLowIndex;
	    }
	   
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    	SmallestWindowString sw = new SmallestWindowString();
	    	System.out.println(sw.smallestWindow("timetopractice", "toc"));
	    }

}
