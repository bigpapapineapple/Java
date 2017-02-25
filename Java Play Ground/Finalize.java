class Fdemo {
    int x; 

    Fdemo(int i) {
        x = i;
    }
    protected void finalize () {
        System.out.println("Finalizing " + x);
    }

    void generator (int i) {
        Fdemo o = new Fdemo(i);
    }
}

class Finalize {
    public static void main(String args[]){
        int count;

        Fdemo ob = new Fdemo(0);

        /* now we'll create a large number of objects. 
        At some point, garbage collecting will happen.
        note: we may need to increase the number of objects
        generated in order to force garbage collection
        */
        
    for(count=1; count < 1000000; count++)
        ob.generator(count);
    }
}