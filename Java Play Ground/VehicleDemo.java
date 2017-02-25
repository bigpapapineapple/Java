/* A program that uses the Vehicle Class

creation! 11/13/2016. Nice day out side. Javqui and I took
Jade for a walk. She fell asleep. Now she's napping and i'm
writing JAVA.
*/

/*edit v2, adding on a parameterized
method to this class
*/

class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
}

class VehicleDemo{
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can cary " + minivan.passengers +
                            " with a range of " + range);
     }
}