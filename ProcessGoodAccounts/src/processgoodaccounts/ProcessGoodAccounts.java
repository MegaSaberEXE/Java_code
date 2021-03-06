package processgoodaccounts;

import static java.lang.System.out;
import java.util.Random;
import java.text.NumberFormat;

class GoodAccount {
    
    String lastName;
    int id;
    double balance;
    
    double getInterest(double rate) {
        
        double interest;
        
        out.print("Adding ");  
        out.print(rate);
        out.println(" percent...");
        interest = balance * (rate / 100.0);
        return interest;
    }
    void display() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        out.print("The account with last name ");
        out.print(lastName);
        out.print(" and ID number ");
        out.print(id);
        out.print(" has balance ");
        out.println(currency.format(balance));
    }
}

class ProcessGoodAccounts {
    public static void main(String args[]) {
        
        Random myRandom = new Random();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        GoodAccount anAccount;
        
        double interestRate;
        double yearlyInterest;
        
        for (int i = 0; i < 3; i++) {
            anAccount = new GoodAccount();
            anAccount.lastName = "" + (char) (myRandom.nextInt(26) + 'A') + (char) (myRandom.nextInt(26) + 'a') + (char) (myRandom.nextInt(26) + 'a');        
            anAccount.id = myRandom.nextInt(10000);
            anAccount.balance = myRandom.nextInt(10000);
            anAccount.display();
            interestRate = myRandom.nextInt(5);
            yearlyInterest = anAccount.getInterest(interestRate);
            System.out.print("This year’s interest is ");
            System.out.println(currency.format(yearlyInterest));
            System.out.println();
        }
    }
}

// Listing 19-8: A Method That Returns a Value
// Calling the Method in Listing 19-8