package Strings;

class ReversingCharacter{
    public static void main(String[] args) {
        String input = "hello";
        String output = reverseChar(input);
        System.out.print("The reversed string is:- "+ output);
    }

    private static String reverseChar(String input) {
        char[] output = input.trim().toCharArray();
        int left = 0;
        int right = output.length - 1;

        while(left < right){
            char temp = output[left];
            output[left] = output[right];
            output[right] = temp;

            left++;
            right--;
        }


        return new String(output);

        //method 2 

        // StringBuilder sb = new StringBuilder(input);
        // sb.reverse();

        // return sb.toString();

    }
}