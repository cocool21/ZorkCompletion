import java.util.Scanner;
import java.util.Random;
public class ZorkCompletion {
	static Scanner darkly = new Scanner(System.in);
	static boolean secret=false;
	static int counter=0;
	private static void roomDescribe(String where, String[] stuff, String directions)
	{
		System.out.println("You are in " + where);
		counter ++;
		System.out.println("You visted rooms "+counter+" times");
		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}
		System.out.println("You can go " + directions);
	}
	
	public static void room0()
	{
		System.out.println("You are outside of the house now.");
		System.out.println("Game over");
		System.out.println("Never come again.Hahahahaha");
	}
	
	public static void room1()
	{
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		String direct = " to the north (n) or the south (s)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("n")) 
		{
			room2();
			}else if(choice.equals("s")){
			room0();break;}	
			} while (1==1);
		
	}
	
	public static void room2()
	{
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a piano";
		String direct = " to the east (e), the south (s) or the west (w)";
		
		do
		{
			roomDescribe(place, things, direct);
			
			String choice = darkly.next();
			
			if (choice.equals("s")) 
			{
				room1();
			} else if (choice.equals("e")) 
			{
				room4();
			} else if (choice.equals("w")) 
			{
				room3();
			}
		} while (1==1);
	}
	public static void room3()
	{
		String place = "the Library";
		String[] things = new String[1];
		things[0] = "spiders";
		String direct = " to the north (n) or the east (e)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("n")) 
		{
			room5();
		}else if (choice.equals("e")){
			room2();
		}
		} while (1==1);
	}
	public static void room4()
	{
		String place = "the Kitchen";
		String[] things = new String[1];
		things[0] = "bats";
		String direct = " to the north (n) or the west (w)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("n")) 
		{
			room7();
		}else if (choice.equals("w")){
			room2();
		}
		} while (1==1);
	}
	public static void room5()
	{
		String place = "the Dining Room";
		String[] things = new String[1];
		things[0] = "dust and an empty box";
		String direct = " to the south (s)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("s")) 
		{
			room3();
		}
		} while (1==1);
	}
	public static void room6()
	{
		String place = "the Vault";
		String[] things = new String[1];
		things[0] = "three walking skeletons";
		Random rnd=new Random();
		int i=1+rnd.nextInt(4);
		if(i!=2){
			
		}else{
			secret=true;
		}
		if(secret==false){
		String direct = " to the east (e)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("e")) 
		{
			room7();
		}
		} while (1==1);}else{
			String direct = " to the east normal door(n) or secret door(s)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("n")) 
		{
			room7();
		}else if(choice.equals("s")){
			room8();
		}
		} while (1==1);
			
		}
	}
	public static void room7()
	{
		String place = "the Parlor";
		String[] things = new String[1];
		things[0] = "a treasure chest";
		String direct = " to the west (w) or the south (s)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("w")) 
		{
			room6();
		}else if(choice.equals("s")){
			room4();
		}
		} while (1==1);
	}
	public static void room8()
	{
		String place = "the Secret Room";
		String[] things = new String[1];
		things[0] = "piles of gold";
		String direct = " to the west (w)";
		
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("w")) 
		{
			room6();
		}
		} while (1==1);
	}
	
	
	public static void main(String[] args) {
		room1();
	}

}