public class TestPhoneAccount {

    public static void main(String[] args){
        System.out.println("Hi there! This is your telecom company program.\n");

        PhoneAccount pa1 = new PhoneAccount("0691234567", 100);
        pa1.addCredits(20);
        pa1.useService(15);
        System.out.println("Your phone account currently has " + pa1.getBalance() + " credits.");

    }

}
