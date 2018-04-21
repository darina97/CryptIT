package maincode;

public class EncryptAlgorithm 
{
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
