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
}
