package Model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToysGet implements ToysIS{
    public int id;
    private List<Toys> alltoys;
    private List<Toys> wintoys;
    public String nameMagazine;
    String path = "toys.json";
    public static String myFileName = "toysWin.json";

    public ToysGet(String nameMagazine) {
        this.alltoys = new ArrayList<>();
        this.nameMagazine = nameMagazine;
    }

    public ToysGet() {
        this.wintoys = new ArrayList<>();

    }
    public List<Toys> getWintoys() {
        return wintoys;
    }

   @Override
    public void addToyes(String name, int probability) {
        this.id = 1;
        int ids = new IdGenerator().getId();
        if(alltoys.size() == 0){
            alltoys.add(new Toys(id, name,  probability));

        } else {alltoys.add(new Toys(ids, name, probability));
        }
    }
    @Override
    public void changeToyes(String name, int probability) {
        for (Toys toy: alltoys) {
            if (toy.getName().equals(name)){
                toy.setProbability(probability);
            }
        }
    }

    @Override
    public List<Toys> winToys(int probability) {
        this.wintoys = new ArrayList<>();
        for (Toys win: alltoys) {
            if(win.getProbability()<=probability){
                wintoys.add(win);
            }
        }
        return wintoys;
    }

    @Override
    public void getWinerToys() throws IOException {
        Random rand = new Random();
        int winnerElement = rand.nextInt(wintoys.size());
        for (Toys toy : wintoys) {
            if (toy.getId() == winnerElement) {
                System.out.println(toy.toStringWin());
                String result_string = toy.getId() + System.lineSeparator() +
                        toy.getName() + System.lineSeparator() +
                        toy.getProbability() + System.lineSeparator();
                try {
                    File newtxt = new File(myFileName);
                    FileWriter fr = new FileWriter(newtxt);
                    BufferedWriter br = new BufferedWriter(fr);

                    br.write(result_string);
                    br.close();
                    fr.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
                wintoys.remove(toy);
            }
        }
    }

    @Override
    public void allToys() {
        for (Toys toy:alltoys) {
            System.out.println(toy.toString());
        }
    }

    @Override
    public void winallToys() {
        for (Toys toy:wintoys) {
            System.out.println(toy.toString());
        }
    }
}
