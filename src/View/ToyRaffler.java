package View;

import Presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class ToyRaffler {
    private Presenter presenter;
    private Scanner sc;

    public ToyRaffler() {
        this.presenter = new Presenter();
        this.sc = new Scanner(System.in);
    }

    public void strt() throws IOException {
        boolean finish = true;
        while (finish){
            System.out.printf(Menu.menu);
            System.out.println(Messanger.MENU);
            String menu = sc.nextLine();
            switch (menu){
                case "1":
                    System.out.println(Messanger.ALLTOYS);
                    presenter.allToys();
                    System.out.println(Messanger.ENTER2);
                    break;

                case "2":
                    System.out.println(Messanger.ADDTOYS);
                    System.out.println(Messanger.ADDTOYSNAME);
                    String name = sc.nextLine();
                    System.out.println(Messanger.ADDTOYSPROBLEY);
                    int probability = Integer.parseInt(sc.nextLine());
                    presenter.addToyes(name, probability);
                    System.out.println(Messanger.ENTER);
                    break;

                case "3":
                    System.out.println(Messanger.CHANGETOYSNAME);
                    String namechange = sc.nextLine();
                    System.out.println(Messanger.CHANGETOYS);
                    int probabilitychange = Integer.parseInt(sc.nextLine());
                    presenter.changeToyes(namechange, probabilitychange);
                    System.out.println(Messanger.ENTER);
                    break;

                case "4":
                    System.out.println(Messanger.RAFFLERTOYS);
                    System.out.println(Messanger.ADDTOYSPROBLEY);
                    int probabilitywin = Integer.parseInt(sc.nextLine());
                    presenter.winToys(probabilitywin);
                    System.out.println(Messanger.ENTER2);
                    System.out.println(Messanger.WINTOYSLIST);
                    presenter.winallToys();
                    System.out.println(Messanger.ENTER2);
                    break;

                case "5":
                    System.out.println(Messanger.ENTER2);
                    System.out.println(Messanger.WINTOYSLIST);
                    presenter.winallToys();
                    System.out.println(Messanger.ENTER);
                    System.out.println(Messanger.ENTER2);
                    break;
                case "6":
                    System.out.println(Messanger.GETTOYS);
                    presenter.getWinerToys();
                    System.out.println(Messanger.ENTER2);
                    break;
                case "7":
                    finish = false;
                    return;
            }



            }
        }

}
