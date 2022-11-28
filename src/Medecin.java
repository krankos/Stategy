public class Medecin extends Personnage {
    public Medecin(StrategieCombat sb) {
        super(sb);

    }

    public void faireCombat() {
        this.st.combattre();
    }
}
