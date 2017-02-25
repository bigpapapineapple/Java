/* A program that uses the Vehicle Class

creation! 11/13/2016. Nice day out side. Javqui and I took
Jade for a walk. She fell asleep. Now she's napping and i'm
writing JAVA.
*/

/*edit v2, adding on a parameterized
method to this class and basically re-writing the whole damn thing.

going up north tomorrow to shoot a big deer
drinking molson xxx, about to have a sip of JD (nice)
*/

class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;

    int range () {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel{
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 16;
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        //range = minivan.fuelcap * minivan.mpg;
        
        /*System.out.println("Minivan can cary " + minivan.passengers +
                            " with a range of " + range);
        */
        
        System.out.println("To go " + dist + " miles minivan needs " + 
                            gallons + " gallons of fuel.");
        
        gallons = sportscar.fuelneeded(dist);
     
        System.out.println("To go " + dist + " miles sportscar needs " + 
                            gallons + " gallons of fule.");
     
     
     }
}