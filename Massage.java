import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Massage {
	private Map<String, String> MorsetoChar;

	public Massage(){
	MorsetoChar = new HashMap<String, String>();
		/* Numbers */
		MorsetoChar.put("−−−−−", "0");
		MorsetoChar.put("−−−−·", "1");
		MorsetoChar.put("−−−··", "2");
	    MorsetoChar.put("−−···", "3");
	    MorsetoChar.put("−····", "4");
	    MorsetoChar.put("·····", "5");
	    MorsetoChar.put("····−", "6");
	    MorsetoChar.put("···−−", "7");
	    MorsetoChar.put("··−−−", "8");
	    MorsetoChar.put("·−−−−", "9");
	    /* lettters */
	    MorsetoChar.put("·−", "a");
	    MorsetoChar.put("−···", "b");
	    MorsetoChar.put("·−·−", "c");
	    MorsetoChar.put("−··", "d");
	    MorsetoChar.put("·", "e");
	    MorsetoChar.put("··−·", "f");
	    MorsetoChar.put("−−·", "g");
	    MorsetoChar.put("····", "h");
	    MorsetoChar.put("··", "i");
	    MorsetoChar.put("·−−−", "j");
	    MorsetoChar.put("−·−", "k");
	    MorsetoChar.put("·−··", "l");
	    MorsetoChar.put("−−", "m");
	    MorsetoChar.put("−·", "n");
	    MorsetoChar.put("−−−", "o");
	    MorsetoChar.put("·−−·", "p");
	    MorsetoChar.put("−−·−", "q");
	    MorsetoChar.put("·−·", "r");
	    MorsetoChar.put("···", "s");
	    MorsetoChar.put("−", "t");
	    MorsetoChar.put("··−", "u");
	    MorsetoChar.put("···−", "v");
	    MorsetoChar.put("·−−", "w");
	    MorsetoChar.put("−··−", "x");
	    MorsetoChar.put("−·−−", "y");
	    MorsetoChar.put("−−··", "z");
	  }
	  /* Converts given string to its morse encoding get(toEncode.charAt(i))*/
	  public String convertToMassage(String toEncode){
	    StringBuilder massageBuilder = new StringBuilder();
	    String MorseandChar = MorsetoChar.get(toEncode);
	   	massageBuilder.append(MorseandChar);
	    return massageBuilder.toString();
	  	}
	  }

