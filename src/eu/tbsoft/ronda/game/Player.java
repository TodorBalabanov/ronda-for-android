package eu.tbsoft.ronda.game;

import eu.tbsoft.ronda.dummy.SDL_Rect;
import eu.tbsoft.ronda.dummy.SDL_Surface;

public class Player {
	private static final int MAX_BONUS = 3;

	Card hand[] = new Card[Define.MAX_NB_CARDS_HAND];
	
	int nb_cards_in_hand;
	
	ScoreT score;
	
	SDL_Surface score_box;
	
	SDL_Rect pos_score_box;
	
	/**
	 *  este/mesa
	 */
	BonusT action_bonus[] = new BonusT[MAX_BONUS]; 
	
	BonusT card_bonus;
	
	TypeT type;
	
	/** 
	 * selected hand index 
	 */
	short sel_hand; 
	
	/**
	 *  selected table index 
	 */
	short sel_table;    
}
