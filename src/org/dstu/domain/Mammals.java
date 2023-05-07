package org.dstu.domain;

public class Mammals extends Animal {
    private String color;
    private float woolLength;
    
    private int hypoallergenic;

    public Mammals(String[] line) {
        super(line[1], Float.parseFloat(line[2]), Float.parseFloat(line[3]), line[4]);
        color = line[5];
        woolLength = Float.parseFloat(line[6]);
        hypoallergenic = Integer.parseInt(line[7]);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWoolLength() {
        return woolLength;
    }

    public void setWoolLength(float woolLength) {
        this.woolLength = woolLength;
    }

    public int getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(int hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Млекопитающее: ");
        builder.append(super.toString());
        builder.append(" | Окрас: ");
        builder.append(color);
        builder.append(" | Длина шерсти: ");
        builder.append(woolLength);
        builder.append(" | Гипоаллергенно: ");
        builder.append(hypoallergenic);
        return builder.toString();
    }
}
