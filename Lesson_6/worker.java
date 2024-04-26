package Lesson_6;

public class worker {
    int id;
    int salary; // зарплата 
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format("id:%d fn:%s ln:%s s:%d",id, firstName, lastName, salary);
        return res;
    }

    // @Override
    public boolean equals(Object o) {
        var t = (worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
