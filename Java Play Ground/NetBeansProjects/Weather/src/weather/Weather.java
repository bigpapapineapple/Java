public class Weather {
    
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " degress Fahrenheit is ...");
        //To convert Fahrenheit into Celsius
        //begin by subtractig 32
        fah = fah - 32;
        //Divide the answer by 9
        fah = fah / 9;
        //Multiply that answer by 5
        fah = fah * 5;
        System.out.println(fah + " degrees Celsisus\n ");
        
        float cel = 32;
        System.out.println(cel + " degrees Celsius is...");
        //To convert Celsisus into Fahrenheit
        //begin by multiplying by 9
        cel = cel *9;
        //Divde the answer by 5
        cel = cel / 5;
        //Add 32 to the answer
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheit");      
    }
}