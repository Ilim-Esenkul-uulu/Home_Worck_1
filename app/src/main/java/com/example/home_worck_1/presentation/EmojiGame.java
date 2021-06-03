package com.example.home_worck_1.presentation;

import com.example.home_worck_1.domain.Card;
import com.example.home_worck_1.domain.Game;

import java.util.ArrayList;
import java.util.List;

public class EmojiGame {
        private Game<String> game;

        public EmojiGame(){
            List<String> cardContent = new ArrayList<>();
            cardContent.add("\uD83D\uDC12");
            cardContent.add("\uD83D\uDC3A");
            cardContent.add("\uD83D\uDC38");
            game = new Game<>(cardContent);
        }
        public void cardClick(Card<String> card){
            game.cardClick(card);
        }
        public List<Card<String>> getCards(){
            return game.getCards();
        }
}


   