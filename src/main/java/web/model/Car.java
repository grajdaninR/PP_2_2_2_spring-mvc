package web.model;

public class Car {
    String nameModel;
    String color;
    int series;

    public Car() {
    }

    public Car(String nameModel, String color, int series) {
        this.nameModel = nameModel;
        this.color = color;
        this.series = series;
    }

    public String getNameModel() {
        return nameModel;
    }

    public String getColor() {
        return color;
    }

    public int getSeries() {
        return series;
    }
}
