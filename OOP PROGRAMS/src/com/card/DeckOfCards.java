package com.card;

import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        String[][] deck = generateDeck();
        shuffleDeck(deck);

        String[][] playerCards = distributeCards(deck, 4, 9);

        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards: " + Arrays.toString(playerCards[i]));
        }
    }

    private static String[][] generateDeck() {
        String[][] deck = new String[SUITS.length * RANKS.length][2];
        int index = 0;

        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index][0] = suit;
                deck[index][1] = rank;
                index++;
            }
        }

        return deck;
    }

    private static void shuffleDeck(String[][] deck) {
        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            String[] temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    private static String[][] distributeCards(String[][] deck, int numPlayers, int cardsPerPlayer) {
        String[][] playerCards = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                playerCards[j][i] = deck[cardIndex][0] + " " + deck[cardIndex][1];
                cardIndex++;
            }
        }

        return playerCards;
    }
}
