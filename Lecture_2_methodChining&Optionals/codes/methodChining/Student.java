package testing;

public class Student {
    String name;
    Long age ;

    public Student(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public Student name (String name){
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Student age (Long age){
        this.age = age;
        return this;
    }

    public Student university (String university , Integer branch){
        return this;
    }

    public static Student builder(){
        return new Student();
    }

    public Student build(){
        return this;
    }
}
