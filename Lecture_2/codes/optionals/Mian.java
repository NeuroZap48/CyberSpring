package testing3;


import testing.Student;

import java.util.Optional;

public class Mian {

    static StudentRepository studentRepository = new StudentRepository();



    public static void main (String [] args){


    }


    public void findById2(Long id){
        studentRepository.findById(id).ifPresent(student1 -> System.out.println(student1.getName()));
        studentRepository.findById(id).ifPresentOrElse(student1 -> System.out.println(student1.getName()) , () -> System.out.println("Student not found"));
        Student1 s = new Student1();
        s.setName(null);
        s.setId(null);
        studentRepository.findById(id).orElse(s);
        studentRepository.findById(id).orElseGet(() -> new Student1());
        studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Value Not Found!!"));
        studentRepository.findById(id).or(() -> Optional.of(new Student1()));


        studentRepository.findById(id).filter((student1 -> student1.getName().equals("abd")));
        studentRepository.findById(id).map((student1 -> {return new Student(student1.getName(), student1.id);})).filter(student -> student.getAge().equals(4));


    }



}
