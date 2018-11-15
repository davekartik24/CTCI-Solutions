

class StringCompressionWithTwoPointers {

    public String compress(String inputString) {

    	char[] chars = inputString.toCharArray();
        
        int inputLenght = chars.length;

        String result = "";
        
        if(inputLenght == 0) return result;
   
        
        int count = 1;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < inputLenght - 1; i++) {
            
            if(chars[i] != chars[i + 1]) {
                
                sb.append(chars[i]);
                sb.append(count);
                count = 1;
            } else {

            	count++;

            }
            
        }
        
        sb.append(chars[inputLenght - 1]);
        sb.append(count);

        result = sb.toString();
        
        if(inputLenght <= result.length()) {
            
            return inputString;
            
        } 
        
        return result;
        
    }

    public static void main(String[] args) {

    	StringCompressionWithTwoPointers testInstance = new StringCompressionWithTwoPointers();

    	System.out.println("The result is : " + testInstance.compress("aaaaaaaaaaa"));
    }
}