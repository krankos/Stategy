public class App {
    public static void main(String[] args) throws Exception {
        Guerrier g = new Guerrier(new CombattreX2());
        g.faireCombat();
        Medecin m = new Medecin(new CombattreX1());
        m.faireCombat();
    }
}
