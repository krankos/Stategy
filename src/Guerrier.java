public class Guerrier extends Personnage {
    public Guerrier(StrategieCombat sb) {
        super(sb);
    }

    public void faireCombat() {
        this.st.combattre();
    }
}
