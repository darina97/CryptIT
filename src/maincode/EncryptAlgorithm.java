package maincode;

public class EncryptAlgorithm 
{
	public static String encryptFibBil(String password,String key)
	{
		int a = 0, b = 1, c = 0, m = 0, k = 0, j = 0;
		String cipher = "", temp = "";
		StringBuffer pw = new StringBuffer(password);
		pw = pw.reverse();
		pw = pw.append(key);
		temp = pw.toString();
		char stringArray[] = temp.toCharArray();
		String evenString = "", oddString = "";
		char evenArray[];
		char oddArray[];
		for (int i = 0; i < stringArray.length; i++) 
		{
			if(i%2 == 0)
			{
				oddString = oddString + Character.toString(stringArray[i]);
			}
			else
			{
				evenString = evenString + Character.toString(stringArray[i]);
			}
		}
		evenArray = new char[evenString.length()];
		oddArray = new char[oddString.length()];
		while(m <= key.length())
		{
			if(m == 0)
				m = 1;
			else
			{
				a = b;
				b = c;
				c = a + b;
				for (int i = 0; i < evenString.length(); i++) 
				{
					int p = evenString.charAt(i);
					int cip = 0;
					if(p == '0' || p == '1' || p == '2' || p == '3' || p == '4' || p == '5' || p == '6'
							|| p == '7' || p == '8' || p == '9')
					{
						cip = p - c;
						if(cip < '0')
							cip = cip + 9;
					}
					else
					{
						cip = p - c;
						if(cip < 'a')
						{
							cip = cip + 26;
						}
					}
					evenArray[i] = (char) cip;
				}
				for (int i = 0; i < oddString.length(); i++) 
				{
					int p = oddString.charAt(i);
					int cip = 0;
					if(p == '0' || p == '1' || p == '2' || p == '3' || p == '4' || p == '5' || p == '6'
							|| p == '7' || p == '8' || p == '9')
					{
						cip = p + c;
						if(cip > '9')
							cip = cip - 9;
					}
					else
					{
						cip = p + c;
						if(cip > 'z')
						{
							cip = cip - 26;
						}
					}
					oddArray[i] = (char) cip;
				}
				m++;
			}
		}
		for (int i = 0; i < stringArray.length; i++) 
		{
			if(i%2 == 0)
			{
				stringArray[i] = oddArray[k];
				k++;
			}
			else
			{
				stringArray[i] = evenArray[j];
				j++;
			}
		}
		for (char d : stringArray) 
		{
			cipher = cipher + d;
		}
		return cipher;
	}
	public static String encryptCaesarCipher(String plain, int key)
	{
		String cipher="";
		for(int i=0;i<plain.length();i++)
		{
			int p=plain.charAt(i);
			int c=p+(key%26);
			if(c>'z')
			{
				c=c-26;
			}
			cipher+=(char) c;
		}
		return cipher;
	}
	public static String encryptViginereCipher(String plain, String key)
	{
		int p,k,c,j=0;
		String cipher="";
		for(int i=0 ; i<plain.length() ; i++)
		{
			p=plain.charAt(i);
			if(p==32)
			{
				c=p;
			}
			else
			{
				if(j<key.length())
				{
					k=key.charAt(j);
					j++;
				}
				else
				{
					j=0;
					k=key.charAt(j);
					j++;
				}
				p=p-96;
				k=k-96;
				c=((p+k)-1)%26;
				if(c>26)
				{	
					c=c-26;
				}
				c=c+96;
			}
			cipher+=(char) c;
		}
		return cipher;
	}
	public static String encryptRailFence(String plainText,int key)throws Exception
	{
		int r=key,len=plainText.length();
		int c=len/key;
		char mat[][]=new char[r][c];
		int k=0;

		String cipherText="";

		for(int i=0;i< c;i++)
		{
			for(int j=0;j< r;j++)
			{
				if(k!=len)
					mat[j][i]=plainText.charAt(k++);
				else
					mat[j][i]='X';
			}
		}
		for(int i=0;i< r;i++)
		{
			for(int j=0;j< c;j++)
			{
				cipherText+=mat[i][j];
			}
		}
		return cipherText;
	}
	public static String encryptColumnerCipher(String plain, int key)
	{
		int p;
		String cipher="";
		for(int i=0;i<key;i++)
		{
			for(int j=i;j<plain.length();j+=key)
			{
				p=plain.charAt(j);
				cipher+=(char) p;
			}
		}
		return cipher;
	}
}