class Solution {
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }
        String str = "";
        if(x < 0){
            x = (x*-1);
            while(x != 0){
                str += x % 10;
                x = x / 10;
            }
        try{
            x = Integer.parseInt(str);
        }
        catch (NumberFormatException e) { 
            // This is thrown when the String 
            // contains characters other than digits 
            return 0; 
        } 
            x = (x*-1);
        return x;
        }
        
        while(x != 0){
            str += x % 10;
            x = x / 10;
        }
        try{
            x = Integer.parseInt(str); 
        }
        catch(NumberFormatException e){
            return 0;
        }
        return x;
    }
}


