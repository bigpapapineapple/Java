class volcanoApplication{
    public static void main(String[] arguments) {
        VolcanoRobot dante = new VolcanoRobot();
        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;
        
        dante.showAttributes();
        System.out.print("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();
        System.out.println("Changing temperature to 6770.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
    }
}