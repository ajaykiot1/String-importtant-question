package com.string;
public class MyStringAPI
{
	static int count;
	public static int wordCount(String s)
	{
		return 0;
	}
	public static int spaceCount(String s)
	{
		count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		return count;
	}
	public static int charCount(String s)
	{
		count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				continue;
			}
			else
				count++;
		}		
		return count;
	}
	
	public static String myReverse(String str)
	{
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		return temp;
		
		/*char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];
		int j=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			ch1[j]=ch[i];
			j++;
		}
		return new String(ch1);*/
		
	}
	
	public static boolean isPalindrome(String str)
	{
		if(str.equals(myReverse(str)))
			return true;
		else
			return false;
	}
	
	
	public static String lTrim(String s)
	{
		byte b[]=s.getBytes();		
		int j=0;
		int k=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<=32)
			{
				j=i;
				continue;
			}
			else
				break;
		}
		
		byte b1[]=new byte[b.length-j];
		
		for(int n=j;n<b.length;n++)
		{
			b1[k]=b[n];
			k++;
		}
		return new String(b1);
	}	
	
	public static String rTrim(String s)
	{
		byte b[]=s.getBytes();
		int j=0;
		for(int i=b.length-1;i>=0;i--)
		{
			if(b[i]==32)
			{
				j=i;
				continue;
			}
			else
				break;
		}
		int k=0;
		byte b1[]=null;		
		if(b[b.length-1]==32)
		{
			b1=new byte[j];
		}
		else if(b[b.length-1]>32)
		{
			b1=new byte[b.length];
		}
		for(int i=0;i<j;i++)
		{
			b1[k]=b[i];
			k++;
		}
		
		return new String(b1);		
	}
	
	public static String allTrim(String s)
	{
		String str=rTrim(s);
		String str1=lTrim(str);
		return str1;
	} 
	
	public static String squeeze(String str)
	{
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				continue;
			else
				temp=temp+str.charAt(i);
		}
		return temp;
	}
	
	public static int vowelCount(String str)
	{
		count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				count++;
			}
		}
		return count;
	}
	
	public static int myLength(String str)
	{
		char ch[]=str.toCharArray();
		count=0;
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		/*
		for(char ch:str.toCharArray())
			count++;
		*/
		return count;
	}
	
	public static String changeCase(String str)
	{
		byte b[]=str.getBytes();
		for(int i=0;i<b.length;i++)
		{
			if(b[i]<=90&&b[i]>=65)
			{
				b[i]=(byte)(b[i]+32);
			}
			else if(b[i]<=122&&b[i]>=97)
			{
				b[i]=(byte)(b[i]-32);
			}
		}
		return new String(b);
	}
	
	public static String singleOccurance(String str)
	{
		String temp="";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				continue;
			}
				
			else
				temp=temp+str.charAt(i);
		}
		return temp+str.charAt(str.length()-1);
		
	}
	
	public static boolean find(String str,String str1)
	{
		String temp[]=str.split(" ");
		for(int i=0;i<temp.length;i++)
		{
			if(myEquals(str1,temp[i]))
			{
				break;
			}
			else
				return false;
		}
		return true;
	}
	
	public static boolean myEquals(String str,String str1)
	{
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		int j=0;
		int flag=0;
		if(ch.length==ch1.length)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==ch1[j])
				{
					flag=1;
				}
				else
				{
					flag=0;
					break;
				}
				j++;
			}
		}
		else
			return false;
		
		if(flag==1)
			return true;
		if(flag==0)
			return false;
		return false;
	}
	
	public static String mySubstring(String str,int index1, int index2)
	{
		String temp="";
		for(int i=index1;i<index2;i++)
		{
			temp=temp+myCharAt(str,index1);
		}
		return temp;
	}
	
	public static char myCharAt(String str,int index)
	{
		char ch[]=str.toCharArray();
		return ch[index];
	}
	
	public static void triangle(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println("");
		}		
	}
	
	public static void triangle1(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.println("");
		}		
	}
	
	public static void triangle2(String str)
	{
		int t=0;		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=t;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=t;k<ch.length;k++)
			{
				System.out.print(ch[k]);
			}
			t++;
			System.out.println("");
		}
	}
	
	public static void triangle3(String str)
	{
		int t=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				System.out.print(str.charAt(j));
			}
			for(int l=t;l>=0;l--)
			{
				System.out.print(" "+" ");
			}
			for(int k=t;k<str.length();k++)
			{
				System.out.print(str.charAt(k));
			}
			t++;
			
			System.out.println("");
		}		
	}
}
