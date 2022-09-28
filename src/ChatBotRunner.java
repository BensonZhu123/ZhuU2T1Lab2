public class ChatBotRunner {
    public static void main(String[] args){
    ChatBot debbie = new ChatBot("Debbie", 69);
    debbie.greeting("Benson");
    debbie.weather();
    System.out.println("There is " + debbie.convertFeetToMeters(1) + " in every feet");
    int num = debbie.addNumbers(1,2,3);
    System.out.println("The sum of 1, 2, and 3 is: " + num);
    debbie.temp();
    int num2 = debbie.multiplynum(1,5);
    System.out.println(num2);
    debbie.goodbye();


    }
}
