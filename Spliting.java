
public class Spliting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="helo world";
		String s2="helo,world";
		String s3="helo; world";
		String []str=s1.split(" ");
		String []str1=s1.split(",");
		String []str2=s1.split(";");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}
