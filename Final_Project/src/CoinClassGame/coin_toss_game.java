package CoinClassGame;

import java.util.Scanner;

public class coin_toss_game {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        coin_toss_game game = new coin_toss_game();
        String player_name = game.ask_player_name();
        player player1 = new player(player_name);

        player1.setGuess(game.ask_guess());

        player player2 = new player(game.ask_player_name());
        if (player1.getGuess().equalsIgnoreCase(coin_class.HEADS)) {
            player2.setGuess(coin_class.TAILS);
        }else {
            player2.setGuess(coin_class.HEADS);
        }

        System.out.println("Flipping the coin ... ");
        coin_class coin = new coin_class();
        coin.flip();

        System.out.println("The coin landed on " + coin.getSide());

        game.determine_the_winner(player1, player2, coin);
        game.scanner.close();
    }
    public String ask_player_name(){
        System.out.println("What's your name ?");
        String name = scanner.next();
        return name;
    }

    public String ask_guess(){
        String prompt = String.format("%s or %s",coin_class.HEADS, coin_class.TAILS);
        System.out.println(prompt);
        String guess = scanner.next();

        while(!guess.equalsIgnoreCase(coin_class.HEADS) && !guess.equalsIgnoreCase(coin_class.TAILS)){
            System.out.println("Invalid guess. Try again. " + prompt);
            guess = scanner.nextLine();
       }
        return guess;
    }

    public void determine_the_winner(player player1, player player2, coin_class coin){
        String winner;
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            winner = player1.getName();
        }else {
            winner = player2.getName();
        }

        System.out.println("The winner is " + winner);
    }

}
