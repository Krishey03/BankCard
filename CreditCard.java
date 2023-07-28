
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067570 Krish Bhattarai)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //Declaring the Attributes 
    private int cvcNumber; 
    private double creditLimit; 
    private double interestRate;
    private String expirationDate; 
    private int gracePeriod; 
    private boolean isGranted; 

    //Creating constructor that takes eight parameters 
    public CreditCard(int card_id,String clientName,String issuerBank,String bankAccount,int balanceAmount,int cvcNumber, double interestRate, String expirationDate){ //Expirationdate

        //Creating super constructor 
        super(card_id, issuerBank, bankAccount, balanceAmount);
        super.setclientName(clientName);  

        //Assigning parameter values to the corresponding class
        this.cvcNumber = cvcNumber; 
        this.interestRate = interestRate; 
        this.expirationDate = expirationDate; 

        //Setting the value of isGranted to False 
        this.isGranted = false; 
    }

    //Providing getter method for cvcNumber
    public int getcvcNumber(){
        return this.cvcNumber;
    }

    //Providing getter method for creditLimit
    public double getcreditLimit(){
        return this.creditLimit;
    }

    //Providing getter method for interestRate
    public double getinterestRate(){
        return this.interestRate; 
    }

    //Providing getter method for expirationDate
    public String getexpirationDate(){
        return this.expirationDate; 
    }

    //Providing getter method for gracePeriod
    public int getgracePeriod(){
        return this.gracePeriod; 
    }
    //Providing getter method for isGranted
    public boolean getisGranted(){
        return this.isGranted; 
    }

    //Creating a method that sets credit limit.
    public void setcreditLimit(double creditLimit,int gracePeriod){ 
        if(creditLimit <= 2.5 * getbalanceAmount()){ 
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod; 
            this.isGranted = true; 
        } else {
            System.out.println("Credit can't be issued."); 
        }
    }

    //Creating method for cancellingCreditCard
    public void cancelCreditCard(){ 
        if(isGranted){ 
            cvcNumber = 0; 
            creditLimit = 0; 
            gracePeriod = 0; 
            isGranted =false; 
        } 
    }
    //Creating display method for details of creditCard 
    public void display(){

        if(isGranted == true){ 
            super.display();

            System.out.println("cvcNumber: "+this.cvcNumber);
            System.out.println("creditLimit: "+this.creditLimit);
            System.out.println("interestRate: "+this.interestRate);
            System.out.println("ExpirationDate: "+this.expirationDate);
            System.out.println("gracePeriod: "+this.gracePeriod); 
        }else{
            super.display(); 
            System.out.println("cvcNumber: "+this.cvcNumber); 
            System.out.println("interestRate: "+this.interestRate);
            System.out.println("ExpirationDate: "+this.expirationDate);
            System.out.println("creditLimit: "+this.creditLimit);
            System.out.println("gracePeriod: "+this.gracePeriod); 
        }          
    }
}