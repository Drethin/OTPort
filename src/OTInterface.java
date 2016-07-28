import java.util.Scanner;

/**
 * Created by Alex on 2016-07-27.
 *
 * Interfaces with user, prints and gets text.
 */
public class OTInterface {
    Scanner scanner;

    public OTInterface(){
        scanner = new Scanner(System.in);
    }

    private void intro(){
        System.out.print("\n\nTHIS PROGRAM SIMULATES A TRIP OVER THE OREGON TRAIL FROM\n" +
                "INDEPENDENCE, MISSOURI TO OREGON CITY, OREGON IN 1847.\n" +
                "YOUR FAMILY OF FIVE WILL COVER THE 2000 MILE OREGON TRAIL\n" +
                "IN 5-6 MONTHS --- IF YOU MAKE IT ALIVE.\n" +
                "\n" +
                "YOU HAD SAVED $900 TO SPEND FOR THE TRIP, AND YOU'VE JUST\n" +
                "   PAID $200 FOR A WAGON.\n" +
                "YOU WILL NEED TO SPEND THE REST OF YOUR MONEY ON THE\n" +
                "   FOLLOWING ITEMS:\n" +
                "\n" +
                "     OXEN - YOU CAN SPEND $200-$300 ON YOUR TEAM\n" +
                "            THE MORE YOU SPEND, THE FASTER YOU'LL GO\n" +
                "               BECAUSE YOU'LL HAVE BETTER ANIMALS\n" +
                "\n" +
                "     FOOD - THE MORE YOU HAVE, THE LESS CHANCE THERE\n" +
                "               IS OF GETTING SICK\n" +
                "\n" +
                "     AMMUNITION - $1 BUYS A BELT OF 50 BULLETS\n" +
                "            YOU WILL NEED BULLETS FOR ATTACKS BY ANIMALS\n" +
                "               AND BANDITS, AND FOR HUNTING FOOD\n" +
                "     CLOTHING - THIS IS ESPECIALLY IMPORTANT FOR THE COLD\n" +
                "               WEATHER YOU WILL ENCOUNTER WHEN CROSSING\n" +
                "               THE MOUNTAINS\n" +
                "\n" +
                "     MISCELLANEOUS SUPPLIES - THIS INCLUDES MEDICINE AND\n" +
                "               OTHER THINGS YOU WILL NEED FOR SICKNESS\n" +
                "               AND EMERGENCY REPAIRS\n" +
                "\n\n" +
                "YOU CAN SPEND ALL YOUR MONEY BEFORE YOU START YOUR TRIP -\n" +
                "OR YOU CAN SAVE SOME OF YOUR CASH TO SPEND AT FORTS ALONG\n" +
                "THE WAY WHEN YOU RUN LOW.  HOWEVER, ITEMS COST MORE AT\n" +
                "THE FORTS.  YOU CAN ALSO GO HUNTING ALONG THE WAY TO GET\n" +
                "MORE FOOD.\n" +
                "WHENEVER YOU HAVE TO USE YOUR TRUSTY RIFLE ALONG THE WAY,\n" +
                "YOU WILL SEE THE WORDS: TYPE BANG.  THE FASTER YOU TYPE\n" +
                "IN THE WORD 'BANG' AND HIT THE 'RETURN' KEY, THE BETTER\n" +
                "LUCK YOU'LL HAVE WITH YOUR GUN.\n" +
                "\n" +
                "WHEN ASKED TO ENTER MONEY AMOUNTS, DON'T USE A '$'.\n" +
                "\n" +
                "GOOD LUCK!!!");
    }

}

