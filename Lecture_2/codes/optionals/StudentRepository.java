package testing3;

import testing.Student;

import java.util.Optional;

public class StudentRepository {

    public Optional<Student1> findById(Long id){
        return Optional.ofNullable(new Student1());
    }


}
