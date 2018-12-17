import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//输出Hello world语句
		System.out.println("Hello World!");
		if(!check())//if语句永远是判断为不为true
		{
			System.out.println("成功");
			
		}
		else
		{
			System.out.println("failed");
		}
		System.out.println(new Main().returnShuzi());
		
	}
	static boolean check()
	{
		return false;
	}
	int returnShuzi()
	{
		
		return 79;
	}
}
