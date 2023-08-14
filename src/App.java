import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        //fixedArraysLength();
        //dynamicArrays();
        // overloadMethod();
        staticProperties();
    }

    public static void staticProperties(){
        User user1 = new User("Patrick", "Rodrigues");
        User user2 = new User("Blake", "Langgerman");

        User.setCount(2);
        User.setCount(5);

        System.out.println(user1.getCount());
        System.out.println(user2.getCount());
    }

    public static void overloadMethod(){
        User userA = new User("Patrick", "Rodrigues");

        System.out.println(userA.output());
        System.out.println(userA.output(false));
    }

    public static void dynamicArrays(){
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            User actual = new User("Nome: " + i, "Sobrenome: " + i);
            users.add(actual);
        }

        System.out.println(users.get(9).getFirstName());
        System.out.println(users.get(9).getLastName());

        users.add(new User("Nome: " + 11, "Sobrenome: " + 11));

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());
    }

    public static void fixedArraysLength(){
        Fruit[] fruits = new Fruit[10];
        Fruit fruit1 = new Fruit("Banana");
        Fruit fruit2 = new Fruit("Maçã");
        fruits[0] = fruit1;
        fruits[1] = fruit2;

        System.out.println(fruits[1].getFruitName());
    }
}
