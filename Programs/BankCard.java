
/**
 * This is a BankCard class which is used to store details of bank.
 * @author Sandhya Regmi
 * ID:NP05CP4A220109
 */
    public class BankCard{
    
    //attribute declaration of BankCard class with five attributes.//
     private String clientName;
     private String issuerBank;
     private String bankAccount;
     private int cardID;
     private int balanceAmount;
    
    //constructor of BankCard class that accept four parameters.//
    public BankCard(String issuerBank, String bankAccount, int cardID, int balanceAmount ){
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.cardID = cardID;
        this.balanceAmount = balanceAmount;
    }
    
    //attribute clientName is initialized to an empty string//
    {
        this.clientName="";
        
    }
    
    //accessor method for each attributes.//
    public String getClientName()
    {
        return this.clientName;
    }
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    public int getCardID()
    {
        return this.cardID;
    }
    public int getBalanceAmount()
    {
        return this.balanceAmount;
    }
    
    //setter method to set clientname and balanceAmount./
    public void setClientName(String clientName){
        this.clientName = clientName;
        
    }
    public void setBalanceAmount(int balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    
    //display method to display values of attributes//
    public void display()
    {
        
    System.out.println("The issuerBank is:  "+getIssuerBank());
    System.out.println("The bankAccount is:  "+getBankAccount());
    System.out.println("The cardID is: "+getCardID());
    System.out.println("The balanceAmount is "+getBalanceAmount());
    
    //check if clientName of BankCard is assigned//
    if(getClientName().equals(""))
        {
           System.out.println("The clientName of BankCard is not assigned");
        }
        else
        {
            System.out.println("The clientName is:"+getClientName());
        }
    }
}
    