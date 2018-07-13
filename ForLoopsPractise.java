public class ForLoopsPractise {

    public static void main(String[] args) {
        //Printing even numbers to 50
        System.out.println("Even numbers up to 50");
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        }
        System.out.println("--------------End of for loop-----------------");

        System.out.println("Fibonacci Series:");
        //Here we use the if and else statements outlined in the previous video
        //We can change the number of terms in the sequence by changing the numTerms variable
        int numTerms = 10;

        //represents the first and second terms in the sequence
        int first=0;
        int second=1;

        for(int i = 0; i < numTerms ; i++) {
            int next;
            //since its the sum of the previous two numbers, needs to have at least two previous terms
            if(i <= 1) {
                next = i;
            }
            else {
                next = first + second;
                first = second;
                second = next;
            }
            //I've added the "  " below to act as a space between the numbers
            System.out.print(next + "  ");
        }



    }
}
