import java.util.Random;
import java.util.Scanner;

// ROUND TO 2 DECIMALS


public class PokemonBattle {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String rival;
        String self;
        double rivalHealth = rand.nextInt(20) + 40;

        // System.out.println(selfHealth);

        System.out.print("Enter your Pokemon's nickname: ");

        self = scan.nextLine();
        self = self.trim();

        System.out.print("Enter your rival Pokemon's nickname: ");

        rival = scan.nextLine();
        rival = rival.trim();

        // System.out.println(self + rival);

        System.out.printf("Your rival has chosen %s to fight, which has %.2f health.\n", rival, round(rivalHealth));
        int turnCount = 0;

        do {

            turnCount += 1;
            AttackType attack = AttackType.values()[rand.nextInt(3)];

            // System.out.println(rivalHealth);

            if (attack == AttackType.values()[0]) {
                int attackCount = rand.nextInt(3) + 1;
                double dmg = round(rand.nextDouble() * 5.0 + 1.0);
                double totalDmg = dmg * attackCount;
                rivalHealth -= totalDmg;
                System.out.printf("%s used %s and did %.2f damage. ", self, attack, totalDmg);
                System.out.printf("Your rival has %.2f health remaining.\n", Math.max(rivalHealth, 0));
            } else if (attack == AttackType.values()[1]) {
                double dmg = round(rand.nextDouble() * 9.0 + 2.0);
                double totalDmg = dmg;
                rivalHealth -= dmg;
                System.out.printf("%s used %s and did %.2f damage. ", self, attack, totalDmg);
                System.out.printf("Your rival has %.2f health remaining.\n", Math.max(rivalHealth, 0));
            } else {
                double dmg = round(rand.nextDouble() * 2.0 + 7.0);
                double totalDmg = dmg;
                rivalHealth -= dmg;
                System.out.printf("%s used %s and did %.2f damage. ", self, attack, totalDmg);
                System.out.printf("Your rival has %.2f health remaining.\n", Math.max(rivalHealth, 0));
            }
        } while (rivalHealth >= 0);

        System.out.printf("%s fainted after %d turns!\n", rival, turnCount);

        double prize = round(2400 - rand.nextDouble() * 1200);

        System.out.printf("You have earned $%.2f!", round(prize));

    }
    public static double round(double number) {
        int tempNumber = (int) (number * 100);
        number = tempNumber / 100.0;
        return number;
    }
}
