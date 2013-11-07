package eu.tbsoft.ronda.game;

import eu.tbsoft.ronda.dummy.SDL_Event;

/**
 * 
 */
public class ControllerData {
	/**
	 * 
	 */
	boolean exit;
	
	/**
	 * 
	 */
	int selected_card_hand;
	
	/**
	 * 
	 */
	int selected_card_table;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static public boolean valid_card_hand(int x, int y) {
		return(false);
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static public boolean valid_card_table(int x, int y) {
		return(false);
	}
	
	/**
	 * Returns index of the selected card in the screen (user hand).
	 * 
	 * @param x
	 * @return
	 */
	static public int get_selected_hand(int x){
		return(0);
	}
	
	/**
	 * Returns index of the selected card in the screen (table). 
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	static int get_selected_table(int x, int y) {
		return(0);
	}
	
	/**
	 * Static factory method.
	 * 
	 * @return New instance.
	 */
	static public ControllerData controller_data_init() {
		return(null);
	}

	/**
	 * 
	 */
	public void set_default_values() {
	}
	
	/**
	 * 
	 * @param event
	 */
	public void treat_mouse_click_event(SDL_Event event) {
	}

	/**
	 * 
	 */
	public void controller_data_update() {
	}
}
