public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponName(" TESLAGUN");
        bossWeapon.setWeaponType(WeaponType.ELECTRIC);

        Boss boss = new Boss( "MEDUSA" , 400, 75, bossWeapon);




        System.out.println(" Name : " + boss.getName());
        System.out.println(" Health : " + boss.getHealth());
        System.out.println(" Damage : " + boss.getDamage());
        System.out.println( " Weapon : " + bossWeapon.getWeaponName());



    }
}