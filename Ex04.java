import java.util.Random;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args){
	int count1=0;
	int count2=0;
	Scanner sc =new Scanner(System.in);
	Random rnd = new Random();
	System.out.println("Who are you");
	System.out.print("> ");
	String name=sc.next();
	System.out.println(name);
	System.out.println("Hello, "+name+"!");
	System.out.println("Tossing a coin...");
	for(int i=1;i<=3;i++){
	    int result=rnd.nextInt()%2;
	    System.out.println("Round"+i+": ");
	    if(result==0){
		System.out.println("Heads");
		count1++;
	    }
	    else{
		System.out.println("Tails");
		count2++;
	    }
	}
	System.out.println("Heads: "+count1+"Tails: "+count2);
	if(count1>count2)System.out.println("You won");
	else System.out.println("You lost");
    }
    
}
