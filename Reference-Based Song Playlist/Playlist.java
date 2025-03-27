
public class Playlist implements PlaylistInterface{
	
	
	
	
	private int numSongs;
	private Song firstSong;
	private Song lastSong;
	
	public Playlist() {
		this.numSongs = 0;
		this.firstSong = null;
		this.lastSong = null;
	}

	@Override
	public void add(Song song) throws NullPointerException {
		this.addToBack(song);
	}

	@Override
	public void add(Song song, int index) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Song remove(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Song remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return (this.numSongs == 0);
	}

	@Override
	public int size() {
		return this.numSongs;
	}

	@Override
	public void addToFront(Song song) throws NullPointerException {
		if(song == null) {
			throw new NullPointerException("song cannot be null");
		}else {
			
			if(this.isEmpty()) {
				this.firstSong = song;
				this.lastSong = song;
				this.numSongs++;
			}else {
				song.setNext(firstSong);
				this.firstSong = song;
				this.numSongs++;
			}
		}
		
	}

	@Override
	public void addToBack(Song song) throws NullPointerException{
		if(song == null) {
			throw new NullPointerException("song cannot be null");
		}else {
			if(this.isEmpty()) {
				this.firstSong = song;
				this.lastSong = song;
				this.numSongs++;
			}else {
				this.lastSong.setNext(song);
				this.lastSong = song;
				this.numSongs++;
			}
		}
	}

	@Override
	public Song get(int index) throws IndexOutOfBoundsException{
		
		// check for parameter
		if(index < 0 || index >= this.numSongs) {
			throw new IndexOutOfBoundsException("invalid index");
		}else {
			Song current = this.firstSong;
			int currentIndex = 0;
			
			while(currentIndex != index) {
				current = current.getNext();
				currentIndex++;
			}
			
			return current;
		}
	
	}
	@Override
	public void removeAll() {
		this.firstSong = null;
		this.lastSong = null;
		this.numSongs = 0;
	}

}
