package ru.xcodeleon.hibernate.domains;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String fio;

    @Column
    private Date birthDate;

    @Column
    private Long score;

   // @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)


    public Student(int id, String fio, Date birthDate, Long score) {
        this.id = id;
        this.fio = fio;
        this.birthDate = birthDate;
        this.score = score;
    }

    public Student() {
    }
}
