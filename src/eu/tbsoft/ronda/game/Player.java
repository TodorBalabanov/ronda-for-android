package eu.tbsoft.ronda.game;

public class Player {
	Card hand[MAX_NB_CARDS_HAND];
	
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
