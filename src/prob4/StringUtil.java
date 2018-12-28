package prob4;

public class StringUtil {
	public static String concatenate(String[] s1) {
		String resultStr="";
		for(int i=0;i<s1.length;i++) {
			resultStr+=s1[i];
		}

		return resultStr;
	}
}
