package translating_names;

import static java.lang.String.valueOf;

public class sketch {

    public String indexOfCapital(String name) {
        int count = name.length();
        char[] newChar = name.toCharArray();

        for(int i = 0; i < count; i++){
            if (Character.isUpperCase(name.charAt(i))){
                newChar[i] = Character.toLowerCase(name.charAt(i));
            }
        }
        return valueOf(newChar);
    }
}
