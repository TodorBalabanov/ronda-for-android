package eu.tbsoft.ronda.game;

import java.io.File;
import java.util.Random;

import eu.tbsoft.ronda.dummy.SDL_Surface;

/**
 * 
 */
public class common {
	/**
	 * 
	 */
	private static Random prng = new Random();

	/**
	 * 
	 */
	public static SDL_Surface back_card;

	/**
	 * 
	 */
	public static SDL_Surface empty_card;

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int rand_a_b(int a, int b) {
		return (prng.nextInt((b) - (a)) + (a));
	}

	/**
	 * 
	 * @param x
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean between(int x, int a, int b) {
		return (((x) >= (a)) && ((x) <= (b)));
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean equal(card_num a, card_num b) {
		return (((a.ordinal()) % 10) == ((b.ordinal()) % 10));
	}

	/**
	 * 
	 * @param msg
	 * @param file
	 * @param line
	 */
	public static void sdl_error(String msg, File file, String line) {

	}

	/**
	 * 
	 * @param msg
	 * @param file
	 * @param line
	 */
	public static void sdl_image_error(String msg, File file, String line) {

	}

	/**
	 * 
	 * @param msg
	 * @param file
	 * @param line
	 */
	public static void sdl_ttf_error(String msg, File file, String line) {

	}

	/**
	 * 
	 * @param size
	 * @return
	 */
	public static Object try_malloc(int size) {
		return null;
	}

	/**
	 * 
	 * @param n
	 * @param size
	 * @return
	 */
	public static Object try_calloc(int n, int size) {
		return null;
	}

	/**
	 * 
	 * @param ptr
	 * @param size
	 * @return
	 */
	public static Object try_realloc(Object ptr, int size) {
		return null;
	}

	/**
	 * 
	 * @param ptr
	 */
	public static void try_free(Object ptr) {
	}

	/**
	 * 
	 * @param surf
	 */
	public static void free_surface(SDL_Surface surf) {
	}

	/**
	 * reports error and ends the program, shouldn't be called directly reserved
	 * for use by other error functions
	 * 
	 * @param file
	 * @param line
	 * @param format
	 * @param arguments
	 */
	public static void error(String file, int line, String format,
			Object... arguments) {
	}

	/**
	 * malloc with error handling
	 * 
	 * @param size
	 * @param file
	 * @param line
	 * @return
	 */
	public static Object malloc_(int size, String file, int line) {
		return null;
	}

	/**
	 * calloc with error handling
	 * 
	 * @param n
	 * @param size
	 * @param file
	 * @param line
	 * @return
	 */
	public static Object calloc_(int n, int size, String file, int line) {
		return null;
	}

	/**
	 * realloc with error handling
	 * 
	 * @param ptr
	 * @param size
	 * @param file
	 * @param line
	 * @return
	 */
	public static Object realloc_(Object ptr, int size, String file, int line) {
		return null;
	}

	/**
	 * swaps contents of a and b
	 * 
	 * @param a
	 * @param b
	 */
	public static void swap(card_num a, card_num b) {
	}

	/**
	 * checks if value exists in tab
	 * 
	 * @param tab
	 * @param size
	 * @param value
	 * @return
	 */
	public static int exist(card tab[], int size, card_num value) {
		return 0;
	}

	/**
	 * checks if tab is empty
	 * 
	 * @param tab
	 * @param size
	 * @return
	 */
	public static boolean empty(card tab[], int size) {
		return false;
	}

	/**
	 * returns path to file representing the card n
	 * 
	 * @param n
	 * @return
	 */
	public static String get_card_file(card_num n) {
		return null;
	}

	/**
	 * reports error in stderr and terminates the program
	 * 
	 * @param file
	 * @param line
	 * @param msg
	 */
	public static void general_error(String file, int line, String msg) {
	}

	/**
	 * sets card attributes given in parameters
	 * 
	 * @param c
	 * @param num
	 * @param posx
	 * @param posy
	 * @param back
	 */
	public static void set_card(card c, card_num num, int posx, int posy,
			boolean back) {
	}

	/**
	 * checks if max_frames has passed
	 * 
	 * @param max_frames
	 * @param nb_frames
	 * @return
	 */
	public static boolean passed(int max_frames, Integer nb_frames) {
		return false;
	}

	/**
	 * loads image specified by path
	 * 
	 * @param path
	 * @param file
	 * @param line
	 * @return
	 */
	public static SDL_Surface load_image(String path, String file, int line) {
		return null;
	}

	/**
	 * returns text surface
	 * 
	 * @param font_name
	 * @param size
	 * @param text
	 * @param r
	 * @param g
	 * @param b
	 * @return
	 */
	public static SDL_Surface set_text_surf(String font_name, int size,
			String text, int r, int g, int b) {
		return null;
	}

	/**
	 * displays text "txt" on the screen, position specified by posx, posy
	 * 
	 * @param font
	 * @param size
	 * @param txt
	 * @param posx
	 * @param posy
	 * @param r
	 * @param g
	 * @param b
	 * @param scr
	 */
	public static void show_text(String font, int size, String txt, int posx,
			int posy, int r, int g, int b, SDL_Surface scr) {
	}

	/**
	 * displays text set in "txt" in white color using show_text()
	 * 
	 * @param font
	 * @param size
	 * @param txt
	 * @param posx
	 * @param posy
	 * @param scr
	 */
	public static void show_white_text(String font, int size, String txt,
			int posx, int posy, SDL_Surface scr) {
	}
}
