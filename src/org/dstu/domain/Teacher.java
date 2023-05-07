package org.dstu.domain;

public class Teacher extends Person {
    private String chair;
    private String degree;
    private int stage = 0;

    public Teacher() {
    }

    public Teacher(String[] line) {
        super(line[2], line[3], line[1]);
        chair = line[4];
        degree = line[5];
        stage = Integer.parseInt(line[6]);
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Преподаватель: ");
        builder.append(super.toString());
        builder.append(" | Кафедра: ");
        builder.append(chair);
        builder.append(" | Степень: ");
        builder.append(degree);
        builder.append(" | Стаж: ");
        builder.append(stage);
        return builder.toString();
    }
}
