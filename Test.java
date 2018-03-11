public class Test {
    public static void main (String [] args){

        Account account1=new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);

        System.out.println("Id: "+account1.getId());
        System.out.println("Date created: " + account1.getDateCreated());
        System.out.println("Balance: "+ account1.getBalance());
        System.out.println("Monthly Interest: "+ account1.getMonthlyInterest());

    }
}

