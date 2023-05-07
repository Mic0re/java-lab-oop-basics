package org.dstu.domain;

public abstract class Animal implements IZoo {
    private String name;
    private float weight;
    private float height;

    private String variety;

    public Animal() {
    }

    public Animal(String name, float weight, float height, String variety) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.variety = variety;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Кличка: ");
        builder.append(name);
        builder.append(" | Вес: ");
        builder.append(weight);
        builder.append(" | Рост: ");
        builder.append(height);
        builder.append(" | Вид: ");
        builder.append(variety);
        return builder.toString();
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
