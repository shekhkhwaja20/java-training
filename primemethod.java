public class primemethod {
    static int prime(int a)
    {
    int count=-1;
    
        if(a<=1)
        {
            System.out.println("is not a prime number");
        }
        else if(a==2)
        {
            System.out.println("2 is first prime number");
        }
           else if(a==3)
        {
            System.out.println("2 is first prime number");
        }
        else{
            for(int i=4;i<a;i++)
            {
                if(a%i==0)
                {
                  count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int count =prime(8);
        if(count==-1){
            System.out.println("number is prime ");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
