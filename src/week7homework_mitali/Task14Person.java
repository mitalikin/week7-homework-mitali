package week7homework_mitali;

public class Task14Person {

    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Task14Person obj = new Task14Person();
        String words = obj.getFirstName();
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastname());
        System.out.println(obj.getAge());
        // System.out.println(obj.setFirstName());


    }

    public String getFirstName() {
        String firstname = "Mitali";
        return firstname;
    }

    public String getLastname() {
        String lastname = "Patel";
        return lastname;
    }

    public int getAge() {
        int age = 30;
        return age;

    }

    public String setFirstName(String firstName) {
        return firstName;
    }

    public String setLastName(String lastName) {

        return lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen(int age) {
        if (age > 12 && age <= 20) {
            return true;
        } else {
            return false;
        }

        //public String getFullName(){
        //     String fullName;
        //   String firstName="mitali";
        // String lastName="patel";
        //fullName= firstName+"  "+lastName;
        //return  fullName;
    }
}
//}
