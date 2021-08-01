package arrays;

public class EquilibriumSecond {

	public int frequencyCount(int arr[], int N, int P)
	{
	    int elementCheck = 1, sumFrequency = 0;
	    int[] storeElements = new int[N];
	    
	    while(elementCheck <= P)
	    {
	    	for(int i=0;i<N;i++)
	    	{
	    		if(elementCheck == arr[i]) {
	    			sumFrequency++;
	    		}
	    	}
	    	storeElements[elementCheck-1]=sumFrequency;
	    	sumFrequency=0;
	    	elementCheck++;
	    }
		
	  
		return sumFrequency;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EquilibriumSecond es = new EquilibriumSecond();
		int[] testArr = {2,3,2,3,5,6};
		System.out.println(es.frequencyCount(testArr,6,6));

	}

}
