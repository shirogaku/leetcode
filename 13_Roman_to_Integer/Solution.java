import java.util.HashMap;

class Solution {

    private HashMap hsMapper;

    private int getValue(char c){
        return ((Integer) hsMapper.get(Character.valueOf(c))).intValue();
    }

    public int romanToInt(String s) {
        hsMapper = new HashMap<Character, Integer>();
        hsMapper.put('I', 1);
        hsMapper.put('V', 5);
        hsMapper.put('X', 10);
        hsMapper.put('L', 50);
        hsMapper.put('C', 100);
        hsMapper.put('D', 500);
        hsMapper.put('M', 1000);

        if(s.length() == 1)
            return getValue(s.charAt(0));

        char oldChar = s.charAt(0);
        char currentChar;
        int value = getValue(oldChar);

        for(int i = 1; i < s.length(); i++) {
            currentChar = s.charAt(i);

            if(currentChar == oldChar)
                value += getValue(currentChar);
            else if(getValue(currentChar) > getValue(oldChar)){
                value -= getValue(oldChar);
                value += getValue(currentChar) - getValue(oldChar);
            }else {
                value += getValue(currentChar);
            }

            oldChar = currentChar;
        }            
        return value;
    }
}