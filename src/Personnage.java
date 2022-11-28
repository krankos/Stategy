public abstract class Personnage {
    StrategieCombat st;

    public Personnage(StrategieCombat st) {
        this.st = st;
    }

    public abstract void faireCombat();
}
