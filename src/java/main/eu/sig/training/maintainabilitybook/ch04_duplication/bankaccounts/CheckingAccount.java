package main.eu.sig.training.maintainabilitybook.ch04_duplication.bankaccounts;

/**
 * 
 */
// tag::CheckingAccount[]
public class CheckingAccount {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {

        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }

        // 2. Assuming result is 9-digit bank account number, validate 11-test:
        validateAccountNumber(counterAccount);        

        // 3. Look up counter account and make transfer object:
        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
        Transfer result = new Transfer(this, acct, amount);
        return result;
    }

    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }

    /**
     * 2. Assuming result is 9-digit bank account number, validate 11-test:
     * @return 
     * @throws BusinessException
     */
    public void validateAccountNumber(String counterAccount) throws BusinessException {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }
        if(sum % 11 != 0 ) {
            throw new BusinessException("Invalid account number!");
        }
    }

}
// end::CheckingAccount[]
