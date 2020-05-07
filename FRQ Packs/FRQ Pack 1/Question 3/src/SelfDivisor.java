public class SelfDivisor
{
    //***********
    // Part (a)
    //***********
    /** @param number the number to be tested
     *         Precondition: number > 0
     *  @return true if every decimal digit of number is a divisor of number;
     *         false otherwise
     */
    public static boolean isSelfDivisor(int number)
    {
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length(); i++)
        {
            int digit = Integer.parseInt(numberStr.substring(i, i + 1));
            if(digit == 0)
            {
                return false;
            }
            if(number % digit != 0)
            {
                return false;
            }
        }
        return true;
    }

    // Part (b)
    //************
    /** @param starting point for values to be checked
     *         Precondition: start > 0
     *  @param num the size of the array to be returned
     *         Precondition: num > 0
     *  @return an array containing the first num integers >= start that are self-divisors
     */
    public static int[] firstNumSelfDivisors(int start, int num)
    {
        int[] selfDivisors = new int[num];
        int currentNumber = start;
        int count = 0;
        while(count < num)
        {
            if(isSelfDivisor(currentNumber))
            {
                selfDivisors[count] = currentNumber;
                count++;
            }
            currentNumber++;
        }
        return selfDivisors;
    }
}
