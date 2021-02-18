package ru.xcodeleon.spring.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Scool {
    private Properties contacts;
    private List<Course> courses;
    private Set<Teacher> teachers;
    private Map<Integer, Student> students;

    public Properties getContacts() {
        return contacts;
    }

    public void setContacts(Properties contacts) {
        this.contacts = contacts;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.format("IT школа %s предлагает учащимся %s курсов\n" +
               "Количество Учителей: %s\n " +
                "Количество Студентов: %s", contacts.get("name"), courses.size(), teachers.size(), students.size());
    }
}
