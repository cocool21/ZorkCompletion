import java.util.Scanner;
import java.util.Random;
public class ZorkCompletion {
	static Scanner darkly = new Scanner(System.in);
	static Random rnd=new Random();
	static boolean secret=false, quit=false;
	static int counter=0;
	static int skeleton=0,box=0,dust=0;
	static int piano=0,scorpion=0;
	static int gold=0,spiders=0;
	static int chest=0,bats=0;
	static int m1=rnd.nextInt(1001),m2=rnd.nextInt(1001),m3=rnd.nextInt(1001);
	static int m4=rnd.nextInt(1001),m5=rnd.nextInt(1001),m6=rnd.nextInt(1001);
	static int m7=rnd.nextInt(1001),m8=rnd.nextInt(1001),money=0;
	private static void roomDescribe(String where, String[] stuff, String directions)
	{
		System.out.println("You are in " + where);
		System.out.println("You visted rooms "+counter+" times");
		for (String thing : stuff) {
			System.out.println("You see " + thing);
		}
		System.out.println("You can go " + directions);
		
	}
	
	public static void room0()
	{
		int i=1+rnd.nextInt(4);
		System.out.println("You are outside of the house now.");
		System.out.println("Game over");
		System.out.println("Never come again.Hahahahaha");
		System.out.println("You saw scorpion "+scorpion+" times");
		System.out.println("You saw piano "+piano+" times");
		System.out.println("You saw spiders "+spiders+" times");
		System.out.println("You saw dust "+dust+" times");
		System.out.println("You saw empty box "+box+" times");
		System.out.println("You saw bats "+bats+" times");
		System.out.println("You saw treasure chest "+chest+" times");
		System.out.println("You saw walking skeletons "+skeleton+" times");
		System.out.println("You saw gold "+gold+" times");
		System.out.println("You have "+money+" dollars in your pocket.");
		if (i==2){
		System.out.println("You are followed by a ghost of zork, hahahahahahaha");	
		}
		
	}
	
	public static void room1()
	{
		String place = "the Foyer";
		String[] things = new String[1];
		things[0] = "a dead scorpion";
		String direct = " to the north (n) or the south (s)";
		scorpion++;
		counter ++;
		if(m1!=0){
			money+=m1;
			m1=0;
		}
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("n")) 
		{
			room2();break;
			}else if(choice.equals("s")){
			    quit=true;
				room0();break;}	
			} while (quit==false);
		
	}
	
	public static void room2()
	{
		String place = "the Front Room";
		String[] things = new String[1];
		things[0] = "a piano";
		String direct = " to the east (e), the south (s) or the west (w)";
		piano ++;
		counter ++;
		if(m2!=0){
			money+=m2;
			m2=0;
		}
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
		} while (quit==false);
	}
	public static void room3()
	{
		String place = "the Library";
		String[] things = new String[1];
		things[0] = "spiders";
		String direct = " to the north (n) or the east (e)";
		spiders ++;
		counter ++;
		if(m3!=0){
			money+=m3;
			m3=0;
		}
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
		} while (quit==false);
	}
	public static void room4()
	{
		String place = "the Kitchen";
		String[] things = new String[1];
		things[0] = "bats";
		String direct = " to the north (n) or the west (w)";
		bats ++;
		counter ++;
		if(m4!=0){
			money+=m4;
			m4=0;
		}
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
		} while (quit==false);
	}
	public static void room5()
	{
		String place = "the Dining Room";
		String[] things = new String[1];
		things[0] = "dust and an empty box";
		String direct = " to the south (s)";
		dust ++;
		box ++;
		counter ++;
		if(m5!=0){
			money+=m5;
			m5=0;
		}
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("s")) 
		{
			room3();
		}
		} while (quit==false);
	}
	public static void room6()
	{
		String place = "the Vault";
		String[] things = new String[1];
		things[0] = "three walking skeletons";
		skeleton ++;
		counter ++;
		if(m6!=0){
			money+=m6;
			m6=0;
		}
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
		} while (quit==false);}else{
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
		} while (quit==false);
			
		}
	}
	public static void room7()
	{
		String place = "the Parlor";
		String[] things = new String[1];
		things[0] = "a treasure chest";
		String direct = " to the west (w) or the south (s)";
		chest ++;
		counter ++;
		if(m7!=0){
			money+=m7;
			m7=0;
		}
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
		} while (quit==false);
	}
	public static void room8()
	{
		String place = "the Secret Room";
		String[] things = new String[1];
		things[0] = "piles of gold";
		String direct = " to the west (w)";
		gold ++;
		counter ++;
		if(m8!=0){
			money+=m8;
			m8=0;
		}
		do
		{
		roomDescribe(place, things, direct);
		
		String choice = darkly.next();
		
		if (choice.equals("w")) 
		{
			room6();
		}
		} while (quit==false);
	}
	
	
	public static void main(String[] args) {
	
			room1();
	}

}