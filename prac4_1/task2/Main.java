package prac.prac4_1.task2;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8333","Iphone", "1.5 kg");
        Phone phone2 = new Phone("8905", "Xiaomi");
        Phone phone3 = new Phone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        phone1.receiveCall("Aleksei");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Pavel");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Andrey");
        System.out.println(phone3.getNumber());
        phone1.receiveCall("Aleksei", phone2.getNumber());
        phone2.receiveCall("Pavel", phone3.getNumber());
        phone3.receiveCall("Andrey", phone1.getNumber());
        phone1.sendMessage("8800", "8905", "8333");
    }
}
