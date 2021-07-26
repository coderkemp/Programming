package strings;

public class BinarySubString {

	public static int binarySubstringCount(int a, String str)
    {
		int beginCount=-1,lastCount=-1,count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.substring(i, i+1).equals("1"))
				{
				    beginCount = i;
				    break;
				}
		}
		for(int i=str.length()-1;i>0;i--) {
			if(str.substring(i,i+1).equals("1"))
			{
				lastCount = i;
				break;
			}
		}
		
		for(int j=beginCount;j<lastCount;j++)
		{
		    	
		}
		
		
        return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySubString bs = new BinarySubString();
		
	}

}
