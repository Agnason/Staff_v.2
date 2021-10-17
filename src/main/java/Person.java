public class Person extends Employee{

    public Person(String name, String position, String email, String mobile, int salary, int age) {
        super(name, position, email, mobile, salary, age);
    }

    @Override
    public void setAge(int age) {
        
        super.setAge(age);
    }

}
