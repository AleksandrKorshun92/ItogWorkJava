package Model;

public class Toys implements Comparable<Toys>{
    private int id;
    private String name;
    private int probability;

    public Toys(int id, String name, int probability) {
        this.id = id;
        this.name = name;
        this.probability = probability;
    }

    public int getId() {
        return id;
    }

   public void setProbability(int probability) {
        this.probability = probability;
    }

    public String getName() {
        return name;
    }


    public int getProbability() {
        return probability;
    }

    public String toString(){
    return id + " " + "Название игрушки: " + name + " " + "вероятность выигрыша которой составляет " + probability + " %";
    }

    public String toStringWin(){
        return "Название игрушки: " + name;
    }

    @Override
    public int compareTo(Toys other) {
        return Integer.compare(this.id,other.id);
    }
}
