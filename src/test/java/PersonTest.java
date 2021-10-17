public class PersonTest {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Александр Насонов", "Java-программист", "nasonov@mailbox.com", "8921312312", 300000, 55);
        persArray[1] = new Person ("Виталий Ерёмин", "Безработный", "eremin@mailbox.com", "89213152111", 100000, 24);
        persArray[2] = new Person("Татьяна Звягинцева", "Директор", "zvyiga@mailbox.com", "89213749244", 50000, 45);
        persArray[3] = new Person ("Алексей Седюкевич", "Уборщик", "sedukevich@mailbox.com", "89213422222", 10000, 41);
        persArray[4] = new Person ("Vasilii Pupkin", "Водитель", "pupkin@mailbox.com", "89213555555", 40000, 39);

        persArray[1].sortEmployee(40);

    }

}
