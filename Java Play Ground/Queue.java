/* creation! my first Queue as 
    designed by Herbert Schildt ( i think,
    he wrote the book) -

    Update from above ^ 
    Making it all private
*/

class Queue {
    private char q[]; // this array is holding the Queue
    private int putloc, getloc; // defeining indices

    Queue(int size) {
        q = new char[size]; //allocating memory for the Queue
        putloc = getloc = 0;
    }

    //put a character into the Queue
    void put(char ch) {
        if(putloc==q.length) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
    }
    //get a charact from the Queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QueueT {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to stroe the alphabet.");
            // put numbers into bigQ
        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        //retrieve and display elements from bigQ

        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");

        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + 
                            (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        
        System.out.print("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();

            if(ch != (char) 0) System.out.print(ch);
        }
    }

}