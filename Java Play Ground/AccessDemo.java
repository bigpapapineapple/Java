// public vs private classes

class MyClass {
    private int alpha;      // private obviously
    public int beta;        // public
    int gamma;              // default = public(ish)

    /* Methods to access alpha. IT is OK for a 
    member of a class to access a private member 
    as long as they're the same class 
    */

    void setAlpha (int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String args[]) {
        MyClass ob = new MyClass();

        // access to alpha is only allowed through its accessor Methods

        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // You cannot access Alpha like this;
        //ob.alpha=10; //Alpha is private

        ob.beta = 88;
        ob.gamma = 99;
    }
}