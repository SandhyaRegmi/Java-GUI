
/**
 * This is the CreditCard class.
 *
 * @author Sandhya Regmi
 * ID:NP05CP4A220109
 */
    public class CreditCard extends BankCard{
    
    //declaration of attributes of CreditCard class//
    private int CVCNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    
    //to check isGranted is either true or false.//
    //isGranted will be true if CreditCard is granted.//
    private boolean isGranted;

    //constructor of creditCard class//
    public CreditCard(String issuerBank, String bankAccount, int cardID, int balanceAmount,String clientName, int CVCNumber, double interestRate, String expirationDate){
    super(issuerBank, bankAccount, cardID, balanceAmount); //calling constructor from superclass
    super.setClientName(clientName); //calling constructor with setter method
    this.CVCNumber = CVCNumber;
    this.interestRate = interestRate;
    this.expirationDate= expirationDate;
    this.isGranted = false;
    
}

     //accessor method for each attributes//
    public int getCVCNumber(){
    return this.CVCNumber;
}
    public double getCreditLimit(){
    return this.creditLimit;
}
    public double getInterestRate(){
    return this.interestRate;
}
    public String getExpirationDate(){
    return this.expirationDate;
}
    public int getGracePeriod(){
    return this.gracePeriod;
}
    public boolean getIsGranted(){
    return this.isGranted;
}

    //method to set the credit limit//
 public void setCreditLimit(double newCreditLimit,int newGracePeriod){   
      if(newCreditLimit<=(2.5*super.getBalanceAmount()))//checking credit limit using if statement
        {
         this.creditLimit = newCreditLimit;
         this.gracePeriod = newGracePeriod;
         this.isGranted = true;
         System.out.println("Credit has been successfully issued.");
        }else{
            System.out.println("Credit cannot be issued because credit granting process failed as credit limit is not less than or equal to 2.5");
        }
        
    }
    
    //method to remove the clients credit card//
       public void cancelCreditCard(){
        this.CVCNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("The Credit Card has been cancelled");
    }
    
    //method to display details of the Credit Card//
     public void display(){
        System.out.println("The Interest Rate is:"+ interestRate);
        System.out.println("The CVC Number is:"+ CVCNumber);
        System.out.println("The Expiration Date is:"+ expirationDate);
      
        if(isGranted == true){
            super.display(); //calling display method from super class
            System.out.println(" The Credit Limit is:"+creditLimit);
            System.out.println("The Grace Period is:"+gracePeriod);
        }
            
            
    }

}