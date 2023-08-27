package Problems;

public class ReverseInt {

        public static void reverse(int x)
        {
            boolean flag=false;
            double temp=0;

            if(x<0)
            {
                flag=true;
                x=x*-1;
            }
            while(x>0)
            {
                int rem=x%10;
                temp=temp*10+rem;
                x/=10;
            }
            if(flag==true)
            {
                temp=temp*-1;
            }


            if(temp>Integer.MAX_VALUE || temp<Integer.MIN_VALUE){
                System.out.println(0);
            }
            System.out.println((int)temp);
        }
        public static void main(String [] args){
            ReverseInt rn= new ReverseInt();
            rn.reverse(234567891);
        }
    }
