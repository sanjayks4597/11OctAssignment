
public class CountVowelsAndConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is a really simple sentence";
		int vCount=0;
		int cCount=0;
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i'|| ch[i]=='o' ||ch[i]=='u' )
				{
					vCount++;
				}
				else
				{
					cCount++;
				}
			}
		}
		
		System.out.println("No of vowels is :"+vCount);
		System.out.println("No of Consonent is :"+cCount);


	}

}
