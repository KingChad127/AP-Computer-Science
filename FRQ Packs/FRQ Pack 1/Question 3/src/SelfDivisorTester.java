public class SelfDivisorTester
{
    public static void main(String[] args)
    {
        int num = 128;
        if(SelfDivisor.isSelfDivisor(num))
        {
            System.out.println(num + " is a self-divisor.");
        }
        else
        {
            System.out.println(num + " is not a self-divisor.");
        }

        num = 26;
        if(SelfDivisor.isSelfDivisor(num))
        {
            System.out.println(num + " is a self-divisor.");
        }
        else
        {
            System.out.println(num + " is not a self-divisor.");
        }

        num = 420;
        if(SelfDivisor.isSelfDivisor(num))
        {
            System.out.println(num + " is a self-divisor.");
        }
        else
        {
            System.out.println(num + " is not a self-divisor.");
        }

        // Test firsNumSelfDivisors
        System.out.println();
        int[] list = SelfDivisor.firstNumSelfDivisors(20, 5);
        System.out.print("firstNumSelfDivisors(20, 5)-->");
        print(list);
        list = SelfDivisor.firstNumSelfDivisors(500, 10);
        System.out.print("firstNumSelfDivisors(500, 10)-->");
        print(list);
        System.out.println();
    }

    public static void print(int[] list)
    {
        for(int n : list)
        {
            System.out.print(n +  " ");
        }
        System.out.println();
    }
}
