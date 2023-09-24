package Model; // добаить ошибки

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ToysIS {
    public void addToyes(String name, int probability);
    public void changeToyes(String name, int probability);
    public List<Toys> winToys(int probability);

    public void getWinerToys() throws IOException;
    public void allToys();
    public void winallToys();

}

