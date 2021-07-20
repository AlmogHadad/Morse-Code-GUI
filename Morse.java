import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/** Responsible for encoding strings into morse */
public class Morse {
  private Map<Character, String> charToMorse;

  public Morse() {

    charToMorse = new HashMap<Character, String>();
    /* Numbers */
    charToMorse.put('0', " − − − − − /");
    charToMorse.put('1', " − − − − · /");
    charToMorse.put('2', " − − − · · /");
    charToMorse.put('3', " − − · · · /");
    charToMorse.put('4', " − · · · · /");
    charToMorse.put('5', " · · · · · /");
    charToMorse.put('6', " · · · · − /");
    charToMorse.put('7', " · · · − − /");
    charToMorse.put('8', " · · − − − /");
    charToMorse.put('9', " · − − − − /");
    /* lettters */
    charToMorse.put('a', " · − /");
    charToMorse.put('b', " − · · · /");
    charToMorse.put('c', " · − · −  /");
    charToMorse.put('d', " − · · /");
    charToMorse.put('e', " · /");
    charToMorse.put('f', " · · − · /");
    charToMorse.put('g', " − − · /");
    charToMorse.put('h', " · · · · /");
    charToMorse.put('i', " · · /");
    charToMorse.put('j', " · − − − /");
    charToMorse.put('k', " − · − /");
    charToMorse.put('l', " · − · · /");
    charToMorse.put('m', " − − /");
    charToMorse.put('n', " − · /");
    charToMorse.put('o', " − − − /");
    charToMorse.put('p', " · − − · /");
    charToMorse.put('q', " − − · − /");
    charToMorse.put('r', " · − · /");
    charToMorse.put('s', " · · · /");
    charToMorse.put('t', " − /");
    charToMorse.put('u', " · · − /");
    charToMorse.put('v', " · · · − /");
    charToMorse.put('w', " · − − /");
    charToMorse.put('x', " − · · − /");
    charToMorse.put('y', " − · − − /");
    charToMorse.put('z', " − − · · /");
  }

  /** Converts given string to its morse encoding
  */
  public String convertToMorse(String toEncode)
  {
    StringBuilder morseBuilder = new StringBuilder();
    for (int i=0; i < toEncode.length(); ++i)
    {
    	String morseForChar;
    	if(toEncode.charAt(i)==' ')
    		morseForChar = "\n"; 
    	else
    		morseForChar = charToMorse.get(toEncode.charAt(i));
      
    	if (morseForChar != null)
    		morseBuilder.append(morseForChar);
    
   
    }
    return morseBuilder.toString();
  }
}
