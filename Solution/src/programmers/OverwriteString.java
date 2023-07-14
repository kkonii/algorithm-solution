package programmers;

public class OverwriteString {
	public String overwriteString(String my_string, String overwrite_string, int s) {
		String answer = "";
		
        int ow_len = overwrite_string.length();
        int ms_len = my_string.length();
        
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+ow_len,ms_len);
        
        return answer;
	}
}
