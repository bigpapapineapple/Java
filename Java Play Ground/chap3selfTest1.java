class chap3selfTest1{
    public static void main(String args[])
    throws java.io.IOException{

        char ch;
        int spaces = 0;

        System.out.println("Enter period to stop.");

        do{
            ch = (char) System.in.read();
            if(ch == ' ') spaces++; 
        } while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}