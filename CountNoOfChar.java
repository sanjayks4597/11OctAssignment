
public class CountNoOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="The best of both worlds";
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isWhitespace(ch[i]) )
			{
				continue;
			}
			count++;
		}
		System.out.println(count);

	}

}
