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
            

        } while (rivalHealth <= 0);


    
    }
}
