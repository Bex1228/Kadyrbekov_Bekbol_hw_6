public class Boss  extends GameEntity{

    private Weapon weapon;


    public Boss( String name, int health, int damage, Weapon weapon) {
        super();
        setName(name);

        setHealth(health);

        setDamage(damage);

        this.weapon = weapon;

    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Weapon getWeapon() {
        return weapon;
    }



    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon() {
        this.weapon = weapon;
    }

    }


