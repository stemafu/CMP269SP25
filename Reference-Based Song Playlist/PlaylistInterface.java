
public interface PlaylistInterface {
	
	/**
	 * This method is used to add the given song to the playlist.
	 * If the given song is null, we throw NullPointerException
	 * 
	 * 
	 */
	public void add(Song song) throws NullPointerException;

	
	/**
	 * This method is used to add the given song to the playlist.
	 * If the given song is null, we throw NullPointerException
	 * 
	 * 
	 */
	public void add(Song song, int index) throws NullPointerException;
		
	
	
	/**
	 * This method removes and returns a song from the playlist based on
	 * the given title. If there multiple songs with the same
	 * title, you remove and the return the first song with the
	 * title.
	 * 
	 * If the playlist is empty, you return null.
	 */
	public Song remove(String title);
	
	
	/**
	 * This method removes and returns a song from the playlist based on
	 * the given index. If there multiple songs with the same
	 * title, you remove and the return the first song with the
	 * title.
	 * 
	 * If the playlist is empty, you return null.
	 */
	public Song remove(int index);	
	
	/**
	 * This method returns true if the playlist is empty.
	 * Otherwise it return false.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * This return the total number of songs that are
	 * currently in the playlist.
	 * @return
	 */
	public int size();
	
	/**
	 * This method is used to add the given song to front of
	 * the playlist. It makes this song to be the first in the playlist.
	 * @param song
	 */
	public void addToFront(Song song) throws NullPointerException;
	
	/**
	 * This method is used to add the given song to the back of
	 * the playlist. It makes this song to be the last in the playlist.
	 * @param song
	 */
	public void addToBack(Song song) throws NullPointerException;
	
	/**
	 * Removes all the songs from the playlist.
	 */
	public void removeAll();
	
	/**
	 * This method returns the song at the given index
	 * 
	 * throws IndexOutOfBoundsException if the index is invalid
	 */
	public Song get(int index) throws IndexOutOfBoundsException;
		

}
