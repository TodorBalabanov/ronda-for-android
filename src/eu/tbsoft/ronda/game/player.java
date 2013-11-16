package eu.tbsoft.ronda.game;

import eu.tbsoft.ronda.dummy.SDL_Rect;
import eu.tbsoft.ronda.dummy.SDL_Surface;

public class player {
	private static final int MAX_BONUS = 3;

	card hand[] = new card[define.MAX_NB_CARDS_HAND];
	
	int nb_cards_in_hand;
	
	score_t score;
	
	SDL_Surface score_box;
	
	SDL_Rect pos_score_box;
	
	/**
	 *  este/mesa
	 */
	bonus_t action_bonus[] = new bonus_t[MAX_BONUS]; 
	
	bonus_t card_bonus;
	
	type_t type;
	
	/** 
	 * selected hand index 
	 */
	short sel_hand; 
	
	/**
	 *  selected table index 
	 */
	short sel_table;    
}
