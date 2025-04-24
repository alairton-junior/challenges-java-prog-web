package repetition;

import java.util.Scanner;

// In an election with three candidates, create a Java program that asks for the total number of voters.
// Each voter casts a vote via keyboard.
// At the end, show the number of votes each candidate received.

public class Ex13_ElectionVotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int voters; //
        int counter = 1;
        int votesC1 = 0;
        int votesC2 = 0;
        int votesC3 = 0;
        int vote;

        System.out.println("========== Election Votes =========");
        System.out.println("Enter the number of people you want to vote: ");
        voters = sc.nextInt();

        while(counter <= voters) {
            System.out.println("========== Cadidates =========");
            System.out.println("Enter 1 to voter in Alairton Junior.");
            System.out.println("Enter 2 to voter in Jamyle Layla.");
            System.out.println("Enter 3 to voter in Isabelle Reinbold.");
            System.out.printf("\n Voter Number %s \n Enter Your Choice : ", counter);

            vote = sc.nextInt();
            if(vote == 1) {
                votesC1++;

                counter++;
            } else if(vote == 2) {
                votesC2++;

                counter++;
            } else if(vote == 3) {
                votesC3++;

                counter++;
            } else {
                System.out.println("You have entered an invalid choice. Try Again");
            }

        }

        System.out.println("========== Result of Election =========");
        System.out.printf("Total Votes: %d\n", voters);
        System.out.printf("Number of votes for Alairton: %d\n", votesC1);
        System.out.printf("Number of votes for Jamyle Layla: %d\n", votesC2);
        System.out.printf("Number of votes for Isabelle: %d\n", votesC3);

        if(votesC1 > votesC2 && votesC1 > votesC3) {
            System.out.println("Candidate Alairton won the election");
        } else if(votesC2 > votesC1 && votesC2 > votesC3) {
            System.out.println("Candidate Jamyle Layla won the election");
        } else if(votesC3 > votesC1 && votesC3 > votesC2) {
            System.out.println("Candidate Isabelle Reinbold won the election");
        } else {
            System.out.println("Tie in the election");
        }
    }
}
