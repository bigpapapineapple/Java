/* Creation! 10/18/2016 - learning Java
    creating a table of conversion of liters and gallons
    LOLA devlopers taught me this commenting - Mike Relova
*/

class GalToLitTable{
    public static void main(String args[]){
        double gallons, liters;
        int counter;

        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854; //converting gallons to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;
            //every 10th line, print blank line
            if(counter == 10) {
                System.out.println();
                counter = 0; //reset the line counter
            }
        }
    }
}
