import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }
    public static void fly() {
        System.out.println(nickName + ": Я не умею летать! (только в душе)");
    }
}
