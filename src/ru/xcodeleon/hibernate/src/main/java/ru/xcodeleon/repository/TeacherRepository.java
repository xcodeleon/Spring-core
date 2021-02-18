package ru.xcodeleon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.xcodeleon.hibernate.domains.Teacher;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {


    Teacher findByFio(String fio);
}
