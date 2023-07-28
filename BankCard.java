
/**
 * Write a description of class BankCard here.
 *
 * @author (22067570 Krish Bhattarai)
 * @version (1.0.0)
 */
public class BankCard
//main class
{
    //Declaring the Attributes 
    private int card_id; 
    private int balanceAmount;
    private String clientName;
    private String issuerBank;
    private String bankAccount; 

    //Creating constructor method
    public BankCard(int card_id, String issuerBank, String bankAccount, int balanceAmount){
        //Assigning values of parameter to attributes
        this.card_id = card_id;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;

        //Setting the value of clientName to an empty String
        this.clientName = " "; 
    }
    //Providing setter method for clientName
    public void setclientName(String newclientName){
        clientName = newclientName; 
    }

    //Providing setter method for balanceAmount
    public void setbalanceAmount(int newbalanceAmount){
        balanceAmount = newbalanceAmount; 
    }

       
    //providing getter method for clientName
    public String getclientName(){
        return this.clientName;
    }

    //Providing getter method for issuerBank
    public String getissuerBank(){
        return this.issuerBank; 
    }

    //Providing getter method for bankAccount
    public String getbankAccount(){
        return this.bankAccount; 
    }

    //Providing getter method for balanceAmount
    public int getbalanceAmount(){
        return this.balanceAmount; 
    }
    
    public int getcard_id(){
        return this.card_id;
    }

    //Creating method
    public void display(){
        //Displaying the values
        System.out.println("card_id:" +this.card_id);
        System.out.println("issuerBank:" +this.issuerBank);
        System.out.println("bankAccount:" +this.bankAccount);
        //System.out.println("balanceAmount:" +this.balanceAmount);  

        //Checking if clientName has a value or is empty
        if(clientName!=" "){
            System.out.println("clientName: "+this.clientName);
        }
        else{
            System.out.println("This field is empty");
        }
    }
    
    
}