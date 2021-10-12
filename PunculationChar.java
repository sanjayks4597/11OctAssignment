
public class PunculationChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="  He said, 'The mailman loves you.' I heard it with my own ears.";
		char []ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i])||Character.isWhitespace(ch[i]))
			{
				continue;
			}
			count++;
		}
		System.out.print(count);

	}

}
