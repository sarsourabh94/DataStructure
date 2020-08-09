
public class StringLogic {

	private String stringInput;
	StringLogic(String stringInput)
	{
		this.stringInput=stringInput;
	}
	
	public String ReverseString()
	{
		if(stringInput==null||stringInput.isEmpty())
		{
			return stringInput;
		}
		
		char[] characters = stringInput.toCharArray();
		int i=0;
		int j=characters.length-1;
				
		for( ; i<j; i++,j--)
		{
			Swap(characters,i,j);
		}
		
		return new String(characters);
	}
	
	private void Swap(char[] input, int i, int j)
	{
		char temp=input[i];
		input[i]=input[j];
		input[j]=temp;
	}
}
