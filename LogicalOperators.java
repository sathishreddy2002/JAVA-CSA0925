public class LogicalOperators {
    public static void main(String[] args) {
       boolean resultOR1 = false || true; 
        boolean resultOR2 = false || false; 
        System.out.println("false || true = " + resultOR1);
        System.out.println("false || false = " + resultOR2);
        boolean resultAND1 = true && true;
        boolean resultAND2 = true && false; 
        System.out.println("true && true = " + resultAND1);
        System.out.println("true && false = " + resultAND2);
        boolean resultNOT1 = !true; // result is false
        boolean resultNOT2 = !false; // result is true
        System.out.println("!true = " + resultNOT1);
        System.out.println("!false = " + resultNOT2);
    }
}
