
// verilen string i tersine cevir . '123456' -> '654321'

public class ReverseQuestion {
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        int number = 123456;
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
             stack.push(Integer.valueOf(numberString.charAt(i) - '0'));
        }

        int carpim = 10;
        int result = 0;
        while(stack.size() != 0){
            result *= carpim;
            result += stack.pop();
        }
        System.out.println("Before reversed number : " + number);
        System.out.println("After reversed number : " + result);

    }
}
