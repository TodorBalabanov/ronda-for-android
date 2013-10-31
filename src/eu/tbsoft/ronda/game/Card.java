package eu.tbsoft.ronda.game;

import eu.tbsoft.ronda.dummy.SDL_Rect;
import eu.tbsoft.ronda.dummy.SDL_Surface;

public class Card {
	/** 
	 * sprite of the card 
	 */
	SDL_Surface surf;  
	
	/** 
	 * position on the screen 
	 */
	SDL_Rect position; 
	
	/** 
	 * value of the card
	 */
	CardNum value;  
}
