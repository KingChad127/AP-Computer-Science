public class Tester
{
    public static void main(String[] args)
    {
        Company company = new Company();

        System.out.println(company);
        System.out.println();

        company.processRetirements();

        System.out.println(company);
        System.out.println();
    }
}
