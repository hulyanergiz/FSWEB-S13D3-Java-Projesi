public class Person {
    String firstname;
    String lastname;
    int age;
    int idNumber;
    int phone;
    String address;

    public Person(String firstname, String lastname, int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }
    public Person (String firstname, String lastname, int age, int idNumber, int phone, String address){
        this(firstname,lastname,age);
        this.idNumber=idNumber;
        this.phone=phone;
        this.address=address;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(int age) {
        if (age < 13 && age > 19) {
            return false;
        }
        return age>=13&&age<=19;
    }

}
