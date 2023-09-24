package Presenter;
import Model.Model;
import Model.Toys;

import java.io.IOException;
import java.util.List;

public class Presenter {
    private Model model;

    public Presenter() {
        this.model = new Model();
    }
    public void addToyes(String name, int probability){
        model.addToyes(name, probability);
    }

    public void changeToyes(String name, int probability){
        model.changeToyes(name, probability);
    }

    public void allToys(){
        model.allToys();
    }

    public List<Toys> winToys(int probability) {
        return model.winToys(probability);
    }

    public void getWinerToys() throws IOException {
        model.getWinerToys();
    }

    public void winallToys() {
        model.winallToys();
    }

}
