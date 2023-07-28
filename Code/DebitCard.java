
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067570 Krish Bhattarai)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //Declaring the Attributes
    private int pinNumber; 
    private int WithdrawalAmount;
    private String dateOfWithdrawal; 
    private boolean hasWithdrawn;
    
    //Creating constructor method
    public DebitCard(int balanceAmount, int card_id, String bankAccount, String issuerBank, String clientName, int pinNumber){

        //Creating a super constructor 
        super(card_id,issuerBank,bankAccount,balanceAmount); 
        //Assigning value of parameter to PINnumber
        setclientName(clientName); 
        this.pinNumber = pinNumber;

        //Setting the value of hasWithdrawn to False
        this.hasWithdrawn = false;
    }       
    //Providing setter method for withdrawal amount
    public void setWithdrawalAmount(int newWithdrawalAmount){
        WithdrawalAmount = newWithdrawalAmount; 
    }

    //Providing getter method for PINnumber
    public int pinNumber(){
        return this.pinNumber;
    }

    //Providing getter method for WithdrawalAmount
    public int WithdrawalAmount(){
        return this.WithdrawalAmount;
    }

    //Providing getter method for dateOfWithdrawal
    public String dateOfWithdrawal(){
        return this.dateOfWithdrawal; 
    }

    //Providing getter method for hasWithdrawn
    public boolean hasWithdrawn(){
        return this.hasWithdrawn; 
    }

    //Creating a method called withdraw that verifies if the pin number is correct and checks whether there is enough balance before completing the withdrawal
    public int withdraw(int WithdrawalAmount, String dateOfWithdrawal, int pinNumber){ 
        if(pinNumber == this.pinNumber && WithdrawalAmount<=getbalanceAmount())
        {
            super.setbalanceAmount(super.getbalanceAmount() - WithdrawalAmount);
            this.WithdrawalAmount = WithdrawalAmount; 
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true; 
        }
        else if(pinNumber != this.pinNumber){ 
            System.out.println("The PIN number is incorrect."); 
            return 2;
        }
        else{
            System.out.println("Your balance is insufficient."); 
            return 3;
        }
        return 1;
    }
    
    
    //Creating a display method 
    public void display(){
        super.display();
        if(hasWithdrawn == true){
            System.out.println("balanceAmount: "+getbalanceAmount()); 
            System.out.println("pinNumber: " +pinNumber); 
            System.out.println("withdrawalAmount: "+WithdrawalAmount); 
            System.out.println("dateOfWithdrawal: "+dateOfWithdrawal); 
        } 
        else{
            System.out.println("balanceAmount: "+getbalanceAmount()); 
        }
    }
}