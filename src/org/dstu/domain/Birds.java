package org.dstu.domain;

public class Birds extends Animal {
    private String beakShape;
    private float wingLength;
    private String featherColor;

    public Birds(String[] line) {
        super(line[1], Float.parseFloat(line[2]), Float.parseFloat(line[3]), line[4]);
        beakShape = line[5];
        wingLength = Integer.parseInt(line[6]);
        featherColor = line[7];
    }

    public String getBeakShape() {
        return beakShape;
    }

    public void setBeakShape(String beakShape) {
        this.beakShape = beakShape;
    }

    public float getWingLength() {
        return this.wingLength;
    }

    public void setWingLength(int wingLength) {
        this.wingLength = wingLength;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Птица. ");
        builder.append(super.toString());
        builder.append(" | Форма клюва: ");
        builder.append(beakShape);
        builder.append(" | Длина крыла: ");
        builder.append(wingLength);
        builder.append(" | Цвет оперения: ");
        builder.append(featherColor);
        return builder.toString();
    }
}
