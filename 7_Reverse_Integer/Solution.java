class Solution {
    public int reverse(int x) {
        String strX = Integer.toString(x);
        StringBuffer strbuffX = new StringBuffer();
        int value = 0;

        if(strX.charAt(0) == '-') {
            for(int i = strX.length() - 1; i >= 1; i--) {
                strbuffX.append(strX.charAt(i));
            }
            try {
                value = Integer.parseInt(strbuffX.toString());
                value = -(value);
            }catch(NumberFormatException e) {
                return 0;
            }
        }else {
            for(int i = strX.length() - 1; i >= 0; i--) {
                strbuffX.append(strX.charAt(i));
            }
            try {
                value = Integer.parseInt(strbuffX.toString());
            }catch(NumberFormatException e) {
                return 0;
            }
        }
        
        return value;
    }
}