public class Main {
    public static void main(String[] args) {

        System.out.println(numberToWords(28));
    }

    public static boolean isPalindrome(int x){
        int absNum = Math.abs(x);
        char[] numCharArray = String.valueOf(absNum).toCharArray();
        String reversed = "";

        for (int i = numCharArray.length-1; i>=0;i--){
            reversed += numCharArray[i];
        }

       return reversed.equals(String.valueOf(absNum));

    }

    public static boolean isPerfectNumber(int x) {
        int remainder = 0;

        for(int i=1 ; i<=x/2;i++){
            if(x % i == 0){
                remainder += i;
            }
        }

        if(x<=0){
            return false;
        }

        return remainder == x;
    }

    public static String numberToWords(int x){
        if(x<=0){
            return "Invalid Value";
        }

        char[] digits = String.valueOf(x).toCharArray();
        String numToText = "";

        for(char digit:digits){
            switch (digit){
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }

        }
        return numToText.trim();

    }


}