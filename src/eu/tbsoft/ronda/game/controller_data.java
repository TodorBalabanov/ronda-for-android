package eu.tbsoft.ronda.game;

import eu.tbsoft.ronda.dummy.SDL_Event;

/**
 * controller data structure
 */
public class controller_data {
	/**
	 * 
	 */
	public boolean exit;
	
	/**
	 * 
	 */
	public int selected_card_hand;
	
	/**
	 * 
	 */
	public int selected_card_table;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static private boolean valid_card_hand(int x, int y) {
		return(false);
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static private boolean valid_card_table(int x, int y) {
		return(false);
	}
	
	/**
	 * Returns index of the selected card in the screen (user hand).
	 * 
	 * @param x
	 * @return
	 */
	static private int get_selected_hand(int x){
		return(0);
	}
	
	/**
	 * Returns index of the selected card in the screen (table). 
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static private int get_selected_table(int x, int y) {
		return(0);
	}

	/**
	 * 
	 */
	static private void set_default_values() {
	}
	
	/**
	 * 
	 * @param event
	 */
	static public void treat_mouse_click_event(SDL_Event event) {
	}
	
	/**
	 * Static factory method.
	 * 
	 * @return New instance.
	 */
	static public controller_data controller_data_init() {
		return(null);
	}

	/**
	 * 
	 */
	static public void controller_data_update() {
	}
}
