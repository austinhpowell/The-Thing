package thing;
import java.util.Random;

public class Human {
	//qualities
	static String eye="";
	static String name="";
	static String persona="";
	static int crazy=0;
	
	//potential human quality matricies
	static String[] potentialeyes={"blue", "green", "brown", "grey","hazel","teal", "violet"};
	static String[] potentialpersona={"timidly", "aggressively", "absentmindedly", "skitishly","calmly", "curiously", "coldly", "bravely",
			"mysteriously", "meanly", "obediently"};
	
	
 Human(String namein){
		name=namein;
		Random rand = new Random();
		
		//choose random eyecolor
		int eyechoice=rand.nextInt(potentialeyes.length);
		eye=potentialeyes[eyechoice];
		//choose random persona
		int personachoice=rand.nextInt(potentialpersona.length);
		persona=potentialpersona[personachoice];
		//choose craziness
		crazy=rand.nextInt(100)+1;
		
	}
public String getname(){
	return(name);
	
}
public String geteyes(){
	return(eye);
	
}
public String getpersona(){
	return(persona);
	
}
public String getcrazy(){
	
	return(Integer.toString(crazy));
	
}
}
