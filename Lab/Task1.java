class Contact {
    String phone;
    String email;

    Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Phone: " + phone + ", Email: " + email);
    }
}

class Student {
    String name;
    Contact contact;

    Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    void display() {
        System.out.println("Student: " + name);
        contact.display();
    }
}

class School {
    String name;
    Student[] students;

    School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    void display() {
        System.out.println("School: " + name);
        for (Student s : students) {
            s.display();
        }
    }
}

public class Task1 {
    public static void main(String[] args) {
        Contact c1 = new Contact("01711111111", "alice@gmail.com");
        Contact c2 = new Contact("01822222222", "bob@yahoo.com");

        Student s1 = new Student("Alice", c1);
        Student s2 = new Student("Bob", c2);

        Student[] studentArray = {s1, s2};

        School school = new School("Green Valley High School", studentArray);

        school.display();
    }
}