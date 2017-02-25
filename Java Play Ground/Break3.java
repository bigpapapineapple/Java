class Break3{
    public static void main(String args[]){

        for(int i=0; i<30; i++) {
            System.out.println("OUter loop count: " + i);
            System.out.print("      Inner loop count: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) //break; //terminating loop if t is 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("loops complete!");
    }
}