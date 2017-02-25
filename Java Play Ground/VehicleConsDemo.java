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

    //adding on a constructor

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleConsDemo{
    
    public static void main(String args[]){
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                            gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " sportscar minivan needs " +
                            gallons + " gallons of fuel.");
     }
}