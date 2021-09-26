package CoreHW3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> boxList = new ArrayList<>();

    public ArrayList<T> getList() {
        return boxList;
    }
    public void setList(ArrayList<T> list) {
        this.boxList = list;
    }

    public void addFruit(T fruit) {
        boxList.add(fruit);
    }

    public float getWeight() {
        float boxWeight = boxList.size() * boxList.get(0).weight;
        return boxWeight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void fillFromOneBoxToAnother(Box<T> box) {
        this.boxList.addAll(box.boxList);
        box.boxList.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxList=" + boxList +
                '}';
    }
}
