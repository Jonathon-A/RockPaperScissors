package rockpaperscissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.concurrent.*;

public class RockPaperScissors {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Welcome to Rock,Paper,Scissors");
        int points = 0;
        choose(points);
    }

    private static void choose(int points) throws IOException, InterruptedException {
        System.out.println("Your turn");
        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissors");
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        int choose = Integer.parseInt(input2.readLine());
        String choice = "";
        switch (choose) {
            case (1):
                System.out.println("");
                System.out.println("You picked Rock");
                choice = "r";
                compchoose(choice, points);
                break;
            case (2):
                System.out.println("");
                System.out.println("You picked Paper");
                choice = "p";
                compchoose(choice, points);
                break;
            case (3):
                System.out.println("");
                System.out.println("You picked Scissors");
                choice = "s";
                compchoose(choice, points);
                break;
            default:
                System.out.println("");
                System.out.println("Invalid choice");
                choose(points);
                break;
        }
    }

    private static void compchoose(String choice, int points) throws IOException, InterruptedException {
        Random rand = new Random();
        int compchoose = rand.nextInt(3);
        String compchoice = "";
        switch (compchoose) {
            case (0):
                compchoice = "r";
                game(choice, compchoice, points);
                break;
            case (1):
                compchoice = "p";
                game(choice, compchoice, points);
                break;
            case (2):
                compchoice = "s";
                game(choice, compchoice, points);
                break;
        }
    }

    private static void game(String choice, String compchoice, int points) throws IOException, InterruptedException {

        TimeUnit time = TimeUnit.SECONDS;
        long sleep = 1L;
        System.out.print("3 ");
        time.sleep(sleep);
        System.out.print("2 ");
        time.sleep(sleep);
        System.out.print("1 ");
        time.sleep(sleep);
        System.out.print("GO! ");
        System.out.println("");
        if ((choice == "r") && (compchoice == "r")) {
            System.out.println("Player - Rock                 Computer - Rock");
            System.out.println("    _______                       _______");
            System.out.println("---'   ____)                     (____   '---");
            System.out.println("      (_____)                   (_____)      ");
            System.out.println("      (_____)                   (_____)     ");
            System.out.println("      (____)                     (____)      ");
            System.out.println("---.__(___)                       (___)__.---");
            System.out.println("                    Draw");
            System.out.println("Player Points: " + points);
            choose(points);
        }
        if ((choice == "r") && (compchoice == "p")) {
            System.out.println("Player - Rock                Computer - Paper");
            System.out.println("    _______                      ________");
            System.out.println("---'   ____)                ____(____    '---");
            System.out.println("      (_____)              (______           ");
            System.out.println("      (_____)              (_______          ");
            System.out.println("      (____)                (_______         ");
            System.out.println("---.__(___)                  (__________.---");
            System.out.println("             Computer Wins");
            System.out.println("Player Points: " + points);
            end(points);
        }
        if ((choice == "r") && (compchoice == "s")) {
            System.out.println("Player - Rock             Computer - Scissors");
            System.out.println("    _______                       _______");
            System.out.println("---'   ____)                 ____(____   '---");
            System.out.println("      (_____)               (______          ");
            System.out.println("      (_____)              (__________       ");
            System.out.println("      (____)                     (____)      ");
            System.out.println("---.__(___)                       (___)__.---");
            System.out.println("               Player Wins");
            points++;
            System.out.println("Player Points: " + points);
            choose(points);
        }
        if ((choice == "p") && (compchoice == "r")) {
            System.out.println("Player - Paper                Computer - Rock");
            System.out.println("    ________                      _______");
            System.out.println("---'    ____)____                (____   '---");
            System.out.println("           ______)              (_____)      ");
            System.out.println("          _______)              (_____)     ");
            System.out.println("         _______)                (____)      ");
            System.out.println("---.__________)                   (___)__.---");
            System.out.println("                   Player Wins");
            points++;
            System.out.println("Player Points: " + points);
            choose(points);
        }
        if ((choice == "p") && (compchoice == "p")) {
            System.out.println("Player - Paper               Computer - Paper");
            System.out.println("    ________                     ________");
            System.out.println("---'    ____)____           ____(____    '---");
            System.out.println("           ______)         (______           ");
            System.out.println("          _______)         (_______          ");
            System.out.println("         _______)           (_______         ");
            System.out.println("---.__________)              (__________.---");
            System.out.println("                    Draw");
            System.out.println("Player Points: " + points);
            choose(points);
        }
        if ((choice == "p") && (compchoice == "s")) {
            System.out.println("Player - Paper            Computer - Scissors");
            System.out.println("    ________                      _______");
            System.out.println("---'    ____)____            ____(____   '---");
            System.out.println("           ______)          (______          ");
            System.out.println("          _______)         (__________       ");
            System.out.println("         _______)                (____)      ");
            System.out.println("---.__________)                   (___)__.---");
            System.out.println("                 Computer Wins");
            end(points);
        }
        if ((choice == "s") && (compchoice == "r")) {
            System.out.println("Player - Scissors             Computer - Rock");
            System.out.println("    _______                       _______");
            System.out.println("---'   ____)____                 (____   '---");
            System.out.println("          ______)               (_____)      ");
            System.out.println("       __________)              (_____)     ");
            System.out.println("      (____)                     (____)      ");
            System.out.println("---.__(___)                       (___)__.---");
            System.out.println("                Computer Wins");
            System.out.println("Player Points: " + points);
            end(points);
        }
        if ((choice == "s") && (compchoice == "p")) {
            System.out.println("Player - Scissors            Computer - Paper");
            System.out.println("    _______                      ________");
            System.out.println("---'   ____)____            ____(____    '---");
            System.out.println("          ______)          (______           ");
            System.out.println("       __________)         (_______          ");
            System.out.println("      (____)                (_______         ");
            System.out.println("---.__(___)                   (__________.---");
            System.out.println("               Player Wins");
            points++;
            System.out.println("Player Points: " + points);
            choose(points);
        }
        if ((choice == "s") && (compchoice == "s")) {
            System.out.println("Player - Scissors         Computer - Scissors");
            System.out.println("    _______                       _______");
            System.out.println("---'   ____)____             ____(____   '---");
            System.out.println("          ______)           (______          ");
            System.out.println("       __________)         (__________       ");
            System.out.println("      (____)                     (____)      ");
            System.out.println("---.__(___)                       (___)__.---");
            System.out.println("                    Draw");
            System.out.println("Player Points: " + points);
            choose(points);
        }
    }

    private static void end(int points) throws IOException, InterruptedException {
        double chance = 2;
        if (points != 0) {
            chance = (Math.pow(2, points));
        }
        System.out.println("");
        System.out.println("GAME OVER!");
        System.out.println("You scored " + points + " points.");
        System.out.println("You had a 1/" + (int) chance + " of achieving this score.");

    }
}
