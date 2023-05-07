package org.dstu.domain;

public abstract class Person implements IUniversityPerson {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("First Name: ");
        builder.append(firstName);
        builder.append(" | Middle Name: ");
        builder.append(middleName);
        builder.append(" | Last Name: ");
        builder.append(lastName);
        return builder.toString();
    }
}
