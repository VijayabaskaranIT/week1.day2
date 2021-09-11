package week1.day2;

public class FrequencyOfANumber {

	public static void main(String[] args) 
	{
		int[] arr={3,4,2,1,2,6,3,6,2,4,7,1};
		int[] fr= new int[arr.length];
		int visited=-1;
		for (int i = 0; i < arr.length; i++) 
		{
			int count=1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j]) 
				{
				count=count+1;
				fr[j]=visited;
				}			
			}
			if(fr[i]!=visited)
			fr[i]=count;
			
		}
		 for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	            	System.out.println("The frequency of the number "+arr[i]+" is: "+ fr[i]);
	}
}
}