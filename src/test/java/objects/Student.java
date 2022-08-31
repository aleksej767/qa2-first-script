package objects;

public class Student {
    //--------ATTRIBUTES----------------------
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String mail;
    private int ID;
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
//-------------CONSTRUCTOR--------------------
//    public Student(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }


    //--------GETTERS/SETTERS---------------------
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPhone(long phone) {
        this.phone = String.valueOf(phone);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    //----------CUSTOM METHODS------------------------

    public String getFullName() {
        return firstName + " " + lastName;
    }


}


