public class Employee {
    private String name;
    private String position;
    private String email;
    private String mobile;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String mobile, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
        setAge(age);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public void infoEmployee() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Моб: " + mobile);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public void sortEmployee(int limitAge) {
            if (getAge() > limitAge) {
                infoEmployee();
            }
    }

}



