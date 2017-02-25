class Encode {
    public static void main(String args[]){
        String msg = "big papa is a boss, but you already knew that";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Original message: ");
        System.out.println(msg);

        //encode the message
        j=0;
        for(int i = 0; i < msg.length(); i++){
            encmsg = encmsg + (char) (msg.charAt (i) ^ key.charAt(j));
        j++;
        if(j==8) j = 0;
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        //decode it
        j=0;
        for(int i = 0; i < msg.length(); i++){
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
        j++;
        if(j==8) j = 0;
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);

    }
}