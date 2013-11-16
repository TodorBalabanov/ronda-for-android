package eu.tbsoft.ronda.game;

import eu.tbsoft.ronda.dummy.SDL_Surface;

public class bonus_t {
	bonus_type_t type;
	
	/** 
	 * bonus text 
	 */
	SDL_Surface surf; 
	
	/** 
	 * the card concerned with the Ronda/Tringla 
	 */
	short bonus_card; 
	
	/** 
	 * bonus displayed ? 
	 */
	boolean bonus_shown; 
	
	int show_frames;
}
