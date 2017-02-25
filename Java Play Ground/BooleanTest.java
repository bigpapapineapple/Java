// Creation! 10/20/16, it's true :)

class BooleanTest{
    public static void main(String args[]){
        boolean b;

        b = false;
        System.out.println(" b is " + b);
        b = true;
        System.out.println(" b is " + b);

        // This demonstrates how a boolean can control an if statement
        if(b) System.out.println("This is executed.");

        b = false;
        if(b) System.out.println("This is not executed.");

        // OUtcome of a relational operator is a boolean value

        System.out.println("10 > 9 is " + (10 > 9));
    }
}