import java.util.Random;
public class Ex04 {
    public static void main(String[] args){
	int count1=0;
	int count2=0;
	Random rnd = new Random();
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
    }
    
}
