package org.dstu.domain;

public class Student extends Person {
    private String group;
    private int course = 1;
    private String specialty;

    public Student() {
    }

    public Student(String[] line) {
        super(line[2], line[3], line[1]);
        group = line[4];
        course = Integer.parseInt(line[5]);
        specialty = line[6];
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Студент. ");
        builder.append(super.toString());
        builder.append(" | Специальность: ");
        builder.append(specialty);
        builder.append(" | Группа: ");
        builder.append(group);
        builder.append(" | Курс: ");
        builder.append(course);
        return builder.toString();
    }
}
