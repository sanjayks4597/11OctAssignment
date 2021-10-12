
public class panegram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Two driven jocks help fax my big quiz";
		str=str.toLowerCase();
		boolean flag=true;
		char []ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','z'};
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if((str.charAt(i))==ch[j])
				{
					ch[j]='1';
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='1')
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
			System.out.print("Not a panigram");
		}
		else
		{
			System.out.print(" a panigram");
		}
	}

}
