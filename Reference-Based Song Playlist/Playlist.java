
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
	public void add(Song song, int index) throws NullPointerException, IndexOutOfBoundsException {
	
		if(index < 0 || index > this.numSongs) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		
		if(song == null) {
			throw new NullPointerException("Song cannot be null");
		}
		
		
		if(this.numSongs == index ) {
			this.addToBack(song);
		}else if(index == 0){
			this.addToFront(song);
		}else {
			
			Song current = this.firstSong;
			int currentIndex = 0;
			
			while(currentIndex != (index - 1)) {
				current = current.getNext();
				currentIndex++;
			}
			
			song.setNext(current.getNext());
			current.setNext(song);
			this.numSongs++;			
		}
		
	}

	@Override
	public Song remove(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Song remove(int index) {
		
		if(index < 0 || index >= this.numSongs) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		
		
		if(this.numSongs == 1) {
			Song removedSong = this.get(0);
			this.removeAll();
			return removedSong;
		}else if ((this.numSongs - 1) == index) {
			Song current = this.firstSong;
			int currentIndex = 0;
			
			while(currentIndex != (index - 1)) {
				current = current.getNext();
				currentIndex++;
			}
			
			
			Song removedSong = current.getNext();
			
			this.lastSong = current;
			this.lastSong.setNext(null);
			this.numSongs--;
			
			return removedSong;
			
		}else if (0 == index) {
			Song removedSong =	this.firstSong;
			
			this.firstSong = this.firstSong.getNext();
			this.numSongs--;
			
			return removedSong;
		}else {
			Song current = this.firstSong;
			Song previous = null;
			int currentIndex = 0;
			
			while(currentIndex != index) {
				previous = current;
				current = current.getNext();
				currentIndex++;
			}
			
			
			Song removedSong =	current;
			
			previous.setNext(current.getNext());
			this.numSongs--;
			return removedSong;
		}
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
