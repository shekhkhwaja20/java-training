public class typeconversion {

    public static void main(String[] args) {
        //float to int
        float f=25.99f;
        int n=(int)f;
        System.out.println("float to int:"+n);
        //Byte to overflow
        byte b1=127;
        b1++;
        System.out.println("byte to overflow:"+b1);
    }
}
