package Enemies;

public abstract class Enemy {
    private int hP;

    public Enemy(int hP){
        this.hP = hP;
    }

    public int gethP() {
        return hP;
    }
    public void takeDamage(int damage){
        this.hP -= damage;
    }
}
