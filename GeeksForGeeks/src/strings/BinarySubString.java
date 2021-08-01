package strings;

public class BinarySubString {

	public static int binarySubstringCount(int a, String str)
    {
		int oneCount = 0;
		
		for(int i=0; i<a ; i++)
		{
			if(str.charAt(i)=='1')
			{
				oneCount++;
			}
		}
		
		return (oneCount*(oneCount-1))/2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySubString bs = new BinarySubString();
		System.out.println(bs.binarySubstringCount(4, "1111"));
		
	}

}
