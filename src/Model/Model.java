package Model;

import java.io.IOException;
import java.util.List;

public class Model {
    private ToysGet toysGet;

    public Model() {
        this.toysGet = new ToysGet("ShopToys");
    }

    public void addToyes(String name, int probability){
        toysGet.addToyes(name,probability);
    }

    public void changeToyes(String name, int probability){
        toysGet.changeToyes(name, probability);
    }

    public void allToys(){
        toysGet.allToys();
    }


    public List<Toys> winToys(int probability) {
        return toysGet.winToys(probability);
    }

    public void getWinerToys() throws IOException {
        toysGet.getWinerToys();
    }
    public void winallToys() {toysGet.winallToys();}
}
