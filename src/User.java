import java.util.Locale;

public class User {
    private String firstName;
    private String lastName;

    // Propriedades estáticas pertencem a classe e não ao objeto
    private static int count = 0;

    // constructor
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static void setCount(int c){
        count += c;
    }

    // SETTERS
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // GETTERS
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public int getCount(){
        return count;
    }

    // Sobrecarga de metodos
    public String output(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(boolean showLastName){
        if(showLastName){
            return  output();
        }

        return firstName;
    }
}
