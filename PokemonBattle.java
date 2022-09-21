import java.util.Random;
import java.util.Scanner;

// ROUND TO 2 DECIMALS


public class PokemonBattle {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String rival;
        String self;
        double rivalHealth = (int) (Math.random()*20+40);
        // System.out.println(selfHealth);

        System.out.print("Enter your Pokemon's nickname: ");

        self = scan.nextLine();
        self = self.trim();

        System.out.print("Enter your rival Pokemon's nickname: ");

        rival = scan.nextLine();
        rival = rival.trim();

        // System.out.println(self + rival);

        System.out.printf("Your rival has chosen %s to fight, which has %f health.\n", rival, rivalHealth);

        do {
            AttackType attack = AttackType.values()[rand.nextInt(3)];
            System.out.println(rivalHealth);
            if (attack == AttackType.values()[0]) {
                int attackCount = 1 + (int)(Math.random()*2);
                double dmg = 1 + (Math.random()*5);
                double totalDmg = dmg*attackCount;
                rivalHealth -= totalDmg;
                System.out.printf("%s used %s and did %f damage.\nYour rival has %f health remaining.", self, attack, totalDmg, rivalHealth);
            } else if (attack == AttackType.values()[1]){
                double dmg = 2 + (Math.random()*9);
                double totalDmg = dmg;
                rivalHealth -= dmg;
                System.out.printf("%s used %s and did %f damage.\nYour rival has %f health remaining.", self, attack, totalDmg, rivalHealth);
            } else {
                double dmg = 7 + (Math.random()*2);
                double totalDmg = dmg;
                rivalHealth -= dmg;
                System.out.printf("%s used %s and did %f damage.\nYour rival has %f health remaining.", self, attack, totalDmg, rivalHealth);
            } 
        } while (rivalHealth >= 0);

    }
}
