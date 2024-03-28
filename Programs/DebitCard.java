
/**
 *This is the DebitCard which is also subclass of BankCard.
 *
 *@author Sandhya Regmi
 * ID:NP05CP4A220109
 */
public class DebitCard extends BankCard
{
    //declaration of attributes of DebitCard//
    private int PINNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    
    //to check hasWithdrawn is either true or false.//
    //hasWithdrawn will be true once DebitCard gets withdrawn.//
    private boolean hasWithdrawn;
    
    //constructor of DebitCard class//
    public DebitCard(String issuerBank, String bankAccount, int cardID, int balanceAmount, String clientName, int PINNumber){
        super(issuerBank, bankAccount, cardID, balanceAmount);
        super.setClientName(clientName);
        this.PINNumber = PINNumber;
        this.hasWithdrawn = false;
    }
    
    //accessor method for each attribute//
    public int getPINNumber(){
        return this.PINNumber;
    }
    public int getWithdrawalAmount(){
        return this.withdrawalAmount;
    }
    public String getDateOfWithdrawal(){
        return this.dateOfWithdrawal;
    }
    public boolean getHasWithdrawn(){
        return this.hasWithdrawn;
    }
    
    //mutator method for withdrawalAmount to set withdrawalAmount.//
    public void setWithdrawalAmount(int withdrawalAmount){
        this.withdrawalAmount = withdrawalAmount;
    }
    
    //This is the Withdraw method.//
    public void withdraw(int withdrawlAmount, String dateOfWithdrawal, int PINNumber){
        if(this.getPINNumber()==PINNumber) //checking entered PIN is correct or not
        {
            if(super.getBalanceAmount()>=withdrawlAmount) //checking sufficient amount is present or not
            {
                System.out.println("The amount is successfully withdrawn.");
                this.hasWithdrawn = true;
                super.setBalanceAmount(super.getBalanceAmount()-withdrawalAmount);//updating balanceAmount
                this.setWithdrawalAmount(withdrawlAmount);
                this.dateOfWithdrawal = dateOfWithdrawal;
            }
             else{
            System.out.println("The PINNumber is wrong and money can not be withdrawn");
            {
                System.out.println("There is no sufficient balance so money cannot be withdrawn");
            }
        }
    }
    }
    
    //This is the display method//
    public void display(){
        super.display();//calling display method from super class
        
        if(hasWithdrawn == true) //check if the transaction has been carried out
        {
            System.out.println(" The PIN Number is:"+PINNumber);
            System.out.println("The Withdrawal Amount is:"+withdrawalAmount);
            System.out.println("The Date Of Withdrawal is:"+dateOfWithdrawal);
        }
        else
        {
            System.out.println("The Balance Amount is:"+getBalanceAmount());
        }
    }

}