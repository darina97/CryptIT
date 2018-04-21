package maincode;

public class DecryptAlgorithm 
{
	public static String decryptRailFence(String cipherText,int key)throws Exception
	{
		int r=key,len=cipherText.length();
		int c=len/key;
		char mat[][]=new char[r][c];
		int k=0;
		String plainText="";
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=cipherText.charAt(k++);
			}
		}
		for(int i=0;i< c;i++)
		{
			for(int j=0;j< r;j++)
			{
				plainText+=mat[j][i];
			}
		}
		return plainText;
	}
	public static String decryptCaesarCipher(String cipher, int key)
	{
		String plain="";
		for(int i=0;i<cipher.length();i++)
		{
			int p=cipher.charAt(i);
			int c=p-(key%26);
			if(c>'z')
			{
				c=c-26;
			}
			plain+=(char) c;
		}
		return plain;
	}
	public static String decryptFibBil(String cipher,String key)
	{
		int a = 0, b = 1, c = 0, m = 0, k = 0, j = 0;
		String plain = "";
		char cipherArray[] = cipher.toCharArray();
		String oddString = "", evenString = "";
		char evenArray[];
		char oddArray[];
		for (int i = 0; i < cipherArray.length; i++) 
		{
			if(i%2 == 0)
			{
				oddString = oddString + Character.toString(cipherArray[i]);
			}
			else
			{
				evenString = evenString + Character.toString(cipherArray[i]);
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
					evenArray[i] = (char) cip;
				}
				for (int i = 0; i < oddString.length(); i++) 
				{
					int p = oddString.charAt(i);
					int cip = 0;
					if(p == '0' || p == '1' || p == '2' || p == '3' || p == '4' || p == '5' || p == '6'
							|| p == '7' || p == '8' || p == '9')
					{
						cip = p - c;
						if(cip < '1')
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
					oddArray[i] = (char) cip;
				}
				m++;
			}
		}
		for (int i = 0; i < cipherArray.length; i++) 
		{
			if(i%2 == 0)
			{
				cipherArray[i] = oddArray[k];
				k++;
			}
			else
			{
				cipherArray[i] = evenArray[j];
				j++;
			}
		}
		for (char d : cipherArray) 
		{
			plain = plain + d;
		}
		StringBuffer plai = new StringBuffer(plain);
		plai.reverse();
		plain = plai.toString();
		plain = plain.substring(key.length());
		return plain;
	}
}
