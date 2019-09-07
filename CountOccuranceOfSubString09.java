
public class CountOccuranceOfSubString09 {
	static int subStr(String sentence,  
            String substring) 
{ 
int sentenceLen = sentence.length(); 
int substringLen = substring.length(); 


if (sentenceLen == 0 || sentenceLen < substringLen) 
return 0; 

if (sentence.substring(0, substringLen).equals(substring)) 
return subStr(sentence.substring(substringLen - 1),  
                               substring) + 1; 

return subStr(sentence.substring(substringLen),  
                           substring); 
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subStr("Hello How are How You", "How"));

	}

}
