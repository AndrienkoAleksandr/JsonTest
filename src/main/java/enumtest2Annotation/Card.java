package enumtest2Annotation;

import com.google.gson.annotations.SerializedName;

public class Card {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        if(suit == null) suit = Suit.UNKNOWN;
        return suit;
    }

    public enum Suit {
        @SerializedName("hearts") HEARTS,
        @SerializedName("diamonds") DIAMONDS,
        @SerializedName("clubs") CLUBS,
        @SerializedName("spades") SPADES,
        UNKNOWN
    }
}