package Step_semester_3.src.main.java.s3_ControlFlow.assigment_problems;

public class PrintNumbers {

    static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbersUpToN(5);
    }
}
