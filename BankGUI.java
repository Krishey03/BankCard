
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067570 Krish Bhattarai)
 * @version (1.0.0)
 */
//import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class BankGUI implements ActionListener
{
    public JButton clrButton;

    //Private
    private JFrame myFrame;
    private ArrayList<BankCard>lists = new ArrayList<>();

    //Declare
    private JLabel guiLabel, debitLabel, idLabel, nameLabel, issueLabel, bankAcLabel, balAmtLabel, pinLabel, withdrawLabel, withdrawlLabel, withdrawDLabel, withidLabel, creditLabel, idCLabel, nameCLabel, issueCLabel, bankAcCLabel, balAmtCLabel, cvcCLabel, interestCLabel, expCLabel, limitCLabel, limitLabel, graceLabel, cardlLabel, wpinLabel;

    //----DEBITCARD----
    //----JTextfield
    private JTextField idText = new JTextField();
    private JTextField nameText = new JTextField();
    private JTextField issueText = new JTextField();
    private JTextField bankAcText = new JTextField();
    private JTextField balAmtText = new JTextField();
    private JTextField withidText = new JTextField();
    private JTextField wpinText = new JTextField();
    private JTextField pinText = new JTextField();
    private JTextField withAText = new JTextField(); //Withdraw

    private JComboBox dayWComboBox = new JComboBox();
    private JComboBox dateWComboBox = new JComboBox();
    private JComboBox yearWComboBox = new JComboBox();

    //JButton
    //JButton aButton = new JButton("ADD");
    private JButton displayButton = new JButton("DISPLAY");
    private JButton adButton = new JButton("ADD");
    private JButton withdrawButton = new JButton("WITHDRAW");

    //----CREDITCARD----
    //TEXTFIELD

    //JTextField
    private JTextField idCText = new JTextField();
    private JTextField nameCText = new JTextField();
    private JTextField issueCText = new JTextField();
    private JTextField bankAcCText = new JTextField();
    private JTextField balAmtCText = new JTextField();
    private JTextField cvcCText = new JTextField();
    private JTextField interestCText = new JTextField();
    private JTextField limitText = new JTextField();
    private JTextField graceText = new JTextField();
    private JTextField cardlText = new JTextField();

    private JComboBox dayCComboBox = new JComboBox();
    private JComboBox dateCComboBox = new JComboBox();
    private JComboBox yearCComboBox = new JComboBox();

    //JButton
    //JButton aButton = new JButton("ADD");
    private JButton displayCButton = new JButton("DISPLAY");
    private JButton adCButton = new JButton("ADD");
    private JButton limitCButton = new JButton("Set Credit Limit");
    private JButton cancelCButton = new JButton("Cancel Credit");

    //private JTextField
    public BankGUI(){
        //Creating a JFrame using a constructor
        JFrame myFrame = new JFrame("BankGUI");

        //DEBIT CARD
        //JLabel
        guiLabel = new JLabel("BankGUI");
        debitLabel = new JLabel("Debit Card");
        idLabel = new JLabel("Card ID");
        nameLabel = new JLabel("Client Name");
        issueLabel = new JLabel("Issuer Bank");
        bankAcLabel = new JLabel("Bank Account");
        balAmtLabel = new JLabel("Balance Amt");
        pinLabel = new JLabel("Pin No");
        withdrawLabel = new JLabel("Withdraw Amt");
        withdrawDLabel = new JLabel("Withdraw Date");
        withdrawlLabel = new JLabel("Withdrawal");
        withidLabel = new JLabel("Card ID");
        wpinLabel = new JLabel ("Pin No");

        //Adding Label
        myFrame.add(guiLabel);
        myFrame.add(debitLabel);
        myFrame.add(idLabel);
        myFrame.add(nameLabel);
        myFrame.add(issueLabel);
        myFrame.add(bankAcLabel);
        myFrame.add(balAmtLabel);
        myFrame.add(pinLabel);
        myFrame.add(withdrawLabel);
        myFrame.add(withdrawDLabel);
        myFrame.add(withdrawlLabel);
        myFrame.add(withidLabel);
        myFrame.add(wpinLabel);

        //Adding Textfield
        myFrame.add(idText);
        myFrame.add(nameText);
        myFrame.add(issueText);
        myFrame.add(bankAcText);
        myFrame.add(balAmtText);
        myFrame.add(withidText);
        myFrame.add(pinText);
        myFrame.add(dayWComboBox);
        myFrame.add(dateWComboBox);
        myFrame.add(yearWComboBox);
        myFrame.add(withAText);
        myFrame.add(wpinText);

        //Adding Buttons
        myFrame.add(adButton);
        myFrame.add(displayButton);
        myFrame.add(withdrawButton);

        //Setting Bounds
        //Setting Bounds to Label
        guiLabel.setBounds(764, 42, 124, 31);
        debitLabel.setBounds(182, 106, 91, 25);
        idLabel.setBounds(46, 201, 48, 20);
        nameLabel.setBounds(46, 261, 77, 20);
        issueLabel.setBounds(46, 321, 74, 20);
        bankAcLabel.setBounds(422, 195, 86, 20);
        balAmtLabel.setBounds(422, 261, 79, 20);
        pinLabel.setBounds(422, 321, 42, 20);
        withdrawLabel.setBounds(41, 654, 97, 20);
        withdrawDLabel.setBounds(372, 654, 104, 20);
        withdrawlLabel.setBounds(169, 472, 81, 25);
        withidLabel.setBounds(41, 593, 48, 20);
        wpinLabel.setBounds(457, 587, 42, 20);

        //Setting Bounds to Textfield(DebitCard)
        idText.setBounds(174, 195, 140, 32);
        nameText.setBounds(174, 255, 140, 32);
        issueText.setBounds(174, 315, 140, 32);
        bankAcText.setBounds(550, 189, 140, 32);
        balAmtText.setBounds(550, 255, 140, 32);
        pinText.setBounds(550, 315, 140, 32);
        withAText.setBounds(169, 648, 140, 32); //Withdrawal Date
        withidText.setBounds(169, 587, 140, 32);
        dayWComboBox.setBounds(499, 649, 48, 32); 
        dateWComboBox.setBounds(567, 649, 48, 32);
        yearWComboBox.setBounds(631, 649, 58, 32);
        wpinText.setBounds(549, 581, 140, 32);

        //Setting Bounds to Buttons
        adButton.setBounds(411, 391, 120, 32);
        displayButton.setBounds(569, 391, 120, 32);
        withdrawButton.setBounds(179, 719, 120, 32);

        //END OF DEBITCARD

        //CREDITCARD
        //LABEL
        //JLabel
        creditLabel = new JLabel("Credit Card");
        idCLabel = new JLabel("Card ID");
        nameCLabel = new JLabel("Client Name");
        issueCLabel = new JLabel("Issuer Bank");
        bankAcCLabel = new JLabel("Bank Account");
        balAmtCLabel = new JLabel("Balance Amt");
        cvcCLabel = new JLabel("CVC no");
        interestCLabel = new JLabel("Interest Rate");
        expCLabel = new JLabel("Expiration Date");
        limitCLabel = new JLabel("Credit Limit");
        limitLabel = new JLabel("Credit Limit");
        graceLabel = new JLabel("Grace Period");
        cardlLabel = new JLabel("Card ID");

        //ADDING
        //Adding Label
        myFrame.add(creditLabel);
        myFrame.add(idCLabel);
        myFrame.add(nameCLabel);
        myFrame.add(issueCLabel);
        myFrame.add(bankAcCLabel);
        myFrame.add(balAmtCLabel);
        myFrame.add(cvcCLabel);
        myFrame.add(interestCLabel);
        myFrame.add(expCLabel);
        myFrame.add(limitCLabel);
        myFrame.add(limitLabel);
        myFrame.add(graceLabel);
        myFrame.add(cardlLabel);

        //Adding TextField
        myFrame.add(idCText);
        myFrame.add(nameCText);
        myFrame.add(issueCText);
        myFrame.add(bankAcCText);
        myFrame.add(balAmtCText);
        myFrame.add(cvcCText);
        myFrame.add(interestCText);
        myFrame.add(dayCComboBox);
        myFrame.add(dateCComboBox);
        myFrame.add(yearCComboBox);
        myFrame.add(limitText);
        myFrame.add(graceText);
        myFrame.add(cardlText);

        //Adding Buttons
        myFrame.add(adCButton);
        myFrame.add(displayCButton);
        myFrame.add(limitCButton);
        myFrame.add(cancelCButton);

        //SETTING BOUNDS
        //Setting Bounds to Label
        creditLabel.setBounds(1010, 106, 98, 25);
        idCLabel.setBounds(879, 201, 48, 20);
        nameCLabel.setBounds(879, 261, 77, 20);
        issueCLabel.setBounds(879, 321, 74, 20);
        bankAcCLabel.setBounds(879, 381, 86, 20);
        balAmtCLabel.setBounds(1251, 201, 79, 20);
        cvcCLabel.setBounds(1251, 256, 44, 26);
        interestCLabel.setBounds(1251, 325, 80, 19);
        expCLabel.setBounds(1251, 378, 96, 20);
        limitCLabel.setBounds(996, 491, 100, 25);
        limitLabel.setBounds(1219, 578, 71, 20);
        graceLabel.setBounds(1219, 638, 82, 20);
        cardlLabel.setBounds(912, 598, 48, 20);

        //Setting Bounds to TextFields
        idCText.setBounds(1007, 195, 140, 32);
        nameCText.setBounds(1007, 255, 140, 32);
        issueCText.setBounds(1007, 315, 140, 32);
        bankAcCText.setBounds(1007, 375, 140, 32);
        balAmtCText.setBounds(1379,195, 140, 32);
        cvcCText.setBounds(1379, 256, 140, 32);
        interestCText.setBounds(1379, 314, 140, 32);
        dayCComboBox.setBounds(1379, 372, 48, 32);
        dateCComboBox.setBounds(1447, 372, 48, 32);
        yearCComboBox.setBounds(1511, 372, 58, 32);
        limitText.setBounds(1347, 572, 140, 32);
        graceText.setBounds(1347, 632, 140, 32);
        cardlText.setBounds(1000, 598, 140, 32);

        //Setting Bounds to Buttons
        adCButton.setBounds(1286, 459, 120, 32);
        displayCButton.setBounds(1434, 459, 120, 32);
        limitCButton.setBounds(976, 743, 120, 32);
        cancelCButton.setBounds(1126, 743, 120, 32);
        //END OF CREDITCARD

        //*********
        //Submit and clear button
        //JButton submitButton = new JButton("Submit");
        clrButton = new JButton("Clear");

        //Connect event listener to all source
        clrButton.addActionListener(this);

        //Add submit and clear button
        //myFrame.add(submitButton);
        myFrame.add(clrButton);

        //setting Bounds to submit and clear button
        //submitButton.setBounds(1434, 743, 120, 30);
        clrButton.setBounds(1298, 743, 120, 30);
        //combobox EXPIRATION DATE
        for (int i = 1; i <=31; i++){
            dayCComboBox.addItem(i);
        }
        for (int j = 1; j <=12; j++){
            dateCComboBox.addItem(j);
        }
        for (int k = 2019; k <=2023; k++){
            yearCComboBox.addItem(k);
        }

        //combobox WITHDRAWL DATE
        for (int i = 1; i <=31; i++){
            dayWComboBox.addItem(i);
        }
        for (int j = 1; j <=12; j++){
            dateWComboBox.addItem(j);
        }
        for (int k = 2019; k <=2023; k++){
            yearWComboBox.addItem(k);
        }

        //CREATING ARRAYLIST
        ArrayList BankCard = new ArrayList();

        //ADD ACTIONLISTENER
        adButton.addActionListener(this);
        adCButton.addActionListener(this);
        displayButton.addActionListener(this);
        displayCButton.addActionListener(this);
        limitCButton.addActionListener(this);
        cancelCButton.addActionListener(this);
        withdrawButton.addActionListener(this);

        myFrame.setSize(1600, 838);
        myFrame.setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //myFrame.setResizable(false);
        myFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        //CLEAR
        if (e.getSource() == clrButton){ 
            //ActionListener for clear button
            idText.setText(""); 
            nameText.setText(""); 
            issueText.setText("");
            bankAcText.setText("");
            balAmtText.setText("");
            withidText.setText("");
            pinText.setText("");
            withAText.setText("");
            idCText.setText("");
            nameCText.setText("");
            issueCText.setText("");
            bankAcCText.setText("");
            balAmtCText.setText("");
            cvcCText.setText("");
            interestCText.setText("");
            limitText.setText("");
            graceText.setText("");
            cardlText.setText("");
            //clears all the textfields in the GUI
        }

        //DEBITCARD
        //DEBITCARD DISPLAY
        if(e.getSource() == displayButton){ 
            //Action listener for display button
            for(BankCard obj: lists){
                //loop bank cards list
                if(!(obj instanceof DebitCard)){ 
                    // if object is not a debitcard
                    continue;
                }
                obj.display();
                //display DebitCard object
            }
        }

        //DebitCard ADD
        if(e.getSource() == adButton){
            //ActionListener for Add Button
            try{
                int card_id = Integer.parseInt(idText.getText());
                //get and parse card_id input
                String clientName = nameText.getText();
                String issuerBank = issueText.getText();
                String bankAccount = bankAcText.getText();
                int balanceAmount = Integer.parseInt(balAmtText.getText());
                int pinNumber = Integer.parseInt(pinText.getText());
                //get the user input
                DebitCard debit_card = new DebitCard(balanceAmount, card_id, bankAccount, issuerBank, clientName, pinNumber);
                //calling constructor of DebitCard class
                boolean verify =false;
                for (BankCard obj: lists){
                    if(!(obj instanceof DebitCard)){
                        verify = true;
                        //if obj is not DebitCard set verify to true
                        continue;
                    }
                    if(((DebitCard)obj).getcard_id() == card_id){
                        //check if the DebitCard card_id matches the new card_id input
                        JOptionPane.showMessageDialog(null, "Card ID is already present.");
                        verify = false;
                        break;
                    }
                    else{
                        verify = true;
                    }
                }
                if((lists.isEmpty()) || (verify)){
                    lists.add(debit_card);
                    //if the list is empty or verify is true, add new DebitCard to the list
                    JOptionPane.showMessageDialog(null, "Debit Card has been added.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Inaccurate Data.");
                //if there is a NumberFormatException display the pop up.
            }
        }

        //WITHDRAW
        if(e.getSource() == withdrawButton){
            //ActionListener for withdraw button
            
            try{
                boolean verify = false;
                //set the boolean verify to false
                
                int card_id = Integer.parseInt(withidText.getText());
                String date = dateWComboBox.getSelectedItem().toString();
                String day = dayWComboBox.getSelectedItem().toString();
                String year = yearWComboBox.getSelectedItem().toString();
                String calender = date+ "/" +day+ "/" +year;
                int balance_amount = Integer.parseInt(withAText.getText());
                int pin_number = Integer.parseInt(wpinText.getText());
                //parse input from the fields
                
                for (BankCard obj: lists){
                    if (!(obj instanceof DebitCard)) {
                        //check if object is a debitcard or not
                        continue;
                    }
                    if (obj.getcard_id() == card_id){
                        //check if the card_id matches with the debitcard card_id
                        verify = true;
                        int draw = ((DebitCard)obj).withdraw(balance_amount, date, pin_number);
                        //withdraw the provided amount from debitcard 
                        if(draw == 1){
                            JOptionPane.showMessageDialog(null, "Amount has been successfully withdrawn.");
                        }
                        else if(draw == 2){
                            JOptionPane.showMessageDialog(null, "Incorrect Pin Number");
                        }
                        else if(draw == 3){
                            JOptionPane.showMessageDialog(null, "Insufficient Balance.");
                        }
                    }
                }
                if(lists.isEmpty()){ 
                    //if list is empty
                    JOptionPane.showMessageDialog(null, "ERROR!! Please confirm if Debit Card is Present.");
                }
                if (! verify) {
                    //if not verify
                    JOptionPane.showMessageDialog(null, "Could not find the Card ID.");
                }
            }
            catch(NumberFormatException ex){
                //if there is NumberFormatException
                JOptionPane.showMessageDialog(null, "ERROR!! Verify if the data inserted is correct");
            }
        }

        //CREDITCARD
        //CREDITCARD DISPLAY
        if(e.getSource() == displayCButton){
            //ActionListener for display button
            for(BankCard obj: lists){
                //loop bank cards list
                if(!(obj instanceof CreditCard)){
                    // if object is not CreditCard
                    continue;
                }
                obj.display();
                //display CreditCard object
            }
        }

        //ADD CREDITCARD
        if(e.getSource() == adCButton){   
            //ActionListener for add button
            
            try{
                int card_id = Integer.parseInt(idCText.getText());
                //get and parse card_id input
                
                String clientName = nameCText.getText();
                String issuerBank = issueCText.getText();
                String bankAccount = bankAcCText.getText();
                int balanceAmount = Integer.parseInt(balAmtCText.getText());
                int cvcNumber = Integer.parseInt(cvcCText.getText());
                double interestRate = Double.parseDouble(interestCText.getText());
                String day = dayCComboBox.getSelectedItem().toString();
                String date = dateCComboBox.getSelectedItem().toString();
                String year = yearCComboBox.getSelectedItem().toString();
                //get the user input

                String expirationDate = day+ "/" +date+ "/" +year;
                CreditCard credit_card = new CreditCard(card_id, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expirationDate);
                //calling constructor of CreditCard class
                
                boolean verify =false;
                for (BankCard obj: lists){
                    if(!(obj instanceof CreditCard)){
                        verify = true;
                        //if obj is not CreditCard set verify to true
                        continue;
                    }
                    if(((CreditCard)obj).getcard_id() == card_id){
                        //check if the CreditCard card_id matches the new card_id input
                        JOptionPane.showMessageDialog(null, "Card ID is already present.");
                        verify = false;
                        break;
                    }
                    else{
                        verify = true;
                    }
                }
                if((lists.isEmpty()) || (verify)){
                    lists.add(credit_card);
                    //if the list is empty or verify is true, add new CreditCard to the list.
                    JOptionPane.showMessageDialog(null, "Successfully added the CreditCard.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Invalid Data.");
                //if there is a NumberFormatException display the pop up.
            }
        }

        //CREDIT LIMIT BUTTON
        if(e.getSource() == limitCButton){
            //ActionListener Set Credit Limit Button 
            try{
                boolean verify = false; 
                //set the verify boolean to false
                
                int card_id = Integer.parseInt(cardlText.getText());
                int creditLimit = Integer.parseInt(limitText.getText());
                int gracePeriod = Integer.parseInt(graceText.getText());
                //parse input from the fields
                
                for (BankCard obj: lists){
                    if(!(obj instanceof CreditCard)){
                        //check if object is a creditcard or not
                        continue;
                    }
                    if(((CreditCard)obj).getcard_id() == card_id){
                        //check if the card_id matches with the creditcard card_id
                        verify = true;
                        ((CreditCard)obj).setcreditLimit(creditLimit, gracePeriod);
                        //set the credit limit
                        JOptionPane.showMessageDialog(null, "Credit Limit has been successfully set.");
                    }
                }

                if(lists.isEmpty()){
                    //if list is empty
                    JOptionPane.showMessageDialog(null, "Empty Creditcard.");
                }

                if(! verify){
                    //if not verify
                    JOptionPane.showMessageDialog(null, "Could not find Card ID");
                }
            }
            catch(NumberFormatException ex){
                //if there is NumberFormatException
                JOptionPane.showMessageDialog(null, "Incorrect data");
            }
        }

        //CANCEL CREDIT BUTTON
        if(e.getSource() == cancelCButton){
            //ActionListener for Cancel Credit Button 
            try{
                boolean verify = false;
                //Initialize boolean verify to false
                int card_id = Integer.parseInt(idCText.getText());
                //parse and store idCtext to card_id 
                for(BankCard obj: lists){
                    //iterate through list of BankCard objects
                    if (!(obj instanceof CreditCard)){
                        //if obj not instance of CreditCard
                        continue;
                    }
                    if (obj.getcard_id() == card_id){
                        //check if the  card_id matches the CreditCard card_id 
                        verify = true;
                        ((CreditCard)obj).cancelCreditCard();
                        //cancel the credit card
                        JOptionPane.showMessageDialog(null, "Credit has been Cancelled");
                    }
                }
                if (! verify) {
                    //if not verify
                    JOptionPane.showMessageDialog(null, "Could not find the Card ID.");
                }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Input the Card ID."); 
                //if NumberFormatException display pop up
            }
        }
    }

    public static void main(String[] args){
        //create object of BankGUI
        BankGUI obj = new BankGUI();
    }
}

