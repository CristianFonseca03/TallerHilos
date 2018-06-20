
public class Run {

    public static void main(String[] args) {
        Ventana vn = new Ventana();
        vn.setVisible(true);
        Game g1 = new Game(vn.getJL1());
        Game g2 = new Game(vn.getJL2());
        Game g3 = new Game(vn.getJL3());
        vn.recibirGames(g1, g2, g3);
        Thread th1 = new Thread(g1);
        Thread th2 = new Thread(g2);
        Thread th3 = new Thread(g3);
        th1.start();
        th2.start();
        th3.start();
    }
}
