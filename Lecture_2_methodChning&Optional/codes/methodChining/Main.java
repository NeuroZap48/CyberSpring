package testing;

public class Main {


    public static void main(String [] args){
        Student s = Student.builder().name("Abd").age(23L).university("Alazhar" , 2).build();
        System.out.println(s.name);
    }





}
