/* Creation! feet to inch program. 
    First attempt at making my own program

    task is to create a program that 
    prints the conversion of, inch by inch, of 12 feet. 
    */

class FeetToInch {
    public static void main(String args[]){
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++){
            meters = inches / 39.37;
            System.out.println(meters + " meters = " + inches + " inches.");

            counter++;
            if(counter == 12) {
                System.out.println();
                counter=0;
            }
        }
    }
}