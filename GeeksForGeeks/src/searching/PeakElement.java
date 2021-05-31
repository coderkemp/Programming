package searching;

public class PeakElement {

	public int peakElementTest(int[] arr,int n)
    {
       int res=0;
       for(int i=0;i<=arr.length-1;i++){
    	   if(i == 0) {
    		   if(arr[i]>arr[i+1]) {
    			   res=i;
    			   break;
    		   }
    	   }
           if((i<arr.length-1)&&(i != 0)){
           if((arr[i]>arr[i-1]) && (arr[i]>arr[i+1]))
           {
               res=i;
               break;
           }
           }
           if(i==arr.length-1){
               if((arr[i]>arr[i-1])){
                   res=i;
                   break;
               }
           }
       }
       return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PeakElement pe = new PeakElement();
        int[] testMe = {1,2,3};
        System.out.println(pe.peakElementTest(testMe, 3));
        
	}

}
