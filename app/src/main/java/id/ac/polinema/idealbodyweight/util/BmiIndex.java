package id.ac.polinema.idealbodyweight.util;

public class BmiIndex {

    private int weight;
    private int height;
    private float index;

    public BmiIndex(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate() {
        return  weight / (height/100) * (height/100);
    }
}
