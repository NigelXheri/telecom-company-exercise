public class PhoneAccount {

    private String phoneNumber;
    private double balance;

    PhoneAccount(){
        this.balance = 0;
        this.phoneNumber = "";
    }
    PhoneAccount(String phoneNumber, double balance){
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void addCredits(double credits){
        if (credits <= 0){
            System.out.println("Cannot add negative credits.");
            return;
        }
        System.out.println(credits + " credits have been added successfully.");
        balance += credits;
    }

    public void useService(double credits){
        if (credits > balance){
            System.out.println("Your balance is not enough");
        }
        balance -= credits;
        System.out.println("Service used successfully. " + credits + " credits have been used.");
    }



}
