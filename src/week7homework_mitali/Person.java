package week7homework_mitali;

public class Person {

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0 || age > 100) {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;

        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");//firstName is set to empty string
        person.setLastName("");//lastName is set to empty string
        //person.setAge();
        person.setAge(10);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setLastName("John");//firstname is set to John
        person.setAge(18);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setLastName("smith");
        System.out.println("fullName=" + person.getFullName());
    }

}
