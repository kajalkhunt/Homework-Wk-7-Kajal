package homeworkweek7kajal;

//14. Person
//Write a class with the name Person. The class needs three fields (instance variables) with the names
//firstName, lastName of type String and age of type int.
public class AnPerson14 {
    String firstName, lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AnPerson14 person = new AnPerson14();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(12);//false
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);//teen or true
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName=" + person.getFullName());
    }
}

