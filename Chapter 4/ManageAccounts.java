public class ManageAccounts
{
    public static void main(String[] args)
    {
    Account acct1, acct2;
    acct1 = new Account(1000, "Sally", 1111);
    acct2 = new Account(500, "Joseph", 500);
    acct2.deposit(100);
    System.out.println(acct2.getBalance());
    acct2.withdraw(10);
    acct1.withdraw(100);
    System.out.println(acct1.getBalance());
    acct1.chargeFee(10);
    acct2.chargeFee(10);
    }
}